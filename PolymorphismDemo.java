//02/09/23
//PolymorphismDemo.java
import java.io.*;
import java.util.*;
class Animal{
    public void animalsound(){
        System.out.println("An animal can make a sound");
    }
    
}
class Cow extends Animal{
    public void animalsound()
    {
        System.out.println("A cow says maa");
    }
}
class Cat extends Animal{
    public void animalsound(){
        System.out.println("A cat says meow");
    }
}
class PolymorphismDemo{
    public static void main(String args[]){
        Animal ma=new Animal();
        Animal mc = new Cow();
        Animal mycat= new Cat();
        ma.animalsound();
        mc.animalsound();
        mycat.animalsound();
    }
}