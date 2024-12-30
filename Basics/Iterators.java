import java.util.ArrayList;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
       ArrayList<String> names = new ArrayList<String>();
        names.add("Alice");
        names.add("Bob");  
        names.add("Charlie");
        names.add("David");
        names.add("Eve");


        Iterator<String>it=names.iterator();
        System.out.println(it.next());
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }
    }
}
