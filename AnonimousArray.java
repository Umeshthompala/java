import java.io.*;
public class AnonimusArray{
    static void max(int arr[]){
        int m=arr[0];
        for(int i=1;i<arr.len;i++)
        {
            if(m<arr[i])
            {
                m=arr[i];
            }
        }
        System.out.println("Maximum element is " +m);
    }
    public static void main(String args[]){
        max(new int[]{99,44,33,22,6});
    }
}

OUTPUT:
Maximum element is 99