public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int rows = matrixA.length;
        int cols = matrixA[0].length;
        int[][] sumMatrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println("--- Ma tran A ---");
        printMatrix(matrixA);

        System.out.println("\n--- Ma tran B ---");
        printMatrix(matrixB);

        System.out.println("\n--- Ma tran Tong (A + B) ---");
        printMatrix(sumMatrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
}