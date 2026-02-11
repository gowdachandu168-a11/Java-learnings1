public class conditinal {
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
// if else statement
class ifElse{
    public static void main(String [] args) {
        int num1 =5;
        int num2 =10;
        if(num1>num2){
            System.out.println("num1 is greater than num2");
        }
        else if(num1<num2){
            System.out.println("num2 is greater than num1");
        }
        else{
            System.out.println("num1 and num2 are equal");
        }
    }
}
// nested if statement
class nestedif{
    public static void main(String [] args) {
        int num1 =5;
        int num2 =10;
        int num3 =15;
        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 is the greatest");
            }
            else{
                System.out.println("num3 is the greatest");
            }
        }
        else{
            if(num2>num3){
                System.out.println("num2 is the greatest");
            }
            else{
                System.out.println("num3 is the greatest");
            }
        }
    }
}
// switch statement
class switchstatement{
    public static void main(String [] args) {
        int day = 3;
        switch(day){
            case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("Tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thursday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
            case 7:
            System.out.println("Sunday");
            break;
            default:
            System.out.println("Invalid day");
        }
    }
}
 //logical operators
class Logical {
    public static void main(String[] args) {
        int age = 25;
        boolean hasTicket = true;
        
        // AND operator
        if (age >= 18 && hasTicket) {
            System.out.println("You can enter the movie");
        }
        
        // OR operator
        boolean isWeekend = true;
        boolean isHoliday = false;
        
        if (isWeekend || isHoliday) {
            System.out.println("You can relax!");
        }
        
        // NOT operator
        boolean isRaining = false;
        
        if (!isRaining) {
            System.out.println("You don't need an umbrella");
        }
    }
}