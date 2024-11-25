package Inheritance;

public class Rectangle extends Shape{

    private int width;
    private int length;

    public Rectangle(int x, int y, int wid, int len){

        //Calling shape's constructor
        super(x, y);
        width = wid;
        length = len;

    }

    
}
