class Solution {
    public String decodeString(String s) {
        Stack<Integer> numst = new Stack<>();
        Stack<StringBuilder> strst = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int k = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                k = k*10 + (ch-'0');
            }
            else if(ch == '['){
                numst.push(k);
                strst.push(curr);
                curr = new StringBuilder();
                k = 0;
            }
            else if(ch == ']'){
                int repeat = numst.pop();
                StringBuilder prev = strst.pop();
                for(int i = 0; i<repeat; i++){
                    prev.append(curr);
                }
                curr = prev;
            }
            else{
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}