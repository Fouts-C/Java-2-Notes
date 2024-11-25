import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * Simple calculator GUI class.
 * Provides basic arithmetic operations for two operands.
 *
 * @author Carson Fouts
 * @version 2/21
 */
public class Calculator {

    private static final int X_LOC = 100;
    private static final int Y_LOC = 100;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 400;
    private static final String NAME = "carson's calculator";
    private static final String RESULT_PREAMBLE = "Result = ";
    private static final String ERROR_MESSAGE = "Error";

    private JFrame frame;
    private JTextField leftOpField;
    private JTextField rightOpField;
    private JLabel resultLabel;

    /**
     * Constructor for the Calculator class.
     * Creates the main frame, initializes components, and displays the frame.
     */
    public Calculator(){
        createFrame();
        initializeComponents();
        displayFrame();
    }

    /**
     * Gets the main frame of the calculator.
     *
     * @return The main frame.
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Creates the main frame for the calculator.
     * Sets location, size, default close operation, and title.
     */
    private void createFrame(){
        frame = new JFrame();
        frame.setLocation(X_LOC, Y_LOC);
        frame.setSize(WIDTH, HEIGHT);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(NAME);
    }

    /**
     * Initializes the components of the calculator.
     * Calls methods to initialize input fields, buttons, and result label.
     */
    private void initializeComponents(){
        initializeInputs();
        initializeButtons();
        initializeResults();
    }

    /**
     * Displays the main frame of the calculator.
     * Calls pack and setVisible methods.
     */
    private void displayFrame(){
        frame.pack();
        frame.setVisible(true);
    }

    /**
     * Initializes input fields for left and right operands.
     * Adds them to a panel and sets their names.
     */
    private void initializeInputs(){
        leftOpField = new JTextField(5);
        rightOpField = new JTextField(5);

        leftOpField.setName("leftOperand");
        rightOpField.setName("rightOperand");

        JPanel jpCalcInp = new JPanel();
        jpCalcInp.add(rightOpField);
        jpCalcInp.add(leftOpField);
        frame.add(jpCalcInp, BorderLayout.NORTH);
    }

    /**
     * Initializes the result label.
     * Adds it to a panel and sets its name.
     */
    private void initializeResults(){
        resultLabel = new JLabel(RESULT_PREAMBLE);
        resultLabel.setName("resultLabel");
        JPanel jpCalcRes = new JPanel();
        jpCalcRes.add(resultLabel);

        frame.add(jpCalcRes, BorderLayout.WEST);
    }

    /**
     * Initializes arithmetic operation buttons.
     * Adds them to a panel, sets their names, and adds action listeners.
     */
    private void initializeButtons(){
        JButton addButton = new JButton("ADD");
        JButton subButton = new JButton("SUB");
        JButton multButton = new JButton("MULT");
        JButton divButton = new JButton("DIV");

        addButton.setName("addButton");
        subButton.setName("subButton");
        multButton.setName("multButton");
        divButton.setName("divButton");

        JPanel jpCalcBut = new JPanel(new FlowLayout());
        jpCalcBut.add(addButton);
        jpCalcBut.add(subButton);
        jpCalcBut.add(multButton);
        jpCalcBut.add(divButton);

        frame.add(jpCalcBut, BorderLayout.SOUTH);

        addButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event){

                double res = getRightNum() + getLeftNum();
                updateResult(res);
            }

        });

        subButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event){

                double res = getLeftNum() - getRightNum();
                updateResult(res);
            }

        });

        multButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event){

                double res = getRightNum() * getLeftNum();
                updateResult(res);
            }

        });

        divButton.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent event){

                if (getRightNum() == 0){
                    updateResult(Double.NaN);
                }else{
                    double res = getLeftNum() / getRightNum();
                    updateResult(res);
                }
            }

        });
    }

    /**
     * Retrieves the left operand as a double.
     *
     * @return The left operand.
     */
    private double getLeftNum(){
        String textInBox = leftOpField.getText();
        try{

            if (textInBox.isEmpty()) {
                return Double.NaN;
            }

            return Double.parseDouble(leftOpField.getText());

        } catch(NumberFormatException | NullPointerException e) {

            return Double.NaN;
        }
    }

    /**
     * Retrieves the right operand as a double.
     *
     * @return The right operand.
     */
    private double getRightNum(){
        String textInBox2 = rightOpField.getText();
        try{

            if (textInBox2.isEmpty()) {
                return Double.NaN;
            }

            return Double.parseDouble(rightOpField.getText());

        } catch(NumberFormatException | NullPointerException e) {

            return Double.NaN;
        }
    }

    /**
     * Updates the result label based on the provided result value.
     * If the result is NaN, displays an error message.
     *
     * @param result The result value to display.
     */
    private void updateResult(double result){
        if(Double.isNaN(result)){
            resultLabel.setText(RESULT_PREAMBLE + ERROR_MESSAGE);
        }else{
            resultLabel.setText(RESULT_PREAMBLE + result);
        }
    }
}
