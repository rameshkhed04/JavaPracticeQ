public class instance_variabels{
    int i=10;
    char ch ='A';

    public void showData(){
        System.out.println("i:"+i+" ch: "+ch);
    }
    public static void main(String[] args) {
        instance_variabels obj1=new instance_variabels();
        System.out.println("i:"+obj1.i);
        System.out.println("ch:"+obj1.ch);
        obj1.showData();
    }
}