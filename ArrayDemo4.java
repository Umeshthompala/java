import java.io.*;
public class ArrayDemo4{
    static int[] getarray(){
        int a[]={99,44,33,22,66};
        return a;
    }
       public static void main(String args[]){
           int arr[]=getarray();
           System.out.println("The array elements is ");
           for(int i=0;i<arr.length;i++)
           {
               System.out.println(arr[i]);
           }
       }
}

OUTPUT:
The array elements is 
99
44
33
22
66