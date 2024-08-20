/*
https://codingbat.com/prob/p198664

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
Return true if all the g's in the given string are happy.

gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
 */

public class gHappy {
    public static void main(String[] args) {
        String str = "";

        System.out.println(gHappy(str));

    }

    public static boolean gHappy(String str) {

        boolean happy = false;

        if (str == "") return true;
        if (str.length() == 1 || str.length() == 0) return false;

        for (int i=0; i<str.length(); i++) {

            if (i==str.length()-1 && str.charAt(i) == 'g') {
                happy = false;
                if (str.charAt(i-1) == 'g') {
                    happy = true;
                    continue;
                }
            }

            if (i != str.length()-1 && str.charAt(i) == 'g') {
                happy = false;
                if (str.charAt(i+1) == 'g') {
                    i++;
                    happy = true;
                    continue;
                }
            }
            if (str.charAt(i) == 'g') {
                happy = false;
                if (str.charAt((i-1)) == 'g') {
                    happy = true;
                    continue;
                }
            }
        }
        return happy;
    }
}
