class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[]rows = new HashSet[9];
        Set<Character>[]cols = new HashSet[9];
        Set<Character>[]grid = new HashSet[9];

        for(int i=0 ; i<9 ; i++){
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            grid[i] = new HashSet<>();
        }
        
        for(int i=0 ; i<9 ; i++){
            for(int j=0 ; j<9 ; j++){
                char ch = board[i][j];
                if(ch=='.')continue;
                int gridIdx = (i/3)*3+(j/3);
                if(rows[i].contains(ch) || cols[j].contains(ch) || grid[gridIdx].contains(ch))return false;

                rows[i].add(ch);
                cols[j].add(ch);
                grid[gridIdx].add(ch);
            }
        }
        return true;
    }
}
