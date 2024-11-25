public class ArrayDemensions{
    
    public static void main(String[] args) {
        
        final int ROWS = 5;
        final int COLS = 3;

        int[][] arr = new int[ROWS][COLS];

        arr[0][0] = 5;
        System.out.println(arr[0][0]);


        //INTERAING THROUGH 2D ARRAYS
        //arr.length represents the amount of rows the array has
        //loop through row's first then col's
        //arr[row].length will give the col length 
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){
              
                arr[row][col] = row * col;
            }
        }

        //Printing out a 2D array
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){

                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        //Summing up all the values in a 2D array
        int sum = 0;
        for(int row = 0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){

                sum += arr[row][col];
            }
        }
        System.out.println("Total: " + sum);


        //Summing up each row
        for(int row = 0; row < arr.length; row++){

            int rowTotal = 0;

            for(int col = 0; col < arr[row].length; col++){

                rowTotal += arr[row][col];
            }
            System.out.println("row: " + row + "total: " + rowTotal);
        }

        //Summing up each col
        for(int col = 0; col < arr[0].length; col++){

            int colTotal = 0;
            for(int row = 0; row < arr.length; row++){

                colTotal += arr[row][col];
            }
            System.out.println("col: " + col + "total: " + colTotal);
        }

        //Ragged arrays
        int[][] ragged = new int[3][];
        ragged[0] = new int[2];
        ragged[1] = new int[4];
        ragged[2] = new int[3];

        for(int row = 0; row < ragged.length; row++){
            
            for (int col = 0; col < ragged[row].length; col++){

                System.out.print(ragged[row][col] + " ");
            }
            System.out.println();
        }

        //Predifined 2D Arrays
        String[][] words = {{"Dog", "cat"}, {"pig", "goat"}};



        //Multidemension arrays
        int[][][] threeD = new int[5][4][3];


        //Testing 2D Practice
        String[][] t = {{"a", "b", "c"}, {"d", "e", "f"}, {"g", "h", "i"}};
        processTable(t);
    }

    //2D Practice
    public static void processTable(String[][] table){

        System.out.print("  ");

        for(int k = 0; k < table[0].length; k++){
            System.out.print(k + " ");
        }
        System.out.println();


        for(int i = 0; i < table.length; i++){

            System.out.print(i + " ");

            for(int j = 0; j < table[0].length; j++){

                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}