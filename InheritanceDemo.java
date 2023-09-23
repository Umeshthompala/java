//02/09/23
//InheritanceDemo.java
import java.io.*;
import java.util.*;
class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat");
    }
    
}
class JerryMouse extends Animal{
    public void display()
    {
        System.out.println("My name is "+name);
    }
}
class InheritanceDemo{
    public static void main(String args[]){
        JerryMouse jm=new JerryMouse();
        jm.name="Jerry_TheMouse";
        jm.display();
        jm.eat();
    }
}
    
