

public class ArrayAndLoop {
    public static void main(String[] args) {
        int[] arr=new int[5];

        for(int i=0;i<arr.length;i++) arr[i]=i+1;

        for(int i:arr) System.out.println(i);


    }
}
