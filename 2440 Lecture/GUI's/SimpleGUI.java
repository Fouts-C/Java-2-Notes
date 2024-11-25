import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleGUI {
    
    public final int LOCATION = 300;
    public final int LOCATION2 = 200;
    public final int SIZE = 400;
    public final int SIZE2 = 150;

    private JFrame frame;
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;
    private JLabel titleLabel;
    private JLabel resultLabel;

    private JButton sqrtButton;
    private JTextField inputTextField;

    public SimpleGUI(){
        frame = new JFrame();
        frame.setLocation();
        frame.setSize(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("SQRT Calculator");

        initializeComponents();

        frame.setVisible(true);
    }

    public void initializeComponents(){

        titleLabel = new JLabel("Enter a number: ");

        inputTextField = new JTextField(10);
        resultLabel = new JLabel("=________");

    }
}
