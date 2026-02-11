class Array1DBasic {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);
        System.out.println("Last element: " + numbers[4]);
    }
}
class Array1DPrint {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

class Array1DEnhanced {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

class Array1DSum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;
        
        for (int num : numbers) {
            sum += num;
        }
        
        System.out.println("Sum: " + sum);
    }
}
class Array1DMax {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 40, 20};
        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        System.out.println("Maximum: " + max);
    }
}
class Array1DMin {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 40, 20};
        int min = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        
        System.out.println("Minimum: " + min);
    }
}

class vowelsCount {
    public static void main(String[] args) {
        String str = "Hello World";
        int count = 0;
        
        for (char ch : str.toCharArray()) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        
        System.out.println("Number of vowels: " + count);
    }
}