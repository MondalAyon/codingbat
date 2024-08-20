/*
https://codingbat.com/prob/p131516

Given a string, return the longest substring that appears at both the beginning and end of the string without overlapping.
For example, sameEnds("abXab") is "ab".

sameEnds("abXYab") → "ab"
sameEnds("xx") → "x"
sameEnds("xxx") → "x"
 */
import java.util.HashMap;

public class longestSameEnds {
    public static void main(String[] args) {
        String str = "aaacXabcYaaa";
        //String str = "xx";

        System.out.println(sameEnds(str));

        //System.out.println(str.substring(3));
    }

    public static String sameEnds(String string) {

        HashMap<String, Integer> strMap = new HashMap<>();

        for (int i=0; i< string.length()/2; i++) {

            String bs = string.substring(0,i+1);
            int x=string.length()-bs.length();
            String es = string.substring(x);

            if (bs.equals(es)) {
                strMap.put(bs, bs.length());
            }
        }

        System.out.println(strMap);
        int max = Integer.MIN_VALUE;
        String result = "";

        for (String s:strMap.keySet()) {
            if (strMap.get(s) > max) {
                max = strMap.get(s);
                result = s;
            }
        }

        return result;

    }
}
