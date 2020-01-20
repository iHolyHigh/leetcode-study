package com.holyhigh.leetcodestudy.problems;

/**
 * No0067-二进制求和
 *
 * @author holyhigh
 * @version 0.0.1
 * @since 2020-01-16 21:51
 */
class No0067AddBinary {
    String addBinary(String a, String b) {
        if (a.length() > b.length()) {
            String temp = b;
            b = a;
            a = temp;
        }
        char[] aInt = a.toCharArray();
        char[] bInt = b.toCharArray();
        for (int i = aInt.length - 1; i >= 0; i--) {
            if (aInt[i] == '0') {
                continue;
            }
            // aInt[i] == '1' && j - i = bInt.length - aInt.length
            for (int j = bInt.length - aInt.length + i; j >= 0; j--) {
                if (bInt[j] == '0') {
                    bInt[j] = '1';
                    break;
                }
                bInt[j] = '0';
                if (j == 0) {
                    // 进位
                    char[] base = {'1'};
                    char[] add = new char[1 + bInt.length];
                    System.arraycopy(base, 0, add, 0, 1);
                    System.arraycopy(bInt, 0, add, 1, bInt.length);
                    bInt = add;
                }
            }
        }
        return String.valueOf(bInt);
    }
}
