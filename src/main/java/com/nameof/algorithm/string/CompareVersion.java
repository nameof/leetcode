package com.nameof.algorithm.string;

public class CompareVersion {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int max = Math.max(v1.length, v2.length);
        for (int i = 0; i < max; i++) {
            int v1_int = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int v2_int = i < v2.length ? Integer.parseInt(v2[i]) : 0;
            if (v1_int == v2_int){
                continue;
            }
            return v1_int > v2_int ? 1 : -1;
        }
        return 0;
    }
}
