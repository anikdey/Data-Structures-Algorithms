package string;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public static void main(String[] args) {

        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};

        System.out.println(numUniqueEmails(emails));

//        String email = "test.email+alex@leetcode.com";
//        int index = email.indexOf("+");
//        System.out.println();
//        System.out.println(email.substring(0, index));
    }

    public static int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();

        for(String email : emails) {
            int indexOfAtTheRate = email.indexOf("@");
            String localPart = email.substring(0, indexOfAtTheRate);
            if(localPart.contains(".") && localPart.contains("+")) {
                localPart = localPart.substring(0, localPart.indexOf("+")).replaceAll("[.]", "");
                String newEmail = localPart + email.substring(indexOfAtTheRate);
                set.add(newEmail);
            } else if(localPart.contains("+")) {
                localPart = localPart.substring(0, localPart.indexOf("+"));
                String newEmail = localPart + email.substring(indexOfAtTheRate);
                set.add(newEmail);
            } else if(localPart.contains(".")) {
                localPart = localPart.replaceAll("[.]", "");
                String newEmail = localPart + email.substring(indexOfAtTheRate);
                set.add(newEmail);
            } else {
                set.add(email);
            }
        }

        return set.size();
    }

}
