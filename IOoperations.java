public class IOoperations {
    public static void main(String[] args) {
        System.out.println("IO Operations ");
        int i=10,j=0;
        try{
            int result = i/j;
            System.out.println(result);
        }catch(Exception ex){
            System.err.println("Error : ");
            System.err.println(ex);
            //System.out.println(ex);
        }

    }
}
