package MenuFunctions;

import javax.swing.*;
import java.awt.event.*;
public class CalculatorMenuBar {

    private JFrame frame;
    private JMenu menu  , saveData, help ;
    private JMenuItem showHistory , deleteHistory , activate , deactivate , helpUs;

    public CalculatorMenuBar(JMenuBar menuBar , JFrame frame)
    {
        this.frame = frame;
        menu = new JMenu("Menu");
        saveData = new JMenu("Save Data");
        help = new JMenu("Help");

        showHistory = new JMenuItem("Show History");
        deleteHistory = new JMenuItem("delete History");

        activate = new JMenuItem("Activate");
        deactivate = new JMenuItem("Deactivate");

        helpUs = new JMenuItem("You Are Helpless");

        menu.add(showHistory);
        menu.add(deleteHistory);

        saveData.add(activate);
        saveData.add(deactivate);

        help.add(helpUs);

        menuBar.add(menu);
        menuBar.add(saveData);
        menuBar.add(help);

        frame.add(menuBar);

        showHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        deleteHistory.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        activate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        deactivate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });


        helpUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });



    }

    public static void main(String[] args) {

        //CalculatorMenuBar bar = new CalculatorMenuBar();
    }

}
