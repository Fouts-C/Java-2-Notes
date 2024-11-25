package Recursion;

public class recurry {
    

    public boolean isPal(String str, int left, int right)
    {
        if (left >= right)
        {
            return true;
        }
        else if (str.charAt(left) == str.charAt(right)) {

            return isPal(str, left + 1, right - 1)
        } else{
            return false;
        }
    }


    public int numDigits(int num)
    {
        
        if(num < 10)
        {
            return 1;
        }else{

            return numDigits (num / 10) + 1;
        }
    }

    public int factorial(int num) {
        // Base case: factorial of 0 is 1
        if (num == 0) {
            return 1;
        } else {
            // Recursive case: factorial of num is num * factorial of (num - 1)
            return num * factorial(num - 1);
        }
    }

    public static double power(double x, int n) {
        // Base case: if n is 0, return 1
        if (n == 0) {
            return 1;
        }
        // Recursive case: if n is negative, calculate reciprocal of power
        else{
            return num * pow(num, pow -1);
        }


    //Method for the user *They cant give index
    public int indexOf(String str, char target)
    {
        return indexOf(str, target, 0);
    }


    private static int indexOf(String str, char target, int index)
    {

        if(index == str.length())
        {
            return -1;
        }
        if (str.charAt(index) == target)
        {
            return index;
        }
        return indexOf(str, target index++);
    }
}
