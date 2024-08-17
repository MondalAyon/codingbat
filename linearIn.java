/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all of the numbers in inner appear in outer.
The best solution makes only a single "linear" pass of both arrays, taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true

https://codingbat.com/prob/p134022

*/

public class linearIn {
    public static void main(String[] args) {
        int[] outer = {1, 2, 5, 6};
        int[] inner = {};

        System.out.println(linearIn(outer, inner));

    }

    public static boolean linearIn(int[] outer, int[] inner) {
        int i = 0;

        if (outer.length == 0) return false;
        if (inner.length == 0) return true;

        for (int o=0; o<outer.length; o++) {
            if (outer[o] == inner[i]) {
                i++;
                if (i==inner.length) {
                    return true;
                }
            }
            //if (outer[o] > inner[i]) // To avoid redundant iteration.
            //    return false;
        }

        return false;
    }

}
