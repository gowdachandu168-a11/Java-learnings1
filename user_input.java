import java.lang.System;
import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("The value of a is:" +a);
    }
    
}
class user_input_String{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        String name =scn.nextLine();
        System.out.println("The name is: "+name);

    }
}

class user_input_float{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        float f =scn.nextFloat();
        System.out.println("The value of f is: "+f);

    }
}

class user_input4{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter First number :");
        int a =scn.nextInt();
        System.out.println("Enter a second number:");
        int b = scn.nextInt();
        int sum = a+ b;
        System.out.println("The sum of"+a+"and"+b+"is:" +sum);
    }
}
class user_input3{
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        double d =scn.nextDouble();
        System.out.println("The value of d : "+ d);

    }
}
