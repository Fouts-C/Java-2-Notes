package Exceptions;


//Exception is a subclass of the class Throwable
//Exception has a subclass of it's own (ArithmeticException/NullPointerException)

public class Exception {
    
    public void indexExc(int[] testArray, int index) throws IndexOutOfBoundsException{

        if (index < 0 || index >= testArray.length){
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }
    }   



    public static void main(String[] args){
        

        //Try/Catch Block
    //  try{
            //risky code and code that depends on risky code's success
    //  }
    //  catch(Exception e){
            //Code you want to run when the exception occurs
    //  }

        int i, j, x = 5, y = 5, z = 0;
        try {
            i = x/y;
            System.out.println("x/y = " + i);
           
            j = x/z;
            System.out.println("x/z = " + j);

        } catch (ArithmeticException e) {
           
            System.out.println("Arithmetic Exception");
            System.out.println(e.getStackTrace());
        }

        //We can have multiple catch boxes but ORDER MATTERS
        //EX: NumberFormatException -> ArithmeticException -> Exception

        /*The Finally Block
        try {
            System.out.println(“try block”);
    
        }catch (Exception e) {
            System.out.println(“catch block”);
            
        }finally {
            System.out.println(“finally block”);
            }
        */
    }
}
