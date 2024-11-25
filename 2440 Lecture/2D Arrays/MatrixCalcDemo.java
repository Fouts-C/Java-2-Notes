public class MatrixCalcDemo {
    

    public static void main(String[] args) {
        int [][] a = 
            {
                {1, 2, 3},
                {4, 5, 6}
            };

        int [][] b = 
            {
                {3, 2, 1},
                {6, 5, 4}
            };


        //Matricies for multiplying
        int [][] c = 
            {
                {3, 2, 1},
                {6, 5, 4}
            };
        
        int [][] d = 
            {
                {3, 2,},
                {6, 5,},
                {4, 1}
            };

        //Matrix A
        System.out.println("MATRIX A:");
        MatrixCalculator.print(a);
        System.out.println();
        
        //Matrix B
        System.out.println("MATRIX B:");
        MatrixCalculator.print(b);
        System.out.println();
        
        //Adding the Matricies
        System.out.println("MATRIX A + B");
        int[][] addMatricies = MatrixCalculator.add(a, b);

        MatrixCalculator.print(addMatricies);
        System.out.println();

        //Multiplying the Matricies
        System.out.println("MATRIX C * D");
        System.out.println("This is Java's toString representation of a 2D array:");
        System.out.println(MatrixCalculator.multiply(c, d));
        System.out.println();
        
    }
}
