/*
Given a non-empty array, return true if there is a place to split the array so that the sum of the numbers on one side is
equal to the sum of the numbers on the other side.
https://codingbat.com/prob/p158767
 */

public class canBalance {
    public static void main(String[] args) {
        int[] nums = {2};

        System.out.println(canBalance(nums));

    }

    public static boolean canBalance(int[] nums) {
        int a = 0;
        int b = 0;

        for (int i=0; i<nums.length; i++) {
            a += nums[i];
            b = 0;
            for (int j=i+1; j<nums.length; j++) {
                b += nums[j];
            }
            if (a == b) return true;
        }
        return false;
    }

}
