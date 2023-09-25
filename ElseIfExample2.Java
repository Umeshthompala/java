import java.io.*;
import java.util.*;
public class ElseIfExample2{
    public static void main(String args[]){
        System.out.println("Enter 3 subjects marks:");
       Scanner sc=new Scanner(System.in);
       int m1=sc.nextInt();
       int m2=sc.nextInt();
       int m3=sc.nextInt();
       int total=m1+m2+m3;
       float avg=(float)total/3;
        if(avg>=90)
        {
            System.out.println("Student passed in 1stClass");
             System.out.println("KEEP IT UP!");
            
        }
        else if(avg>=80)
        {
            System.out.println("Student passed in 2ndClass");
            System.out.println("CONGRATULATIONS!!");
            
        }
        else if(avg>=70)
        {
            System.out.println("Student passed in 3rdClass");
        }
        else 
        {
            System.out.println("your Average is ");
            System.out.println("Imporve ur learning");
        }

    }
}

OUTPUT:
Enter 3 subjects marks:
56
80
80
Student passed in 3rdClass

OUTPUT:
Enter 3 subjects marks:
90
86
85
Student passed in 2ndClass
CONGRATULATIONS!!

OUTPUT:
Enter 3 subjects marks:
98
95
80
Student passed in 1stClass
KEEP IT UP!