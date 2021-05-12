package com.nameof.algorithm.string;

public class StringAdd {
    public String add(String num1, String num2) {
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int carry = 0;
        StringBuilder result = new StringBuilder();
        while (len1 >= 0 || len2 >= 0 || carry > 0) {
            int n1 = len1 >= 0 ? num1.charAt(len1) - '0' : 0;
            int n2 = len2 >= 0 ? num2.charAt(len2) - '0' : 0;
            int current = n1 + n2 + carry;
            carry = current / 10;
            result.append((char)(current % 10 + '0'));
            len1--;
            len2--;
        }
        return result.reverse().toString();
    }
}
