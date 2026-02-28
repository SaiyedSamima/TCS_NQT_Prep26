public class AdditionTwoSquareMatrices {

    static void addMatrix(int[][] matrixA, int[][] matrixB){
        int n = matrixA.length;
        int m = matrixA[0].length;

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrixA[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int matrixA[][] = {{1, 2}, {3, 4}};
        int matrixB[][] = {{4, 3}, {2, 1}};

        addMatrix(matrixA,matrixB);
        printMatrix(matrixA);

    }
}
