import java.io.*;
public class ArrayDemo3{
    static void min(int arr[]){
        int m=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(m>arr[i])
            {
                m=arr[i];
            }
        }
        System.out.println("Minimum element is " +m);
    }
    public static void main(String args[]){
        int a[]={99,44,33,22,66};
        min(a);
    }
}

OUTPUT:
Minimum element is 22