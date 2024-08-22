package org.example;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        //check if the length of two Strings are equal
        if (s.length() != t.length()) {
            return false;
        }
        //create alphabet arrays, one for each String
        int[] sArray = new int[26];
        int[] tArray = new int[26];

        //populate alphabet arrays
        for (int i = 0; i < s.length(); i++) {
            sArray[s.charAt(i) - 'a']++;
            tArray[t.charAt(i) - 'a']++;
        }

        //check value at each index of the two arrays
        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return false;
            }
        }
        return true;
    }
}
