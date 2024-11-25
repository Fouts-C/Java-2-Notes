package FileReading;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {

    public ReadFile() throws FileNotFoundException{
        
        readInputFile("pets.txt");
    }

    public ReadFile(String nameOfFile) throws FileNotFoundException {

        readInputFile(nameOfFile);
    }
    
    public void readInputFile(String nameOfFIle) throws FileNotFoundException{

        String name;
        int age;
        double weight;

        Scanner fileIn = new Scanner(new File(nameOfFIle));

        while(fileIn.hasNext()){
            name = fileIn.next(); //reads the next String
            age = fileIn.nextInt(); //reads the next int
            weight = fileIn.nextDouble(); //reads the next double

            System.out.println(name + " " + age + " " + weight);
        }
        fileIn.close();
    }

    public static void main(String[] args) throws FileNotFoundException{
        
        ReadFile rf = new ReadFile();
    }
    
}
