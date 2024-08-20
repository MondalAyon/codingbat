/*
https://codingbat.com/prob/p192570

Given two strings, base and remove, return a version of the base string where all instances of the remove string
have been removed (not case sensitive). You may assume that the remove string is length 1 or more. Remove only
non-overlapping instances, so with "xxx" removing "xx" leaves "x".

withoutString("Hello there", "llo") → "He there"
withoutString("Hello there", "e") → "Hllo thr"
withoutString("Hello there", "x") → "Hello there"
 */

public class withoutString {
    public static void main(String[] args) {
        String base = "abxxxxab";
        String remove = "x";

        System.out.println(withoutString(base,remove));

    }

    public static String withoutString(String base, String remove) {

        String ubase = base.toUpperCase();
        String uremove = remove.toUpperCase();
        String result = "";
        int i = 0;  //Index of the remove string found in the base, if not found then -1
        int si = 0; //start index of the search.

        while (true) {
            i = ubase.indexOf(uremove, si);
            if (i<0) {
                result = result + base.substring(si,base.length());
                break;
            }
            result = result + base.substring(si, i);

            si = i + uremove.length();
        }
        return result;
    }

}
