// import java.util.*;
public class pattern1{
public static void main(String[]args) {
   int i,j;
//    char ch = 'A';
int num=100;
for(i=1;i<=13;i++){
    
    for(j=1;j<=i;j++){
        System.out.print(" "+num);
        num--;
         if(num<=0){
        break;
    }
    }
    if(num<=0){
        break;
    }
    
    System.out.println();
   }
}
}