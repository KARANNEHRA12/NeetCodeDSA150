import java.util.HashSet;

public class isValidSudoku {
//    public boolean isValidSudoku(char[][] board) {
//        HashSet<String > seen_vals = new HashSet<>();
//
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                char current_val = board[i][j];
//                if( current_val != '.'){
//                    if(!seen_vals.add(current_val + "found in row " + i) || !seen_vals.add(current_val + "found in column " + j) || !seen_vals.add(current_val + "found in subbox " + i/3+ "-" + j/3) )
//                        return false;
//                }
//
//            }
//
//        }
//        return true;
//
//
//
//    }
        public  boolean isValidSudoku(char [][] board){
            HashSet<Character> row_vals= null;
            HashSet<Character> col_vals = null;
            for (int i = 0; i < 9; i++) {
                row_vals = new HashSet<>();
                col_vals = new HashSet<>();

                for (int j = 0; j < 9; j++) {

                    char r = board[i][j];
                    char c = board[j][i];
                    if( r != '.'){
                        if( row_vals.contains(r)){
                            return false;
                        }
                        else{
                            row_vals.add(r);
                        }
                    }
                    if( c != '.'){
                        if( col_vals.contains(c)){
                            return false;
                        }
                        else{
                            col_vals.add(c);
                        }
                    }

                }

            }
            for (int i = 0; i < 9; i =i+3 ) {
                for (int j = 0; j < 9;j = j+3) {
                    if(!checkBlock( i ,j , board))
                        return false;

                }

            }
            return true;
        }

    private boolean checkBlock(int idxI, int idxJ, char[][] board) {
                HashSet<Character> block_vals = new HashSet<>();
                int rows = idxI + 3;
                int cols = idxJ + 3;
        for (int i = idxI; i <rows ; i++) {
            for (int j  = idxJ ; j< cols ; j++){
                if( board[i][j] == '.'){
                    continue;
                }
                if( block_vals.contains(board[i][j])){
                    return false;
                }
                block_vals.add(board[i][j]);
            }

        }
        return true;

     }


}
