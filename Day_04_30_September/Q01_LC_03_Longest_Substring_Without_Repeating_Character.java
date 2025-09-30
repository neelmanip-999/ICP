class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int si = 0, ei = 0, ans = 0;
        int[] freq = new int[128];
        while(ei < n){
            char ch = s.charAt(ei);
            freq[ch]++;
            while(freq[ch] > 1){
                freq[s.charAt(si)]--;
                si++;
            }
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}