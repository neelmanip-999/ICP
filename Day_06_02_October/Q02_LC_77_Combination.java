class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        Solve(n, k, ans, new ArrayList<>(), 1);
        return ans;
    }
    public static void Solve(int n, int k, List<List<Integer>> ans,List<Integer> ll, int idx){
        if(ll.size() == k){
            ans.add(new ArrayList<>(ll));
            return;
        }
        for(int i = idx; i<=n; i++){
            ll.add(i);
            Solve(n, k, ans, ll, i+1);
            ll.remove(ll.size()-1);
        }
    }
}