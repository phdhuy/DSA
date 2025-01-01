package rookie;

import java.util.Scanner;

public class MatrixRotation {
    static void rotateMatrix(String[][] matrix) {
        // TODO: Let's rock 'n roll here

        for (int i = matrix.length - 1; i >= 0; i--) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println("/t");
        }
    }
    
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input;
        Integer line = 0;
        Integer total = 0;
        
        total = Integer.valueOf(myObj.nextLine());
        String[][] newMatrix = new String[total][total];

        for(int i = 0; i < total; i++) {
            input = myObj.nextLine();
            newMatrix[i] = input.split(" ");
        }
        
        rotateMatrix(newMatrix);
    }
}
