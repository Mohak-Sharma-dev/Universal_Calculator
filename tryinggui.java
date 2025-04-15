
import javax.swing.JFrame;
import javax.swing.SwingUtilities;




public class tryinggui {

    public static void makeWindow(){
        JFrame aWindow = new JFrame("Main Title");
        int windowWidth = 200;
        int windowHeight = 300;

        aWindow.setBounds(100,200,windowWidth,windowHeight);

        aWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aWindow.setVisible(true);
        aWindow.setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            makeWindow();
        });
    }
}
