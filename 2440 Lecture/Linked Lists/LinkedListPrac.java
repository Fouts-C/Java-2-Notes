
public class LinkedListPrac {

    //Method that given a refrence to the head of a linked list of int's returns the sum of the integers in the list
    
    public int findSum(IntNode head){

        int sum = 0;
        for(IntNode pointer = head; pointer != null; pointer = pointer.getLink){

            sum += pointer.getData();
        }

        return sum;
    }

    //Method that makes a new node containing a specified element and adds it to the front of a linked list.

    public static StringNode addAtHead(StringNode head, String element){
        return new StringNode(element, head);
    }

    //Method that makes a new node containing a new node containing a specified element and adds it after the head of a 
    //linked list. Throw NullPointerException if the list is empty.

    public static void addAfterHead(StringNode head, String element) throws NullPointerException{

        if (head.getData().equals(null)){
            throw new NullPointerException("Null head node");
        } else{
            StringNode newNode = new StringNode(element, head.getLink());
            head.setLink(newNode);
        }
    }

    //Method that removes the head node in a linked list by returning a refrence to the new head. If there are no elements in the
    //original linked list, throwe a NullPointerException

    public static StringNode removeAtHead(StringNode head)throws NullPointerException{

        if(head != null){

            return head.getLink();

        }else{
            throw new NullPointerException("Null head node");
        }
    }

    //Method to remove the node after the head node and return the string data that was in the removed node. If there's
    //not at least 2 elements in the list, it will throw a NullPointerException

    public static String removeAfterHead(StringNode head)throws NullPointerException{
        
        if(head == null || head.getLink() == null){
            throw new NullPointerException("Empty list or only one node");
        }
        String dataToReturn = head.getLink().getData();
        head.setLink(head.getLink().getLink());
        return dataToReturn;
    }
}
