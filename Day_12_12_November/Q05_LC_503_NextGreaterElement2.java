class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[2*n];
        for(int i = 0; i<n; i++){
            arr[i] = nums[i];
        }
        for(int i = n; i<2*n; i++){
            arr[i] = nums[i-n];
        }
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[2*n];
        for(int i = 0; i<2*n; i++){
            while(!st.isEmpty() && arr[i] > arr[st.peek()]){
                ans[st.pop()] = arr[i];
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()] = -1;
        }
        int[] fin = new int[n];
        for(int i = 0; i<n; i++){
            fin[i] = ans[i];
        }
        return fin;
    }
}