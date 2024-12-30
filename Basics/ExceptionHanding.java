public class ExceptionHanding {
    public static void main(String[] args) {
        try{
            throw new Exception();
        }
        catch(Exception e){
            System.out.println("Exception caught");
        }
        finally{
            System.out.println("Finally block");
            //will always execute no matter what
        }
        System.out.println("After finally block");  //will be executed if no exception is thrown or is handled
    }
}
