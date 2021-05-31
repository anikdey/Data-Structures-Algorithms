package string.easy;

public class MaximumNestingDepthOfTheParentheses {


    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
        System.out.println(maxDepth("(1)+((2))+(((3)))"));
        System.out.println(maxDepth("1+(2*3)/(2-1)"));
        System.out.println(maxDepth("1"));
        System.out.println(maxDepth("1"));
    }

    public static int maxDepth(String s) {
        int maxDepth = 0;
        int depthCount = 0;
        for(int i=0; i<s.length(); i++) {
            char currentChar = s.charAt(i);
            if(currentChar == '(') {
                depthCount++;
            }else if(currentChar == ')'){
                depthCount--;
            }
            if(depthCount>maxDepth) {
                maxDepth = depthCount;
            }
        }
        return maxDepth;
    }

}
