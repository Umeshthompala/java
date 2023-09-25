import java.io.*;
public class Greetings extends Object{
    String msg="HAPPY BIRTHDAY UMESH.";
    void display(){
        System.out.println("The Grettings is : " +msg);
    }
    public static void main(String args[]){
        Greetings gr=new Greetings();
        gr.display();
    }
}

OUTPUT:
The Grettings is : HAPPY BIRTHDAY UMESH.