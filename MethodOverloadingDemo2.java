//08/09/23
//MethodOverloadingDemo2.java
import java.io.*;
import java.util.*;
class Adder{
    int add(int a,int b){
        return(a+b);
    }
    double add(double x,double y){
        return(x+y);
    }
 }
class MethodOverloadingDemo2{
   public static void main(String args[]){
       Adder ad = new Adder();
       int x=ad.add(10,20);
       double y = ad.add(9.5,99.5);
       System.out.println("Value of x is "+x);
       System.out.println("Value of y is "+y);
   }
}