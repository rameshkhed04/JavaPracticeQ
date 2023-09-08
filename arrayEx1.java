import java.util.*;
public class arrayEx1 {
    public static void main(String[] args) {
        try{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter array size :");
            int size = sc.nextInt();
            int array[] = new int[size];
            System.out.println("Enter num in an arra :");
            for(int i=0;i<size;i++){
                array[i]=sc.nextInt();
            }
            System.out.println("Element of an array :");
            for (int i : array) {
                System.out.println(i);
            }

             //Even number
            System.out.println("all even no");
            for(int i=0;i<size;i++){
                if(array[i]%2==0){                              
                    System.out.println(array[i]);
                }
            }

            //negative no

            System.out.println("All -ve no:");
            for(int i=0;i<size;i++){
                if(array[i]<0){
                    System.out.println(array[i]);
                }
            }

            //search an element
            System.out.println("Search element :");
            int num=sc.nextInt();
            for(int i=0;i<size;i++){
                if(array[i]==num){
                    System.out.println("Your element index is :"+(i+1));
                }
            }

            //smallest number
            System.out.println("Smallest element :");
            int small=array[0];
            for(int i=0;i<size;i++){
                if(small>array[i]){
                    small=array[i];
                }
            }
            System.out.println(small);

            //largest value

             System.out.println("Largest element :");
            int large=array[0];
            for(int i=0;i<size;i++){
                if(large<array[i]){
                    large=array[i];
                }
            }
            System.out.println(large);

            //sum of all value
            System.out.println("Sum is :");
            int sum=0;
            for(int i=0;i<size;i++){
                sum+=array[i];
             }
             System.out.println(sum);



        }
    }catch(Exception ex){
        System.err.println("error :"+ex);
    }
}
}

