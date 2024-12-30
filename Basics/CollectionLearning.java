import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CollectionLearning {   

    public static void main(String[] args) {

        System.out.println("ArrayList");

        Collection<Integer> arr=new ArrayList<>();

        System.out.println(arr.size());
        arr.add(5);
        arr.add(6);
        arr.add(6);
        arr.remove(6);
        arr.add(9);
        System.out.println(arr);

        //++++++++++++++++++++++Stack++++++++++++++++++++++++++++++++++++++++++++++++
        System.out.println("Stack");
        Stack<String>s=new Stack<>();

        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");

        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }

        
        //++++++++++++++++++++Map+++++++++++++++++++++
        Map<Integer,Boolean>m=new HashMap<>();
        m.put(1,true);
        m.put(3,false);
        m.put(4,true);

        int i=0;
        while(!m.isEmpty()){
            if(i!=2 && i!=0)System.out.println(m.get(i));
            m.remove(i);
            i++;
        }




        

        
        
    }
}
