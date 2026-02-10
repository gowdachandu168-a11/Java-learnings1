import java.util.Scanner;
class example1{
    void hello() {
        System.out.println("Hello");
    }
    public static void main(String[] args){
        example1 obj = new example1();
        obj.hello();
    }
}


class example2{
    void add(int a , int b) {
        System.out.println(a+b);
    }
    public static void main(String[] args){
        example2 obj = new example2();
        obj.add(10,20);
    }
}

class example3{
    static void staticmethod() {
        System.out.println("im a static");
    }
    public static void main(String[] args) {
        staticmethod();
    }
}
  class example4{
    void greet(String name) {
        System.out.println("Hello"+ name);
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scn.nextLine();
        
        example4 obj = new example4();
        obj.greet(name);
    }
  }  