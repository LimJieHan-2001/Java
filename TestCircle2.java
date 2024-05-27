import java.util.ArrayList;

public class TestCircle2 {
    public static void main(String[] arg) {
    
          CircleArrayList c1 = new CircleArrayList(2.0);
          CircleArrayList c2 = new CircleArrayList(5.0);
        
          // create a type-safe ArrayList object by using generics.
        // ArrayList<Class> nameList = new ArrayList<Class>();
ArrayList <CircleArrayList> cList = new ArrayList<CircleArrayList>();
        
        // add the CircleArrayList objects to the ArrayList object
        cList.add(c1);
        cList.add(c2);
        
        // display the area of the CircleArrayList objects
        System.out.printf("The area : %2.2f\n", cList.get(0).getArea());
        System.out.printf("The area : %2.2f", cList.get(1).getArea());
    }
}