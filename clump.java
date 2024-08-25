/*
https://codingbat.com/prob/p193817
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value. Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */
public class clump {
    public static void main(String[] args) {
        //int[] nums = {1, 2, 2, 3, 4, 4};
        //int[] nums = {1, 1,1,1,1};
        //int[] nums = {1, 1, 2, 1, 1};
        int[] nums = {0, 0, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2};

        System.out.println(countClumps(nums));
    }

    public static int countClumps(int[] nums) {

        int countClumps = 0;
        boolean clump = false;

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                if (!clump) {
                    countClumps++;
                }
                clump = true; //clump detected, set clump flag
            }
            else {
                clump = false;
            }
        }
        return countClumps;
    }
}
