package Object


public class ObjectClassNotes {

    //To create a clone (aClonableObject is the variable name)
    //aClonableObject.clone();

    //To override the one in Object, it must be declared as
    //public Object clone() throws CloneNotSupportedException

    //The easiest way to make your class clonable is to add implements Cloneable to your class header
    //With a clone, a new Object is created in the class with the same fields that have been defined

    //Shallow copy
    //If an object contains a refrence to an object it is just a shallow copy
    //Shallow copy just uses .clone


    //Deep copy
    //In order to create a deep copy, you must override clone 
   
    //Creating a deep copy
    //IntArrayBag = answer;
    //answer = (IntArrayBag) super.clone();

    //How to use .equals to compare objects
    Location loc1;
    Location loc2;
    
    if(loc1.equals(loc2)){
        System.out.println("Same");
    }else{
        System.out.println("Different");
    }
}
