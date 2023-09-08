public class arrays1 {
    public static void main(String[] args) {
        System.out.println("Array Example...");
        //decalaration of array
        int array[] = new int[5];
        // System.out.println("array[0]="+array[0]);
        // System.out.println("array[1]="+array[1]);
        // System.out.println("array[2]="+array[2]);
        // System.out.println("array[3]="+array[3]);
        // System.out.println("array[4]="+array[4]);

        //while using n of statement we use loop
        int i=0;
        while(i<7){
            System.out.printf("\na[%d] = "+array[i],i);
            i++;
        }
        
    }
}
