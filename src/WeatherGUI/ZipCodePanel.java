package WeatherGUI;

import ZipCodes.ZipCode;
import ZipCodes.ZipCodeDB;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZipCodePanel extends JPanel implements ActionListener {

    ZipCodeDB db;
    JTextField zip_field;
    JTextArea output;
    public ZipCodePanel(ZipCodeDB db, JTextArea output){
        db = db;
        output = output;

        JLabel zip_label = new JLabel("Zipcode");
        zip_label.setFont(
                new Font("Arial", Font.BOLD, 18));
        add(zip_label);

        zip_field = new JTextField(10);
        add(zip_field);
        setBorder(new LineBorder(Color.gray,3,true));

        JButton submit = new JButton("Submit");
        submit.setBackground(Color.GREEN);
        submit.addActionListener(this);
        add(submit);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        ZipCode zc = db.findByZip(zip_field.getText());
        output.setText(zc.toString());
    }
}
