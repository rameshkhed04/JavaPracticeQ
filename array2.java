import java.util.*;
public class array2 {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int array [] = new int[5];
            int i;
            for(i=0;i<5;i++)
            {
                array[i]=sc.nextInt();
            }
            System.out.println("Final array :");

            for (int j : array) {
                System.out.print(j+" ");
            }
            System.out.println("Length of an array:"+array.length);
        }
    }
}
