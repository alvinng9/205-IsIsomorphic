package org.example;

import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        //check the length of each string
        if (s.length() != t.length()) {
            return false;
        }

        //create a hashmap for each string
        HashMap<Character, Character> mapOne = new HashMap<>();
        HashMap<Character, Character> mapTwo = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            //get the character at the current index
            char cOne = s.charAt(i);
            char cTwo = t.charAt(i);
            //map the characters if the two maps don't have the current characters
            if (!mapOne.containsKey(cOne) && !mapTwo.containsKey(cTwo)) {
                mapOne.put(cOne, cTwo);
                mapTwo.put(cTwo, cOne);
                //if the two maps have the current characters, check if they map to
                //one another
            } else {
                if (mapOne.containsKey(cOne) && mapOne.get(cOne) != cTwo) {
                    return false;
                }
                if (mapTwo.containsKey(cTwo) && mapTwo.get(cTwo) != cOne) {
                    return false;
                }
            }
        }
        return true;
    }
}
