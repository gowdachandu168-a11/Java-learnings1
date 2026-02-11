// Example 1: Simple for loop
class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }
}
class evenNumbers {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println(i);
        }
    }
}
class oddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i+"is an odd number");
        }
    }
}
class evenNumbers2 {
    public static void main(String[] args) {
        int i = 2;
        while (i <= 50) {
            System.out.println(i + " is an even number");
            i += 2;
        }
    }
}
class sumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println("The sum of numbers from 1 to 100 is: " + sum);
    }
}

class dowhileExample {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}