import java.io.*;
public class bufferReader2 {
    public static void main(String[] args) {
        try{
        BufferedReader objBR = new BufferedReader(new InputStreamReader(System.in));
        // System.out.println("Command Line Arguments passed are : " + args.length);

        System.out.println("Enter name:");
        String name = objBR.readLine();
        System.out.println("Enter Roll No:");
        int rollNo = Integer.parseInt(objBR.readLine());
        System.out.println("Enter percentage :");
        float percentage = Integer.parseInt(objBR.readLine());

        System.out.println("Student Details\n Name : "+name+"\nRoll No : "+rollNo+"\nPercentage : "+percentage);
        }catch(Exception ex){
            System.err.println("Error :"+ex);
        }
    }
}
