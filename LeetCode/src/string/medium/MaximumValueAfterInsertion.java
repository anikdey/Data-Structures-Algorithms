package string.medium;

public class MaximumValueAfterInsertion {

    public static void main(String[] args) {
        System.out.println(maxValue("-4599", 9));
    }


    public static String maxValue(String n, int x) {

        StringBuilder str = new StringBuilder(n);

        if(n.startsWith("-")) {
            for(int i=1; i<n.length(); i++) {
                char ch = str.charAt(i);
                if(Integer.parseInt(ch+"")>x) {
                    str.insert(i, x);
                    return str.toString();
                }
            }
        } else {
            for(int i=0; i<n.length(); i++) {
                char ch = str.charAt(i);
                if(Integer.parseInt(ch+"")<x) {
                    str.insert(i, x);
                    return str.toString();

                }
            }
        }
        return str.append(x).toString();
    }

}
