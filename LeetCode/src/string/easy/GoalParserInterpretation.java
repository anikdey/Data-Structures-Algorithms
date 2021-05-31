package string.easy;

public class GoalParserInterpretation {

    public static void main(String[] args) {
        System.out.println(interpret("G()(al)"));
        System.out.println(interpret("G(al)"));
        System.out.println(interpret("G()()()()(al)"));
        System.out.println(interpret("(al)G(al)()()G"));
        System.out.println(interpret(""));
    }

    public static String interpret(String command) {

        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (counter<command.length()) {

            if(command.charAt(counter) == 'G') {
                stringBuilder.append("G");
                counter++;
            } else if(command.charAt(counter) == '(' && command.charAt(counter+1) == ')') {
                stringBuilder.append("o");
                counter += 2;
            }else if(command.charAt(counter) == '(' && command.charAt(counter+1) == 'a') {
                stringBuilder.append("al");
                counter += 4;
            }
        }
        return stringBuilder.toString();
    }

}
