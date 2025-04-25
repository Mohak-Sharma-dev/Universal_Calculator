import java.util.Scanner;

//Try catch block kyun nahi lagaya?
//Arguments kyun nahi diye?
//Bss do inputs?

public class Calculator {

    private static double num1;
    private static double num2;
    private static String operation;
    private static double result;
    private static CalculatorUI ui;// Assuming BasicUI implements CalculatorUI

    static Scanner input = new Scanner(System.in);

    
    public Calculator(double result, double num2, double num1,String operation,CalculatorUI ui){
        Calculator.num1 = num1;
        Calculator.num2 = num2;
        Calculator.result = result;
        Calculator.operation = operation;
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

    public double getNum1(){
        return num1;
    }

    public double getNum2(){
        return num2;
    }

    public double getResult(){
        return result;
    }

    @Override
    public String toString(){
        return "num1: " + num1 +"\nnum2: " + num2 + "\nresult: " + result;
    }



    public static void main(String[] args) {

        System.out.println("Enter operation, num1 and num2");
        operation = input.nextLine();
        System.out.println("\n");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        
        checkValidity(operation, num1, num2);

        if (checkValidity(operation, num1, num2) == true) {

            performOperation(operation,num1,num2);

        }
        else{
            System.out.println("Invalid operation.");
        }

    }

/***************************************************************************/

    public static boolean checkValidity(String operation, double num1,double num2){

        return (operation.equals("+")|| operation.equals("-")|| operation.equals("x")|| operation.equals("/")|| operation.equals("%")) && num2 != 0;
    }

/***************************************************************************/

    public static int askForFurtherCalculations(double result, double num1, double num2, int count){

        System.out.println("Do you want perform another operation on the result?");
        String cont = input.nextLine();
        if(cont.equals("Y") || cont.equals("y")){
            System.out.println("Choose your operation,num1 and num2: ");
            operation = input.nextLine();
            System.out.println("\n");
            num1 = result;
            num2 = input.nextDouble();

        }else if (cont.equals("N") || cont.equals("n")) {
            count = 0;
            System.out.println("Calculator OFF");
        }
    

        return count;
    }

/***************************************************************************/

    public static double performOperation(String operation,double num1, double num2){

        if(ui == null){
            System.out.println("\nWelcome to the Basic Calculator!");
            int count = -1;
            while(count != 0 ){


                switch (operation) {
                    case "+" -> result = Add(num1,num2);
                    case "-" -> result = Subtract(num1,num2);
                    case "x" -> result = Multiply(num1,num2);
                    case "/" -> result = Divide(num1,num2);
                    case "%" -> result = Modulus(num1,num2);
                    case "OFF" -> {
                        count = 0; 
                        System.out.println("Calculator Turned Off");
                    }
                    default -> System.out.println("Invalid Input.");
                }


                count = askForFurtherCalculations(result, num1, num2, count);
                // System.out.println("Do you want perform another operation on the result?");
                // String cont = input.nextLine();
                // if(cont.equals("Y") || cont.equals("y")){
                //     System.out.println("Choose your operation,num1 and num2: ");
                //     operation = input.nextLine();
                //     System.out.println("\n");
                //     num1 = result;
                //     num2 = input.nextDouble();

                // }else if (cont.equals("N") || cont.equals("n")) {
                //     count = 0;
                //     System.out.println("Calculator OFF");
                // }
            }
        }

        return result;

    }

    public static double Add(double num1, double num2){

        result = num1 + num2;
        System.out.println("Result: " + result);
        return result;

    }

/***************************************************************************/

    public static double Subtract(double num1,double num2){

        result = num1 - num2;
        System.out.println("Result: " + result);
        return result;
    }

/***************************************************************************/

    public static double Multiply(double num1,double num2){

        result = num1 * num2;
        System.out.println("Result: " + result);
        return result;
    }

/***************************************************************************/

    public static double Divide(double num1,double num2)throws ArithmeticException{

        try{
            result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return result;
    }

/***************************************************************************/

    public static double Modulus(double num1,double num2){

        result = num1 % num2;
        System.out.println("Result: " + result);
        return result;
    }
/***************************************************************************/

    // public static double findFactorial(){

    //     System.out.println("Enter a number to find factorial: ");
    //  double num = input.nex double();
    //  double numcopy = num;
    //  double factorial = 1;

    //     if(num > 1){
    //         // double factorial = 1;
    //         for(int i = 1 ; i <= numcopy ; i++){
    //             factorial *= num;
    //             --num;
    //         }
    //         System.out.println(factorial);
    //     }
    //     else
    //     {System.out.println("Factorial must of number greater than 1.");}
    //     return factorial;
    // }

/***************************************************************************/

    // public static double findFibonacci(){
    //     System.out.println("Enter a number to find it's fibonacci sequence upto that number.");
    //     double prev = 0;
    //     double init = 1;
    //     double num = input.nex double();
    //     double numcopy = num;

    //     if(num > init){
    //         double fibonacci = 0;
    //         fibonacci += prev;
    //         fibonacci += init;

    //         for(int i = 0 ; i <numcopy ; i++){
    //             double temp = init;
    //             init++;
                
    //         }
    //     }
    // }


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
/*
 * try{
 * 
 * }catch(){
 * 
 * }
 * 
 */