import java.util.Scanner;

public class ScientificCalculator extends Calculator {

    static Scanner input = new Scanner(System.in);
    public static int count = -1;

    public ScientificCalculator(long result, long num2, long num1) {
        super(result, num2, num1);
    }

/***************************************************************************/

    public static void displaySciCalc(){    
        // int count = -1;
        while (count != 0) {
            
            System.out.println("Welcome to the Scientific Calculator!");
            System.out.println("What do you want to do?");
            System.out.println("1. Trigonometric Functions");
            System.out.println("2. Logarithmic & Exponential Functions");
            System.out.println("3. Power and Root Functions");

            count = input.nextInt();

            switch (count) {
                case 1:
                    displayTrigonometric();
                    break;
                case 2:
                    displayTrigonometric();
                    break;
                case 3:
                    displayTrigonometric();
                    break;
                case 0 :
                    System.out.println("Exiting Display SciCalc");
                    break;
                default:
                    break;
            }
        }
    }

/***************************************************************************/

    public static double radiansToDegrees(double degrees){
        return Math.toDegrees(degrees);
    }

/***************************************************************************/

    public static double degreesToRadians(double radians){
        return Math.toRadians(radians);
    }

/***************************************************************************/

    public static void displayTrigonometric(){

        int choice  =-1;
        while (choice != 0) {
              
            System.out.println("Select your Trig Function: ");
            System.out.println("1. Sin\t2. Cos\t3. Tan\t4. Sinh\t5. Cosh\t6. Tanh");
            // System.out.println("2. Cosine.");
            // System.out.println("3. Tangent.");
            // System.out.println("4. Cosecant.");
            // System.out.println("5. Secant.");
            // System.out.println("6. Cotanget.");

            choice = input.nextInt();




            

            double degrees;
            switch (choice) {
                case 1:
                    System.out.println("Enter Angle Measurement for Sine: ");
                    degrees = input.nextDouble();
                    System.out.println("Result: " + Math.sin(degrees));
                    break;
                case 2:
                    System.out.println("Enter Angle Measurement for Cosine: ");
                    degrees = input.nextDouble();
                    System.out.println("Result: " + Math.cos(degrees));
                    break;
                case 3:
                    System.out.println("Enter Angle Measurement for Tangent: ");
                    degrees = input.nextDouble();
                    System.out.println("Result: " + Math.tan(degrees));
                    break;
                case 4:
                    System.out.println("Enter Angle Measurement for Sine Hyperbolic: ");
                    degrees = input.nextDouble();
                    System.out.println("Result: " + Math.sinh(degrees));
                    break;
                case 5:
                    System.out.println("Enter Angle Measurement for Cosine Hyperbolic: ");
                    degrees = input.nextDouble();
                    System.out.println("Result: " + Math.cosh(degrees));
                    break;
                case 6:
                    System.out.println("Enter Angle Measurement for Tangent Hyperbolic: ");
                    degrees = input.nextDouble();
                    System.out.println("Result: " + Math.tanh(degrees));
                    break;
                case 0:
                    System.out.println("Exiting Trigonometric Calculator.");
                    break;
                default:
                    break;
            }
        }
    }

    public static void displayLogsAndExponents(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public static void displayPowerAndRoots(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

    }




     
}
