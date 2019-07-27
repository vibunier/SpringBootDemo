package com.leetcode.solution.easy.E001;

import java.util.Arrays;

/**
 * Class Name   : E001Solve
 * Description  :
 * Version      : V1.0.0
 * Author       : zhenyu
 * Date         : 2018-07-27
 * Copyright      (C) ChinaMerchantsBank
 */

public class E001Solve {

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     * <p>
     * Example:
     * <p>
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     */


    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 16;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(solution.twoSum(nums, target)));
    }
}

class Solution {
    /*
    时间复杂度为O(n^2)
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == (nums[i] + nums[j])) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}
