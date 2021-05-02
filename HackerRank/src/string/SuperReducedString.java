package string;

public class SuperReducedString {

    public static void main(String[] args) {
        System.out.println(superReducedString("abba"));
        System.out.println(superReducedString("aaabccddd"));
        System.out.println(superReducedString("aabb"));
    }


    public static String superReducedString(String s) {
        if(s.isEmpty()) {
            return "Empty String";
        }
        boolean isDeleted = false;
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<length; ) {
            if(i<length-1 && s.charAt(i) == s.charAt(i+1)) {
                i += 2;
                isDeleted = true;
            } else{
                stringBuilder.append(s.charAt(i));
                i++;
            }
        }
        if(isDeleted){
            return superReducedString(stringBuilder.toString());
        } else {
            return s;
        }
    }

}
