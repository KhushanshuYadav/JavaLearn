class Thread1 extends Thread{
    public void run(){

        for(int i=0;i<500;i++){
            System.out.println("Thread1 is running");
            
        }
       
    }
}
class Thread2 extends Thread{
    public void run(){

        for(int i=0;i<500;i++){
            System.out.println("Thread2 is running");
            
        }
       
    }
}

class Task3 implements Runnable{
    public void run(){

        for(int i=0;i<500;i++){
            System.out.println("Thread3 is running");
            
        }
       
    }
}
public class MultiThreading {
    public static void main(String[] args) {
        //System.out.println("Hello World");

        Thread1 thread1=new Thread1();
        Thread2 thread2=new Thread2();
        Task3 task3=new Task3();

        Thread thread3=new Thread(task3);

        thread3.start();
        thread2.start();


        thread1.start();
        
    }
}
