package com.holyhigh.leetcodestudy.problems;

/**
 * No0066-加一
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-15 00:42
 */
class No0066PlusOne {
    int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int last = digits[i] + 1;
            if (last != 10) {
                digits[i] = last;
                return digits;
            }
            digits[i] = 0;
            if (i == 0) {
                int[] first = {1};
                int len = digits.length;
                int[] result = new int[1 + digits.length];
                System.arraycopy(first, 0, result, 0, 1);
                System.arraycopy(digits, 0, result, 1, len);
                return result;
            }
        }
        return new int[]{1};
    }
}
