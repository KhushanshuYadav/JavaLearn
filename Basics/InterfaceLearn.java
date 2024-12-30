interface Base1{

    public int var=0;

    void text(String s);

}

class Child1 implements Base1{
    public void text(String s){
        System.out.println("Hello Child Nmaed "+s) ;
    }

    
}
public class InterfaceLearn {
    public static void main(String[] args) {

        Base1 obj=new Child1();
        obj.text("jack"); 

        Base1.var;

        
    }
    
}
