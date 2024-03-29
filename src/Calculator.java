import MenuFunctions.CalculatorMenuBar;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame {
    private JMenuBar menuBar;
    private JLabel recentEntry;
    private JPanel history , keypad ;
    private JTextArea screen , recentHistory;
    private JButton viewHistory , btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 ,
                                btn9 , btn10 , btn11 , btn12 , btn13 , btn14 , btn15 , btn16 ;
    private GridLayout grid;

    //All required attributes
    private int value1 = 0;
    private boolean value1Status = Constants.DEACTIVATED;
    private int value2 = 0;
    private boolean value2Status = Constants.DEACTIVATED;
    private int operator = Constants.NOT_SELECTED;
    private String screenText = "";

    public Calculator()
    {
        setLayout(null);

        // initialize menu bar
        menuBar = new JMenuBar();
        CalculatorMenuBar calculatorMenuBar = new CalculatorMenuBar(menuBar , this);

        //JLabel
        recentEntry = new JLabel("Calculations");
        Font font = new Font("Arial" , Font.BOLD , 20);
        recentEntry.setFont(font);

        //initialise panels
        history = new JPanel();
        history.setLayout(new BorderLayout());
        history.setBorder( new EmptyBorder(10 , 10 , 10 , 10));

        //Set Keyboard
        grid = new GridLayout(4 , 4 , 10 , 10);
        keypad = new JPanel();
        keypad.setLayout(grid);

        btn1 = new JButton("1");
        CommonUI.setButtonUI(btn1);

        btn2 = new JButton("2");
        CommonUI.setButtonUI(btn2);

        btn3 = new JButton("3");
        CommonUI.setButtonUI(btn3);

        btn4 = new JButton("+");
        CommonUI.setButtonUI(btn4 , Color.ORANGE);

        btn5 = new JButton("4");
        CommonUI.setButtonUI(btn5);

        btn6 = new JButton("5");
        CommonUI.setButtonUI(btn6);

        btn7 = new JButton("6");
        CommonUI.setButtonUI(btn7);

        btn8 = new JButton("-");
        CommonUI.setButtonUI(btn8 , Color.ORANGE);

        btn9 = new JButton("7");
        CommonUI.setButtonUI(btn9);

        btn10 = new JButton("8");
        CommonUI.setButtonUI(btn10);

        btn11 = new JButton("9");
        CommonUI.setButtonUI(btn11);

        btn12 = new JButton("*");
        CommonUI.setButtonUI(btn12 , Color.ORANGE);

        btn13 = new JButton("Reset");
        CommonUI.setButtonUI(btn13);

        btn14 = new JButton("0");
        CommonUI.setButtonUI(btn14);

        btn15 = new JButton("=");
        CommonUI.setButtonUI(btn15 , Color.blue);

        btn16 = new JButton("/");
        CommonUI.setButtonUI(btn16 , Color.ORANGE);

        CommonUI.setButtons(keypad,btn1 , btn2 , btn3 , btn4 , btn5 , btn6 , btn7 , btn8 ,
                btn9 , btn10 , btn11 , btn12 , btn13 , btn14 , btn15 , btn16);


        //initialise text field
        screen = new JTextArea();
        screen.setEnabled(false);
        screen.setDisabledTextColor(Color.black);
        Font font1 = new Font("Arial" , Font.PLAIN , 15);
        screen.setFont(font1);
        screen.setBorder( new EmptyBorder(10 , 10 , 10 , 10));

        // Recent calculations and their history
        recentHistory = new JTextArea("History");
        recentHistory.setEnabled(false);
        recentHistory.setBorder( new EmptyBorder(30 , 0 , 0 , 0));
        recentHistory.setDisabledTextColor(Color.GRAY);
        Font font2 = new Font("Arial" , Font.BOLD , 12);
        recentHistory.setFont(font2);

        history.add("North" , recentEntry);
        history.add("Center" , recentHistory);

        //initialise button
        viewHistory = new JButton("R\nE\nC");

        // set colors to component
        screen.setBackground(Color.white);
        screen.setForeground(Color.BLACK);

        viewHistory.setBackground(Color.blue);
        viewHistory.setForeground(Color.white);

        keypad.setBackground(Color.black);
        history.setBackground(Color.white);

        // add bounce component in window
        screen.setBounds( 5, 5 , 280 , 100);
        viewHistory.setBounds( 295, 5 , 60 , 100);
        keypad.setBounds( 5, 115 , 350 , 400);
        history.setBounds(365 , 5 , 210 , 510);


        // add component to window
        add(screen);
        add(viewHistory);
        add(keypad);
        add(history);
        setJMenuBar(menuBar);

        // Add Clicks Events
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (1);
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (2);
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (3);
            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (4);
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (5);
            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (6);
            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (7);
            }
        });
        btn10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (8);
            }
        });
        btn11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (9);
            }
        });
        btn14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setButtonNumber (0);
            }
        });

        //click on operator

        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setOperator (Constants.ADDITION);
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setOperator (Constants.SUBTRACTION);
            }
        });
        btn12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setOperator (Constants.MULTIPLICATION);
            }
        });
        btn16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                setOperator (Constants.DIVISION);
            }
        });


        // Operation click Perform Operation
        btn15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                performTask();
            }
        });

        // Reset Function

        btn13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resetOperation();
            }
        });
        setSize(600 , 580 );
        setVisible(true);
        getContentPane().setBackground(Color.black);
    }

    private void resetOperation()
    {
        value1 = 0;
        value1Status = Constants.DEACTIVATED;
        value2 = 0;
        value2Status = Constants.DEACTIVATED;
        operator = Constants.NOT_SELECTED;
        screenText = "";
        screen.setText("");
    }

    private void performTask()
    {
        if (value1Status == Constants.DEACTIVATED && operator == Constants.NOT_SELECTED && value2Status == Constants.DEACTIVATED)
        {
            screen.setText(Constants.VAL1_EXCEPTION);
        } else if (value1Status == Constants.ACTIVATED && operator == Constants.NOT_SELECTED && value2Status == Constants.DEACTIVATED)
        {
            screen.setText(Constants.OPERATOR_EXCEPTION);
        } else if (value1Status == Constants.ACTIVATED && operator == Constants.SELECTED && value2Status == Constants.DEACTIVATED)
        {
            screen.setText(Constants.VAL2_EXCEPTION);
        }
        else
        {
            CalculatorEvents calculatorEvents = new CalculatorEvents();
            String answer = calculatorEvents.getAnswer(value1 , value2 , operator);
            screenText = screenText + "\n= " +answer;
            screen.setText(screenText);
            CalculatorData.setData(value1 , value2 , operator , answer);
        }

    }

    private void setOperator(int operatorCode)
    {

        if (value1Status == Constants.ACTIVATED)
        {
            CalculatorEvents calculatorEvents = new CalculatorEvents();
            String setOperator = calculatorEvents.getOperator(operator);
            screenText = screenText + setOperator;
            screen.setText(screenText);
            operator = operatorCode;
        }
        else
        {
            screen.setText(Constants.VAL1_EXCEPTION);
            Timer timer = new Timer(1500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    screen.setText(screenText);
                }
            });

        }
    }

    private void setButtonNumber(int buttonValue)
    {
        if (value1Status == Constants.DEACTIVATED)
        {
            value1 = buttonValue;
            value1Status = Constants.ACTIVATED;
            screenText = screenText + Integer.toString(buttonValue)+"\n";
            screen.setText(screenText);
        }
        else if (value1Status == Constants.ACTIVATED && operator == Constants.NOT_SELECTED)
        {
            screen.setText(Constants.OPERATOR_EXCEPTION);
            Timer timer = new Timer(1500, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    screen.setText(screenText);
                }
            });

        }
        else if(value2Status == Constants.DEACTIVATED)
        {
            CalculatorEvents calculatorEvents = new CalculatorEvents();
            String setOperator = calculatorEvents.getOperator(operator);
            value2 = buttonValue;
            value2Status = Constants.ACTIVATED;
            screenText = screenText + setOperator + Integer.toString(value2);
            screen.setText(screenText);
        }

    }

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
    }
}