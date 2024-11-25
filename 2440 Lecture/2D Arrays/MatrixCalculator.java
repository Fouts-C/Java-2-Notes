public class MatrixCalculator {
    

    //Method to print out a matrix
    public static void print(int[][] matrix){

        for(int row = 0; row < matrix.length; row++){

            for(int col = 0; col < matrix[row].length; col++){ //[row] gets the length of the col

                System.out.print(matrix[row][col] + " ");
            }
            System.out.println(); //after it goes through one col, a new line is started
        }
    }

    
    
    //Method to add two matricies
    public static int[][] add(int[][] a, int[][] b){

        int rowsA = a.length;
        int rowsB = b.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        if(rowsA == rowsB && colsA == colsB){

            int[][] c = new int[rowsA][colsA];
            
            for(int row = 0; row < rowsA; row++){
                for (int col = 0; col < colsA; col++){
                    
                    c[row][col] = a[row][col] + b[row][col];
                }
            }
            return c;
        }
        return null;
    }


    public static int[][] multiply(int[][] a, int[][] b){

        int rowsA = a.length;
        int rowsB = b.length;
        int colsA = a[0].length;
        int colsB = b[0].length;

        int[][] c = new int[rowsA][colsB];

        // for each row of A
            //for each col of B
            //   sum = 0
            //   for each col of A
            //     sum + a[row of A][col of A] + b[col of A][col of B]
            //   result[row of A][col of B] = sum

        if (colsA != rowsB){
            return null;
        }

        for (int rowA = 0; rowA < rowsA; rowA++){

            for (int colB = 0; colB < colsB; colB++){
               
                int sum = 0;
                for (int colA = 0; colA < colsA; colA++){
                    
                    sum += a[rowA][colA] * b[colA][colB];
                }
                c[rowA][colB] = sum;
            }
        }
        return c;
    }

}
