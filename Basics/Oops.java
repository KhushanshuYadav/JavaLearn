

class Parent{
    void show(){
        System.out.println("Parent");
    }
} 

class Child extends Parent{
    void show(){
        System.out.println("Child");
    }
}
public class Oops{
    public static void main(String[] args){

        Parent cObj=new Child();
        cObj.show();
        
       
        
        

    }
    
}