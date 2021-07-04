package dsa450practiesheet.arrays;

import java.util.List;

public class _1773_CountItems {
    public static void main(String[] args) {
        List<List<String>> items = List.of(List.of("phone", "blue", "pixel"),
                List.of("computer", "silver", "lenovo"),
                List.of("phone", "gold", "iphone")
        );
        Solution1 obj = new Solution1();
        System.out.println(obj.countMatches(items, "color", "silver"));

    }
}

class Solution1 {
    public int countMatches(List<List<String>> items,String ruleKey, String ruleValue) {
        // good construct of code
        int column = switch (ruleKey) {
            case "type" -> 0;
            case "color" -> 1;
            case "name" -> 2;
            default -> 0;
        };

        int count = 0;
        for (List<String> item : items) {
           String str = item.get(column);
           if(str.equals(ruleValue)) {
               count++;
           }
        }
        return count;
    }
}
