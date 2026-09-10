import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // 1. Check each row
        for (int row = 0; row < 9; row++) {
            Set<Character> seen = new HashSet<>();

            for (int col = 0; col < 9; col++) {
                char value = board[row][col];

                if (value != '.') {
                    if (seen.contains(value)) {
                        return false;
                    }

                    seen.add(value);
                }
            }
        }

        // 2. Check each column
        for (int col = 0; col < 9; col++) {
            Set<Character> seen = new HashSet<>();

            for (int row = 0; row < 9; row++) {
                char value = board[row][col];

                if (value != '.') {
                    if (seen.contains(value)) {
                        return false;
                    }

                    seen.add(value);
                }
            }
        }

        // 3. Check each 3 x 3 box
        for (int rowStart = 0; rowStart < 9; rowStart += 3) {
            for (int colStart = 0; colStart < 9; colStart += 3) {

                Set<Character> seen = new HashSet<>();

                for (int row = rowStart; row < rowStart + 3; row++) {
                    for (int col = colStart; col < colStart + 3; col++) {

                        char value = board[row][col];

                        if (value != '.') {
                            if (seen.contains(value)) {
                                return false;
                            }

                            seen.add(value);
                        }
                    }
                }
            }
        }

        return true;
    }
}