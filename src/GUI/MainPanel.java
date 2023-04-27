package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel extends JPanel{


    IOPanel input,output;
    public MainPanel(){
        //constructs the input panel.
        JLabel header = new JLabel("CS219 Text Processor");
        header.setFont(new Font("Chiller",
                Font.BOLD, 40));
        header.setBackground(Color.YELLOW);
        header.setOpaque(true);
        add(header);

        input = new IOPanel("input");
        add(input);
        output = new IOPanel("output");
        add(output);

        // add the toUpper button
        JButton toUpper = new JButton("To Upper");
        //toUpper.addActionListener(new UpperButtonHandler());
        toUpper.addActionListener
                (e->output.setText(input.getText().toUpperCase()));
        add(toUpper);

        // add the toLower button
        JButton toLower = new JButton("To Lower");
        //toLower.addActionListener(new LowerButtonHandler());
        toLower.addActionListener
                (e->output.setText(input.getText().toLowerCase()));
        add(toLower);
    } // MainPanel constructor



    private class UpperButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // f(g(x)) - function composition
            // f().g(x) - method chaining
            output.setText(input.getText().toUpperCase());
        }
    }
    private class LowerButtonHandler implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            // f(g(x)) - function composition
            // f().g(x) - method chaining
            output.setText(input.getText().toLowerCase());
        }
    }


} // MainPanel class
