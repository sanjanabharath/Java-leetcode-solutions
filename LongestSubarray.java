https://leetcode.com/problems/longest-substring-without-repeating-characters/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int first = 0;
        int second = 0;
        HashSet<Character> set = new HashSet<>();

        while(second < s.length()){
            if (!set.contains(s.charAt(second))){
                set.add(s.charAt(second));
                second++;
                max = Math.max(set.size(), max);
            }else {
                set.remove(s.charAt(first));
                first++;
            }
        }

        return max;
    }
}