// Chapter 5 Exercise 1 
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        // Create an ArrayList of integers //2
        ArrayList<Integer> list = new ArrayList<>();


        // Add elements to the ArrayList //3
        list.add(5);
        list.add(10);
        list.add(15);

        // Print the elements of the ArrayList //4
        System.out.println("Elements of the ArrayList:");
        for (Integer num: list) {
            System.out.printIn(num);
         
        }

    }
}
