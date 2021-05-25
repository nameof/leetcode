package com.nameof.algorithm.backtracking;

import java.util.Set;

public class 字符串的排列 {
    public void Permutations(String str) {
        get(str, 0, new HashSet<>(), "");
    }

    private void get(String str, int index, Set<Character> used, String result) {
        if (index == str.length()) {
            System.out.println(result);
            return;
        }
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (!used.contains(chars[i])) {
                used.add(chars[i]);
                get(str, index + 1,  used,result + chars[i]);
                used.remove(chars[i]);
            }
        }
    }
}
