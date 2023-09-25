import java.io.*;
import java.util.*;

class Student {
    public String sname;
    private String sphno;

    public String getsphno() {
        return sphno;
    }

    public void setsphno(String ph) {
        this.sphno = ph;
    }
}

public class EncapsulationDemo {
    public static void main(String args[]) {
        Student st = new Student();
        st.sname = "Umesh";
        st.setsphno("93********");
        System.out.println("Sudent details are \nThe student name is " + st.sname);
        System.out.println("Student phone no is " + st.getsphno());
    }
}

OUTPUT:
Sudent details are 
The student name is Umesh
Student phone no is 93********
