public class TestCircle1 {
       public static void main(String[] args)
            ArrayList cList = new ArrayList();
            
            cList.add(new CircleArrayList(2.0));
            cList.add(new CircleArrayList(5.0));
          
            System.out.printf("The
area : %2.2f\n", ((CircleArrayList)cList.get(0)).getArea());
            System.out.printf("The
area : %2.2f", ((CircleArrayList)cList.get(1)).getArea());
       }
}