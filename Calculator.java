
import java.util.Scanner;

public class Calculator{

    private static long num1;
    private static long num2;
    private static long result;

    static Scanner input = new Scanner(System.in);

    
    public Calculator(long result, long num2, long num1){
        Calculator.num1 = num1;
        Calculator.num2 = num2;
        Calculator.result = result;
    }

    public long getNum1(){
        return num1;
    }

    public long getNum2(){
        return num2;
    }

    public long getResult(){
        return result;
    }

    @Override
    public String toString(){
        return "num1: " + num1 +"\nnum2: " + num2 + "\nresult: " + result;
    }



    // public static void main(String[] args){

    //     display();
    // }

    public static void displayCalculator(){

        int count = -1;
        while(count != 0 ){

            System.out.println("\nWelcome to the Universal Calculator! \n Choose any of the given options:\n");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Modulus");

            // Scanner input = new Scanner(System.in);

            int choice = input.nextInt();

            switch (choice) {
                case 1 -> Add();
                case 2 -> Subtract();
                case 3 -> Multiply();
                case 4 -> Divide();
                case 5 -> Modulus();
                case 0 -> {
                    count = 0; 
                    System.out.println("Calculator Turned Off");
                }
                default -> System.out.println("Invalid Input.");
            }


        }

    }

    public static long Add(){
        System.out.println("Enter Num1 and Num2: ");
        num1 = input.nextLong();
        num2 = input.nextLong();
        result = num1 + num2;
        System.out.println("Result: " + result);
        return result;
    }

/***************************************************************************/

    public static long Subtract(){
        System.out.println("Enter Num1 and Num2: ");
        num1 = input.nextLong();
        num2 = input.nextLong();
        result = num1 - num2;
        System.out.println("Result: " + result);
        return result;
    }

/***************************************************************************/

    public static long Multiply(){
        System.out.println("Enter Num1 and Num2: ");
        num1 = input.nextLong();
        num2 = input.nextLong();
        result = num1 * num2;
        System.out.println("Result: " + result);
        return result;
    }

/***************************************************************************/

    public static long Divide(){
        System.out.println("Enter Num1 and Num2: ");
        num1 = input.nextLong();
        num2 = input.nextLong();
        result = num1 / num2;
        System.out.println("Result: " + result);
        return result;
    }

/***************************************************************************/

    public static long Modulus(){
        System.out.println("Enter Num1 and Num2: ");
        num1 = input.nextLong();
        num2 = input.nextLong();
        result = num1 % num2;
        System.out.println("Result: " + result);
        return result;
    }

}