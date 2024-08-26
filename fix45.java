/*
https://codingbat.com/prob/p125819

(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 4 is immediately followed by a 5. Do not move the 4's, but every other number may move.
The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4. In this version, 5's may appear
anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]

Same solution works as that of fix34 (https://codingbat.com/prob/p159339)
*/

public class fix45 {
    public static void main(String[] args) {
        int[] nums = {5, 4, 9, 4, 9, 5};
        //int[] nums = {1, 4, 1, 5, 5, 4, 1};
        //int[] nums = {5, 4, 5, 4, 1};
        int[] resultArray = new int[nums.length];
        printArray(nums);

        printArray(fix45_v2(nums));

    }

    public static int[] fix45_v2(int[] nums) {

        // Look forward (look for 4 and change the next 5
        for (int i=0; i< nums.length; i++) {

            if (nums[i]== 4) {
                for (int j=i+1; j<nums.length; j++) {
                    if (nums[j] == 5) {
                        nums[j] = nums[i+1];
                        nums[i+1] = 5;
                        i+= 1;
                        break;
                    }
                }
            }
        }
        // Look backward (look for 4 and change the previous 5
        for (int i=nums.length-1; i>=0; i--) {

            if (nums[i] == 4) {
                for (int j = i-1; j>=0; j--) {
                    if (nums[j] == 5) {
                        nums[j] = nums[i+1];
                        nums[i+1] = 5;
                        i--;
                        break;
                    }
                }
            }
        }
        return nums;
    }

    /* This function fails for testcase = "5, 4, 5, 4, 1". Needs improvement.
    public static int[] fix45(int[] nums) {

        int totalFour = 0;
        int j = 0;
        int k = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i]==4) totalFour++;
        }

        int[] four = new int[totalFour];
        int[] five = new int[totalFour];

        for (int i=0; i<nums.length; i++) {
            if (nums[i] == 4) {
                four[j] = i;
                j++;
            }
            if (nums[i] == 5) {
                five[k] = i;
                k++;
            }
        }

        printArray(four);
        printArray(five);

        for (int l=0; l<four.length; l++) {
            if (nums[four[l]+1] != 5) {
                nums[five[l]] = nums[four[l]+1];
                nums[four[l]+1] = 5;
            }
        }

        return nums;
    }

     */

    private static void printArray(int[] nums) {
        System.out.println();
        for (int i=0; i<nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

}
