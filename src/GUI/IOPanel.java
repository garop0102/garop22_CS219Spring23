package GUI;

import javax.swing.*;
import java.awt.*;

//input output panel class
public class IOPanel extends JPanel {

    private JLabel label;
    private JTextArea area;

    public IOPanel(String s){
        label = new JLabel(s);
        label.setFont(new Font("Arial", Font.BOLD, 20));


        add(label); // calls add in the base class. (JPanel)
        area = new JTextArea(10,60);
        area.setFont(new Font("Arial", Font.PLAIN, 20));
        add(area);
    } // IOPanel Constructor

    public String getText(){
        return area.getText();
    }

    public void setText(String s){
        area.setText(s);
    }

} // IOPanel Class
