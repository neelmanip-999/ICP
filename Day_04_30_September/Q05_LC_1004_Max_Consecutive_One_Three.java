class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int si = 0, ei = 0, ans = 0;
        while(ei < n){
            if(nums[ei] == 0){
                k--;
            }
            while(k < 0 && si <= ei){
                if(nums[si] == 0) k++;
                si++;
            }
            ans = Math.max(ans, ei-si+1);
            ei++;
        }
        return ans;
    }
}