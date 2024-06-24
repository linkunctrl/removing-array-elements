// Remove Elements from an ArrayList
import java.util.*;
public class p5 {
    public static void main(String[] args){
        
        List<Integer> al = new ArrayList<Integer>(); // List<Integer> declares a variable
        /*  new ArrayList<Integer>(); creates a new instance of the
         ArrayList class that specifically holds objects of type Integer.  */

        // adding values
        al.add(10); 
        al.add(20); 
        al.add(30); 
        al.add(1); 
        al.add(2);

        // removing using index
        al.remove(1);
        // removing using values
        al.remove(Integer.valueOf(1)); 
        System.out.println(al);
    }
}