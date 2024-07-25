// -----------------------------ArrayList----------------------------------------------------

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

class ArrayList_4 {
    public static void main(String args[]) {
        // Creating an instance of ArrayList
        ArrayList<String> ar = new ArrayList<String>();
        
        // Adding elements
        ar.add("Harshit");
        ar.add("Reena");
        ar.add("sumit");
        ar.add("shruti");
        ar.add("geek");
        ar.add("JavaTPoint");
        
        // Printing the ArrayList
        System.out.println(ar);
        
        // Removing an element
        ar.remove("Reena");
        System.out.println(ar);
        
        // Checking if the ArrayList contains certain elements
        System.out.println(ar.contains("Reena"));
        System.out.println(ar.contains("shruti"));
        
        // Getting the size of the ArrayList
        System.out.println(ar.size());
        
        // Creating another ArrayList with Integer type
        ArrayList<Integer> ai = new ArrayList<Integer>();
        ai.add(89);
        ai.add(9);
        ai.add(8);
        ai.add(56);
        ai.add(908);
        ai.add(123);
        
        // Using an Iterator
        Iterator<Integer> itr = ai.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        // Checking if the ArrayList is empty
        System.out.println(ai.isEmpty());
        
        // Getting and setting elements in the ArrayList
        System.out.println(ai.get(3));
        System.out.println(ai.set(4, 14));
        System.out.println(ai);
        
        // Clearing the ArrayList
        ai.clear();
        System.out.println(ai);
        
        // Adding all elements from one ArrayList to another
        ArrayList<String> als = new ArrayList<String>();
        als.addAll(ar);
        for (String str : als) {
            System.out.println(str);
        }
        
        // Creating a List with a specified initial capacity
        ArrayList<Character> al3 = new ArrayList<Character>(4);
        al3.add('A');
        al3.add('B');
        al3.add('C');
        al3.add('D');
        
        // Printing the ArrayList
        // System.out.println(al3);
        
        // Checking the frequency of an element
        System.out.println(Collections.frequency(al3, 'S')); // print 0.
    }
}
// ----------------------------End-------------------------------------------------------