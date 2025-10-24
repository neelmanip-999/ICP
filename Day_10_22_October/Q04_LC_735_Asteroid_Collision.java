class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<asteroids.length; i++){
            int curr = asteroids[i];
            boolean flag = true;
            while(!st.isEmpty() && curr < 0 && st.peek() > 0){
                if(st.peek() < -curr){
                    st.pop();
                    continue;
                }
                else if(st.peek() == -curr){
                    st.pop();
                }
                flag = false;
                break;
            }
            if(flag){
                st.push(curr);
            }
        }
        int[] ans = new int[st.size()];
        for(int i = st.size()-1; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
}