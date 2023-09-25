import java.io.*;
public class CmdLineArgsV2 extends Object {
    public static void main (String[] args){
        if(args.length!=2)//they not contain paranthesis for length.
        {
            System.out.println("Invalid number of arguments \n you need to pass two integers in between 0 to 10,000");
        }
        else
        {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x+y;
        System.out.println("Sum of "+x+" and "+y+" is "+z);
        }
    }
}
OUTPUT:
Sum of 456 and 345 is 801