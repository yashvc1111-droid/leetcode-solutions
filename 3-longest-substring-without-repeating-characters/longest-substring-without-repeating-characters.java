import java.util.*;

class Solution {

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < s.length(); end++) {

            char ch = s.charAt(end);

            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while (map.get(ch) > 1) {

                char remove = s.charAt(start);

                map.put(remove, map.get(remove) - 1);

                if (map.get(remove) == 0) {
                    map.remove(remove);
                }

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}