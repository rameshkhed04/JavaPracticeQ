// import java.util.*;
public class pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter num :");;
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        int num=10;
        int temp=num;
        //Star Pattern pyramid
        for(int i=0;i<temp;i++){
            for(int j=num;j>=0;j--){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            num--;
        }
    }
}
