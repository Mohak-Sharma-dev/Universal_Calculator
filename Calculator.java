import java.util.Scanner;

public class Calculator {

    private static long num1;
    private static long num2;
    private static long result;
    private static CalculatorUI ui;// Assuming BasicUI implements CalculatorUI

    static Scanner input = new Scanner(System.in);

    
    public Calculator(long result, long num2, long num1,CalculatorUI ui){
        Calculator.num1 = num1;
        Calculator.num2 = num2;
        Calculator.result = result;
        Calculator.ui = ui;
    }

    public void start(){
        if(ui != null){
            ui.display();
            ui.getInput();
        }else{
            System.out.println("No UI detected. Running without.");
        }
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



    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Enter an expression (e.g., sin(90), log(100)): ");
        // String input = scanner.nextLine();

        // try {
        //     double result = parseAndEvaluate(input);
        //     System.out.println("Result: " + result);
        // } catch (IllegalArgumentException e) {
        //     System.out.println("Error: " + e.getMessage());
        // }

        findFactorial();
    }

    public static long performOperation(String operation,long num1, long num2){
        switch (operation) {
            case "Add" -> Add();
            case "Subtract" -> Subtract();
            case "Multiply" -> Multiply();
            case "Divide" -> Divide();
            case "Modulus" -> Modulus();
            default -> System.out.println("Invalid Operation.");
        }

        // switch (operation) {
        //     case "Add" -> Add();
        //     case "Subtract" -> Subtract();
        //     case "Multiply" -> Multiply();
        //     case "Divide" -> Divide();
        //     case "Modulus" -> Modulus();
        //     default -> System.out.println("Invalid Operation.");
        // }

        //Only execute this part if the UI is not implemented
        if(ui == null){
            System.out.println("\nWelcome to the Basic Calculator!");
            int count = -1;
            while(count != 0 ){

                System.out.println("Choose any of the given options:\n");
                System.out.println("1. Add\t2. Subtract\t3. Multiply\t4. Divide\t5. Modulus");
                // System.out.println("2. Subtract");
                // System.out.println("3. Multiply");
                // System.out.println("4. Divide");
                // System.out.println("5. Modulus");

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

        return result;

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
        if(num2 != 0 ){
            result = num1 / num2;
            System.out.println("Result: " + result);
        }
        else{System.out.println("Math Error: Cannot Divide by Zero");}
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
/***************************************************************************/

    public static long findFactorial(){

        System.out.println("Enter a number to find factorial: ");
        long num = input.nextLong();
        long numcopy = num;
        long factorial = 1;

        if(num > 1){
            // long factorial = 1;
            for(int i = 1 ; i <= numcopy ; i++){
                factorial *= num;
                --num;
            }
            System.out.println(factorial);
        }
        else
        {System.out.println("Factorial must of number greater than 1.");}
        return factorial;
    }

/***************************************************************************/

    public static long findFibonacci(){
        System.out.println("Enter a number to find it's fibonacci sequence upto that number.");
        long prev = 0;
        long init = 1;
        long num = input.nextLong();
        long numcopy = num;

        if(num > init){
            long fibonacci = 0;
            fibonacci += prev;
            fibonacci += init;

            for(int i = 0 ; i <numcopy ; i++){
                long temp = init;
                init++;
                
            }
        }
    }


/***************************************************************************/

    public static double parseAndEvaluate(String input) {
        try {
            if (input.contains("sin")) {
                int start = input.indexOf("sin(") +4;
                int end = input.indexOf(")", start);
                double value = Double.parseDouble(input.substring(start,end));
                return Math.sin(Math.toRadians(value));
            }
            if (input.contains("cos")) {
                int start = input.indexOf("cos(") +4;
                int end = input.indexOf(")", start);
                double value = Double.parseDouble(input.substring(start,end));
                return Math.cos(Math.toRadians(value));
            }
            if (input.contains("tan")) {
                int start = input.indexOf("tan(") +4;
                int end = input.indexOf(")", start);
                double value = Double.parseDouble(input.substring(start,end));
                return Math.cos(Math.toRadians(value));
            }
            if (input.contains("log")) {
                int start = input.indexOf("log(") +4;
                int end = input.indexOf(")", start);
                double value = Double.parseDouble(input.substring(start,end));
                return Math.log10(Math.toRadians(value));
            }
            if (input.contains("ln")) {
                int start = input.indexOf("ln(") +4;
                int end = input.indexOf(")", start);
                double value = Double.parseDouble(input.substring(start,end));
                return Math.log(Math.toRadians(value));
            }
        } catch (Exception e) {
            throw  new IllegalArgumentException("Invalid Input: " + input);
        }
        throw  new IllegalArgumentException("Invalid Input: " + input);

    }

}
