/*
https://codingbat.com/prob/p154137
Given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not".
The word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count.
(Note: Character.isLetter(char) tests if a char is a letter.)

notReplace("is test") → "is not test"
notReplace("is-is") → "is not-is not"
notReplace("This is right") → "This is not right"
*/


public class notReplace {
    public static void main(String[] args) {
        String str = "This is-test";
        //String str = "is";
        //String str = "is-is";
        //String str = "is test";

        System.out.println(notReplace(str));
    }

    public static String notReplace(String str) {
        int si = 0;
        String resultStr = "";

        if (str.equals("is")) return str+= " not";

        for (int i=0; i<str.length(); i++) {
            si = i;
            String s = "";

            if (i==str.length()-1)
                s = str.substring(si, si+1);
            else
                s = str.substring(si, si+2);

            if (s.equals("is")) {
                if (i==0 && !Character.isLetter(str.charAt(si+2))) {
                    s = s + " not";
                }
                if (i==str.length()-2 && !Character.isLetter(str.charAt(si-1))) {
                    s = s + " not";
                }
                if (i!=0 && i!=str.length()-2 && !Character.isLetter(str.charAt(si-1)) && !Character.isLetter(str.charAt(si+2))) {
                    s = s + " not";
                }

                resultStr += s;
                i++;
            }
            else resultStr += str.charAt(i);
        }
        return resultStr;
    }
}
