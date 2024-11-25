import java.io.*;
import java.util.*;

public class LinkList {
    
    //Link lists are composed of structures that
    //we call nodes

    //[head] -> [2 | memoryloc(node)] -> [7 | null]
    //head -> 2 -> 7
    //Each points to a memory location in a link
    // Null points to the end of a linked list

    //Linked lists can be creaded such that each node contains a 
    //link to the nxt node and to the previous node
    //These are doubly-linked list

    //Binary trees of nodes can be created by putting links to 
    //left and right children in each node


    StringNode str = new StringNode();
    str.setData("Dino"); //head node
    StringNode str2 = new StringNode("Fred", str); //points to str
    StringNode str3 = new StringNode("Bob", str2); //points to str2
    StringNode str4 = str3; //new memory pointing to str3

    str2.getLink().getData(); //Will return "Dino"
    str2.getLink(); //Will return node that points to Dino

    //Creating a new StringNode in between
    str2.setLink(new StringNode("Fido", str));
    str2.setLink(new StringNode("Fido", str2.getLink()));//if we don't have a str var

    //Can also do
    StringNode str5 = new StringNode("Fido", str2.getLink());
    str2.setLink(Str5);


    while(str4 != null){
        System.out.println(str4.getData())
        str4 = str4.getLink(); //will now point to what str3 is pointing to 
    }

    //Traversing a linked list
    Node traverse = head;
    while(traverse != null){
        //print traverse.getData();
        traverse = traverse.getLink();
    }


}
