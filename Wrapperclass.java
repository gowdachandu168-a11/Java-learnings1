import java.util.Scanner;
class Wrapperclass{
    public static void main(String [] args) {
        int a = 10;
        Integer b = a; // Autoboxing
         Integer c = 10;
         int d=c;
         System.out.println("The value of a is :"+a);
         System.out.println("The value of b Wrapperclass:"+b);
         System.out.println("The value of c Wrapperclass:"+c);
         System.out.println("The value of d variable:"+d);
    }
}

class Wrapperclass2{
    public static void main(String[] args) {
        String str = "123";
        int num = Integer.parseInt(str); // Unboxing
        System.out.println("The value of str is :"+str);
        System.out.println("The value of num is :"+num);
    }
}