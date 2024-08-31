/*
https://codingbat.com/prob/p190862

Given an array of strings, return a Map<String, Boolean> where each different string is a key and its 
value is true if that string appears 2 or more times in the array.

wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"]) → {"c": true}
 */

import java.util.HashMap;
import java.util.Map;

public class wordMultiple {
    public static void main(String[] args) {
        String[] string = {"a", "b", "a", "c", "b"};

        System.out.println(wordMultiple(string));
    }

    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> resultMap = new HashMap<>();
        Map<String, Integer> tempMap = new HashMap<>();

        if (strings == null) return null;

        for (String s:strings) {
            if (tempMap.containsKey(s)) {
                tempMap.put(s,tempMap.get(s)+1);
            }
            else tempMap.put(s,1);
        }
        for (String s: tempMap.keySet()) {
            if (tempMap.get(s) >= 2){
                resultMap.put(s, true);
            }
            else resultMap.put(s, false);
        }
        return resultMap;
    }
}
