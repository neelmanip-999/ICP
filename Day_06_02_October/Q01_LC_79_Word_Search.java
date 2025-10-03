class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length; j++){
                if(board[i][j] == word.charAt(0)){
                    boolean ans = Search(board, i, j, word, 0);
                    if(ans){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean Search(char[][] board, int row, int col, String word, int idx){
        if(idx == word.length()){
            return true;
        }
        if(row<0 || col<0 || row>=board.length || col>=board[0].length || board[row][col] != word.charAt(idx)){
            return false;
        }
        board[row][col] = '*';
        int[] r = {-1, 0, 0, 1};
        int[] c = {0, -1, 1, 0};
        for(int i = 0; i<c.length; i++){
            boolean ans = Search(board, row+r[i], col+c[i], word, idx+1);
            if(ans){
                return true;
            }
        }
        board[row][col] = word.charAt(idx);
        return false;
    }
}