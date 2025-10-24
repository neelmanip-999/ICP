class Solution {
    public int maximalRectangle(char[][] matrix) {
        int ans = 0;
        int[] arr = new int[matrix[0].length];
        for(int i = 0; i<matrix.length; i++){
            for(int j = 0; j<matrix[0].length; j++){
                if(matrix[i][j] == '0'){
                    arr[j] = 0;
                }
                else{
                    arr[j]++;
                }
            }
            ans = Math.max(ans, maxArea(arr));
        }
        return ans;
    }

    public int maxArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int ans = 0;
        for(int i = 0; i<heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int r = i;
                int h = heights[st.pop()];
                if(st.isEmpty()){
                    ans = Math.max(ans, h*r);
                }
                else{
                    int l = st.peek();
                    ans = Math.max(ans, h*(r-l-1));
                }

            }
            st.push(i);
        }
        int r = heights.length;
        while(!st.isEmpty()){
            int h = heights[st.pop()];
            if(st.isEmpty()){
                ans = Math.max(ans, h*r);
            }
            else{
                int l = st.peek();
                ans = Math.max(ans, h*(r-l-1));
            }
        }
        return ans;
    }
}