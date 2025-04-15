import java.util.Scanner;
import javax.swing.SwingUtilities;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CalculatorUI basicUI = new BasicUI();
            Calculator UIcalculator = new Calculator(0,0,0,basicUI);
            UIcalculator.start();
        });
        //Calculator c1 = new Calculator(0, 0, 0);
        // Calculator.displayCalculator();
        
        // ScientificCalculator.displaySciCalc();

        // int num1 = input.nextInt();
        // int num2 = input.nextInt();

        // System.out.println(Math.sinh(num1));
        // System.out.println(Math.sin(num2));

    }
}
