import java.util.ArrayList;

public class Lists{

    public static void main(String[] args) {
        
    
    //Default constructor, initial capacity is 10
    ArrayList<String> names = new ArrayList<String>();

    //Type inference 
    //Initial capacity 25 instead of 10
    ArrayList<String> other = new ArrayList<>(25);

    names.add("Jane");
    names.add("Jon");
    names.add("Sean");

    for(int i = 0; i < names.size(); i++){

        //names[i]
        //names.get(i) - how to get an item from a list
        System.out.println(names.get(i));
    }

    //ArrayLists have a toString method as well
    System.out.println(names);

    //Adding to a list
    names.add(1, "Danny");
    System.out.println(names);

    //removing from a list
    names.remove(0);
    System.out.println(names);

    //will remove the first instance of the object given
    names.remove("Sean");
    System.out.println(names);

    //Method to change an index in an array
    names.set(0, "Jim");
    System.out.println(names);

    //Will remove all items in a list
    names.clear(); // Can check this with names.isEmpty();

    //names.contains("Jon")
    //Goes through the list and if there is an equal item, it will return true


    //Wrapper classes - one for each primitive type (Can be used to create an ArrayList of primitive types)
    //Integer - int
    //Double - double
    //Boolean - boolean
    //Character - char

    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(10);
    numbers.add(5);
    numbers.add(1);
    System.out.println(numbers);

    for(Integer num : numbers){
        System.out.println(num);
    }

}
}