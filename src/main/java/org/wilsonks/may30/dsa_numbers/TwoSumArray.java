package org.wilsonks.may30.dsa_numbers;

import java.util.Arrays;

public class TwoSumArray {



    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,};
        int target = 5;
        int[] result = twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two numbers found that add up to the target.");
        }
    }

    /*
        2 for Loops O(n * n)
     */
    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    /*
        Two Pointer on sorted Array
     */
    private static int[]  twoSum2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                return new int[]{left, right};
            }
            if (sum > target) {
                right--;
            }
            if (sum < target) {
                left++;
            }
        }
        return null;
    }



}
