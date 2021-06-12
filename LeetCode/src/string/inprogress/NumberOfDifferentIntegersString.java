package string.inprogress;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDifferentIntegersString {

    public static void main(String[] args) {
        System.out.println(numDifferentIntegers("a123bc34d8ef34"));
        System.out.println(numDifferentIntegers("a1b01c001"));
        System.out.println(numDifferentIntegers("leet1234code234"));
        System.out.println(numDifferentIntegers("167278959591294"));
    }

    public static int numDifferentIntegers(String word) {
        Set<Double> set = new HashSet<>();
        double sum = 0;
        boolean isRunningSequence = false;
        for(int i=0; i<word.length(); i++) {
            int currentChar = word.charAt(i) - 48;
            int df = currentChar;
            if(currentChar>=0 && currentChar<=9) {
                sum = sum * 10 + currentChar;
                isRunningSequence = true;
            } else {
                if(isRunningSequence && sum>0) {
                    set.add(sum);
                    sum = 0;
                    isRunningSequence = false;
                }
            }
            if(i==word.length()-1 && sum>0) {
                set.add(sum);
            }
        }
        return set.size();
    }

}

//            Set<String> set = new HashSet<>();
//            StringBuilder stringBuilder = new StringBuilder();
//            boolean isRunningSequence = true;
//            for(int i=0; i<word.length(); i++) {
//
//                int currentChar = word.charAt(i) - 48;
//                if(currentChar>=0 && currentChar<=9) {
//                    if(currentChar == 0 && !isRunningSequence){
//
//                    } else {
//                        isRunningSequence = true;
//                        stringBuilder.append(currentChar);
//                    }
//                } else {
//                    if(isRunningSequence) {
//                        set.add(stringBuilder.toString());
//                        stringBuilder = new StringBuilder();
//                        isRunningSequence = false;
//                    }
//                }