import java.io.*;
class Animal{
    String Name;
    public void eat(){
        System.out.println("I can eat");
    }
}
class JerryMouse extends Animal{
    public void display(){
        System.out.println("My Name is " +Name);
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        JerryMouse jm=new JerryMouse();
        jm.Name="Jerry-TheMouse";
        jm.display();
        jm.eat();
    }
}

OUTPUT:
My Name is Jerry-TheMouse
I can eat