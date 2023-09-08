import java.io.BufferedReader;
import java.io.*;

public class bufferReader {
    public static void main(String[]args){
        try{
        System.out.println("Example of Buffer reader:");
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int name =Integer.parseInt(sc.readLine());
        System.out.println("Name: "+name);
        }catch(Exception ex){
            System.err.println("Error : "+ex);
        }

    }
}
