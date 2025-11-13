class Solution {
    public String simplifyPath(String path) {
        Stack<String> st = new Stack<>();
        for (String dir : path.split("/")) {
            if (dir.equals("") || dir.equals(".")) continue;
            if (dir.equals("..")) {
                if (!st.isEmpty()) st.pop();
            } else st.push(dir);
        }
        return "/" + String.join("/", st);
    }
}
