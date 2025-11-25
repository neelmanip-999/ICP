class Q03_LC_316_RemoveDuplicateLetter {
    public String removeDuplicateLetters(String s) {
        int[] freq = new int[26];
        boolean[] used = new boolean[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            freq[idx]--;
            if (used[idx]) continue;
            while (!st.isEmpty() && st.peek() > c && freq[st.peek() - 'a'] > 0) {
                used[st.pop() - 'a'] = false;
            }
            st.push(c);
            used[idx] = true;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : st) sb.append(c);
        return sb.toString();
    }
}
