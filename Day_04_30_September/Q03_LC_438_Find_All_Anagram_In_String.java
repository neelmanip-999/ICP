class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(s.length() < p.length()){
            return ans;
        }
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        for(int i = 0; i<p.length(); i++){
            freq1[p.charAt(i)-'a']++;
            freq2[s.charAt(i)-'a']++;
        }
        int left = 0;
        int right = p.length();
        if(Equal(freq1, freq2)) ans.add(0);
        while(right < s.length()){
            freq2[s.charAt(left)-'a']--;
            freq2[s.charAt(right)-'a']++;
            left++;
            if(Equal(freq1, freq2)) ans.add(left);
            right++;
        }
        return ans;
    }
    public boolean Equal(int[] arr1, int[] arr2){
        for(int i = 0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}