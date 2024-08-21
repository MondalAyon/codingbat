/*
https://codingbat.com/prob/p139411

Given a string, look for a mirror image (backwards) string at both the beginning and end of the given string.
In other words, zero or more characters at the very begining of the given string, and at the very end of the
string in reverse order (possibly overlapping). For example, the string "abXYZba" has the mirror end "ab".

mirrorEnds("abXYZba") → "ab"
mirrorEnds("abca") → "a"
mirrorEnds("aba") → "aba"
 */
public class mirrorEnds {
    public static void main(String[] args) {
        String str = "";

        System.out.println(mirrorEnds(str));
    }


    public static String mirrorEnds(String string) {
        int i = 0;
        int j = string.length()-1;
        String resultStr = "";

        while (i<string.length() && j>=0) {
            if (string.charAt(i) == string.charAt(j)) {
                resultStr += string.charAt(i);
            }
            else break;
            i++;
            j--;
        }
        return resultStr;
    }

}
