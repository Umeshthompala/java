import java.io.*;
class Animal{
    public void animalsound(){
        System.out.println("Animal can make Sound");
    }
}
class cow extends Animal{
    public void animalsound(){
        System.out.println("A cow says MAA");
    }
}
class cat extends Animal{
    public void animalsound(){
        System.out.println("The cat says MEWO");
    }
}
public class PolymorphismDemo{
    public static void main(String args[]){
        Animal myanimal=new Animal();
        Animal mycow=new cow();
        Animal mycat=new cat();
        myanimal.animalsound();
         mycow.animalsound();
          mycat.animalsound();
        }
}

OUTPUT:
Animal can make Sound
A cow says MAA
The cat says MEWO