import java.util.HashMap;
import java.util.HashMap;
public class hw13 {
    public static void main (String args[]){
        System.out.println("hello");
        HashMap <Integer, String> streetName = new HashMap<Integer, String>();
        streetName.put(1000,"Liam");
        streetName.put(1001,"Noah");
        streetName.put(1002,"Olivia");
        streetName.put(1003,"Emma");
        streetName.put(1004,"Benjamin");
        streetName.put(1005,"Evelyn");
        streetName.put(1006,"Lucas");
        System.out.println(streetName);
        HashMap <Integer, String> oddstreetName = new HashMap<Integer, String>();
       for ( Integer i: streetName.keySet()) {
           if(i % 2 == 1) {
              oddstreetName.put(i,streetName.get(i)) ;
           }
       }
        System.out.println(oddstreetName);

    }
}