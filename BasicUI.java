import javax.swing.JFrame;
public class BasicUI implements CalculatorUI {
    private JFrame frame;

    // @Override
    @Override
    public void display(){
        frame = new JFrame("Basic Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void getInput(){
        System.out.println("Getting input.");
    }
}
