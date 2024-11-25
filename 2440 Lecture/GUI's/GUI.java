
    
    //Steps to create GUI
    //Declare and allocate JFrame & set properties
    //Organize the components of your GUI into categories
    //For each category, declare and allocate a JPanel & decide on a layout manager
    //Create and add listeners.

    //


    //Coding a JFrame
    public CalculatorFrame(){

        JFrame calculatorFrame;
        calculatorFrame = new JFrame();
        calculatorFrame.setLocation(100, 100);
        calculatorFrame.setSize(400, 400);
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorFrame.setTitle("My Simple Calculator");

        initializeComponents();

        calculatorFrame.pack(); //Optional - condences/packs everything together
        calculatorFrame.setVisible(true);

        //JPanel
        JPanel button1 = new JPanel();

        //JLabel
        JLabel jResult = new JLabel("Results= ");
        jResult.setText("Result= " + c);
        //Also has a getText() method to get the text currently inside the label

        //JTextField - Allows user to input text but can use parseDouble or parseInt to change from string
        JTextField jtFirst = new JTextField(10);
        //Also has a getText/setText methods
        
        //How to use Parse
        String s = jtFirst.getText();
        double num = Double.parseDouble(s);

        //Creating a button/Uses actionlistener to detect niyse clicks *Usually added to JPanels
        JButton jbAdd = new JButton("Add");


        //Layout Manager
        JFrame testFrame = new JFrame();
        JPanel buttonPanel = new JPanel();
        JButton jbTest = new JButton("Test Me");

        buttonPanel.add(jbTest);
        testFrame.add(buttonPanel, BoarderLayout.PAGE_END);

        //BorderLayout - default layout divided into 5 parts and used for the lab

        //ActionListener

        public void actionPerformed(ActionEvent e){
            //code to execute
        }

        //Options to implement
        //Have the GUI class itself implement ActionListener
        //Put an inner class inside your GUI class that implements ActionListener
        //Use an anonymous inner class

        //1st option
        /* 


        public class CurrentProgram implements ActionListener(){

            public void initializeComponents(){
                JButton jbSubmit = new JButton("Submit");
                jbSubmit.addListener(this);
            }

            public void actionPerformed(ActionEvent e){

                //Code when the button is pressed
            }

        }
        */
    }
