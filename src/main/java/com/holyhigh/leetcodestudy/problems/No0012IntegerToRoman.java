package com.holyhigh.leetcodestudy.problems;

/**
 * No0012-整数转罗马数字
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-02-01 23:40
 */
class No0012IntegerToRoman {
    String intToRoman(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        while (index < 13) {
            while (num >= nums[index]) {
                stringBuilder.append(romans[index]);
                num -= nums[index];
            }
            index++;
        }
        return stringBuilder.toString();
    }
}
