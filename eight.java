
import java.io.*;

class Test{
    public static void main(String[] args) {
       // PrintWriter pw=new PrintWriter("data.text");  // FlieNotFoundException
        try {
            PrintWriter pw=new PrintWriter("data.text");
        } catch (FileNotFoundException fnfe) {
              System.out.println(fnfe.getMessage());
        }
    }
}