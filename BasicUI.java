import java.awt.*;

import javax.swing.*;

public class BasicUI implements CalculatorUI {
    
    private JFrame frame;
    private JTextField input1, input2, displayField;
    private Calculator calculator;
    private final int windowHeight, windowWidth;

    public BasicUI(){
        calculator = new Calculator(0, 0, 0, this);
        this.windowWidth = 320;
        this.windowHeight = 512;
    }



    public int getWindowWidth(){
        return windowWidth;
    }

    public int getWindowHeight(){
        return windowHeight;
    }

    @Override
    public void display(){
        frame = new JFrame("Basic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(getWindowWidth(), getWindowHeight());
        // frame.setPreferredSize(null);

        
        frame.setBounds(960, 0, getWindowWidth(), getWindowHeight());
        frame.setVisible(true);
        // frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input1 = new JTextField();
        input2 = new JTextField();
        displayField = new JTextField();

        displayField.setPreferredSize(new Dimension(getWindowWidth(), getWindowHeight() / 5));
        displayField.setEditable(true);

        frame.setLayout(new BorderLayout());
        frame.add(displayField, BorderLayout.NORTH);


        frame.revalidate();
        frame.repaint();

        // frame.add(displayField, GridBagLayout.class);

        JPanel buttonPanel = new JPanel(new GridLayout(7, 5, 10, 10));
        String[] buttonLabels = {
            "sin(", "cos(", "tan(", "log(", "ln(",
            "(", ")", "AC", "<X", "/",
            "^", "7", "8", "9", "*",
            "sqrt(", "4", "5", "6", "-",
            "PI", "1", "2", "3", "+",
            "e", "00", "0", ".", "="
        };

        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(e -> handleButtonClick(label));
            buttonPanel.add(button);
        }

        frame.add(buttonPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();
    }

    private void handleOperation(String operation){
        try {
            String input = displayField.getText();
            double result = Calculator.parseAndEvaluate(input);
            displayField.setText(String.valueOf(result));

            //Add history
            
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void handleButtonClick(String label) {
        if (label.equals("=")) {
            try {
                // Get input from the display field
                String input = displayField.getText();
                // Parse and evaluate the input
                double result = Calculator.parseAndEvaluate(input);
                // Display the result
                displayField.setText(String.valueOf(result));
            } catch (IllegalArgumentException ex) {
                // Show error message for invalid input
                JOptionPane.showMessageDialog(frame, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else if (label.equals("AC")) {
            // Clear the display field
            displayField.setText("");
        } else if (label.equals("<X")) {
            // Remove the last character from the display field
            String currentText = displayField.getText();
            if (!currentText.isEmpty()) {
                displayField.setText(currentText.substring(0, currentText.length() - 1));
            }
        } else {
            // Append the button label to the display field
            displayField.setText(displayField.getText() + label);
        }
    }

    @Override
    public void getInput(){
        System.out.println("Getting input.");
    }
}
