// public class static_var {
//     static int a=10;
//     static char ch = 'A';
//     static double d=10.2002;
//     static float f= 10.20f;
//     public static void main(String []args){
//         System.out.println("Default Value of static var...");
//         System.out.println("i:"+a+"\nchar:"+ch+"\nd: "+d+"\nf: "+f);
//         a=121;
//         ch='Z';
//         d=20.2222;
//         f=30.20f;

//         System.out.println("After change Value of static var...");
//         System.out.println("i:"+a+"\nchar:"+ch+"\nd: "+d+"\nf: "+f);
//     }
// }


class static_var {
static int i;
static char c;
static double d;
static boolean b;
static void shoeData(){
    System.out.println(" from static function i : " + i + "\nc : " + c + "\nd : " + d + "\nb : " + b);
}
public static void main(String[]args) {
System.out.println("Static variables :");
System.out.println("Default initial values :");
shoeData();
System.out.println("i : " + i + "\nc : " + c + "\nd : " + d + "\nb : " + b);
i = 60;
c = 'J';
d = 12.2022;
b = true;
System.out.println("\nAfter assigning new values to the static variables :");
System.out.println("i : " + i + "\nc : " + c + "\nd : " + d + "\nb : " + b);
System.out.println("Thank you.\n");//static var means the var is allocated only at one time...

}
}
