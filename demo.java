public class demo {
    public static void main(String [] args) {
        int num1 =5;
        int num2 =10;
        if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else{
            System.out.println("num2 is greater than num1");
        }
    }
    
}

class demo1 {
    public static void main(String [] args){
        String a= new String("Apple");
        String b= new String("Apple");
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

class array {
    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

class array2 {
    public static void main(String [] args) {
        int[] arr = {1,2,3,4,5};
        for(int num:arr){
            System.out.println(num);
        }
    }
}