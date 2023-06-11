// Требования
// Объявлена доска 9 x 9 необходимо отвалидировать в соответствии с правилами
// 1. Каждая строка должна содержать цифру 1-9 без повторения
// 2. Каждая колонка должна содержать цифру 1-9 без повторения
// 3. Каждый под блок из 9 элементов 3 x 3 должна содержать цифру 1-9 без повторения
// Ограничения
// • board.length == 9
// • board[i].length == 9
// • board[i][j] значение число или '.'
// */


package HW;

public class HW2_4 {public class Main {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
        
        boolean isValid = isValidSudoku(board);
        
        System.out.println(isValid ? "Доска судоку валидна" : "Доска судоку не валидна");
    }
    
    public static boolean isValidSudoku(char[][] board) {
        // Проверяем каждую строку на наличие повторяющихся цифр
        for (int i = 0; i < 9; i++) {
            boolean[] seen = new boolean[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        
        // Проверяем каждую колонку на наличие повторяющихся цифр
        for (int j = 0; j < 9; j++) {
            boolean[] seen = new boolean[9];
            for (int i = 0; i < 9; i++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    if (seen[num]) {
                        return false;
                    }
                    seen[num] = true;
                }
            }
        }
        
        // Проверяем каждый подблок на наличие повторяющихся цифр
        for (int block = 0; block < 9; block++) {
            boolean[] seen = new boolean[9];
            for (int i = block / 3 * 3; i < block / 3 * 3 + 3; i++) {
                for (int j = block % 3 * 3; j < block % 3 * 3 + 3; j++) {
                    if (board[i][j] != '.') {
                        int num = board[i][j] - '1';
                        if (seen[num]) {
                            return false;
                        }
                        seen[num] = true;
                    }
                }
            }
        }
        
        return true;
    }
}}
