package WeatherGUI;

import ZipCodes.ZipCodeDB;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class WeatherPanel extends JPanel {

    public WeatherPanel(ZipCodeDB db){
        JLabel header = new JLabel("CS219 Weather App");
        header.setFont(new Font("Algerian",
                Font.BOLD, 42));

        header.setBorder(new EtchedBorder(BevelBorder.RAISED));
        header.setOpaque(true);
        add(header);


        //output text area
        JTextArea output = new JTextArea(4,20);
        output.setFont(new Font("Comic Sans MS",Font.BOLD,22));
        output.setBorder(new TitledBorder(new LineBorder(Color.PINK
        ),"Weather Data"));
        add(output);
        output.setLineWrap(true);
        JPanel zp = new ZipCodePanel(db,output);
        add(zp);
    }

}
