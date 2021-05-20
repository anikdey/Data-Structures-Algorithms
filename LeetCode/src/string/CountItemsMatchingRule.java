package string;

import java.util.List;

public class CountItemsMatchingRule {

    public static void main(String[] args) {

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for(List<String> list : items) {
            String value = null;
            if(ruleKey.equals("type")) {
                value = list.get(0);
            } else if(ruleKey.equals("color")) {
                value = list.get(1);
            } else if(ruleKey.equals("name")) {
                value = list.get(2);
            }

            if(value.equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }


}
