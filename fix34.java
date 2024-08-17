/*
Return an array that contains exactly the same numbers as the given array, but rearranged so that every 3 is immediately followed by a 4. Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3, and a 3 appears in the array before any 4.

fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
fix34([3, 2, 2, 4]) → [3, 4, 2, 2]

https://codingbat.com/prob/p159339
*/

public class fix34 {
    public static void main(String[] args) {
        int[] nums = {5, 3, 5, 4, 5, 4, 5, 4, 3, 5, 3, 5};
        //int[] nums = {1, 3, 1, 4};
        //int[] nums = {1, 3, 1, 4, 4, 3, 1};

        printArray(nums);
        printArray(fix34(nums));


    }


    public static int[] fix34(int[] nums) {

        // Look forward (look for 3 and change the next 4
        for (int i=0; i< nums.length; i++) {

            if (nums[i]== 3) {
                for (int j=i+1; j<nums.length; j++) {
                    if (nums[j] == 4) {
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                        i+= 1;
                        break;
                    }
                }
            }
        }
        // Look backward (look for 3 and change the previous 4
        for (int i=nums.length-1; i>=0; i--) {

            if (nums[i] == 3) {
                for (int j = i-1; j>=0; j--) {
                    if (nums[j] == 4) {
                        nums[j] = nums[i+1];
                        nums[i+1] = 4;
                        i--;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    public static void printArray(int[] nums) {
        System.out.println();
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }



}
