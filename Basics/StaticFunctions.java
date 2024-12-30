
class Add{
    public static int add(int a, int b) {
        return a + b;
    }
}
public class StaticFunctions {  

    public  int add(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        
        StaticFunctions hello= new StaticFunctions();
        
        System.out.println(hello.add(1, 2));
        System.out.println(addStatic(1, 2));
        System.out.println(Add.add(1, 2));


        boolean x=false;
        if(!x) System.out.println('T');

    }

    public static int addStatic(int a, int b) {
        return a + b;
    }   
}