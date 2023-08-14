import java.util.*;
public class arrayEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("Array size :");
        int size= sc.nextInt();
        System.out.println("Enter element in an array:");
        int [] array = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Sorted Array : ");
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(array[i]>array[j]){
                    int temp = array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        for (int i : array) {
            System.out.print(i+" ");
        }

    }
}
