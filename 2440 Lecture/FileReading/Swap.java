package FileReading;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Swap {

    private int[][] array;;

    public Swap() throws FileNotFoundException{
        readInputFile("numbers.txt");
    }

    public void readInputFile(String nameOfFIle) throws FileNotFoundException{

        Scanner fileIn = new Scanner(new File(nameOfFIle));

        array = new int[3][5];

        for(int i = 0; i < array.length; i++){
           
            for(int j = 0; j < array[i].length; j++){

                array[i][j] = fileIn.nextInt();
            }
        }
        fileIn.close();
    }

    public void printArray(){

        for(int i = 0; i < array.length; i++){
           
            for(int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        Swap sp = new Swap();
        sp.printArray();
    }

    
}
