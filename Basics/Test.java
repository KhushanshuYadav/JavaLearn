import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Names{
    String names;
    Names(String names){
        this.names=names;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}
public class Test {
    public static void main(String[] args) {

        List<Names> namesList=new ArrayList<>();
        namesList.add(new Names("aaaa"));
        namesList.add(new Names("aa"));
        namesList.add(new Names("a"));
        namesList.add(new Names("aaa"));
        namesList.add(new Names("aaaaa"));

        Collections.sort(namesList,(n1,n2)->{

            if(n1.names.length()>n2.names.length()){
                return -1;
            }else if(n1.names.length()<n2.names.length()){
                return 1;
            }else{
                return 0;
            }

        });

        for(Names names:namesList){
            System.out.println(names.names);
        }

       
    }
}
