package WeatherGUI;

import GUI.IOPanel;
import GUI.MainPanel;
import ZipCodes.ZipCodeDB;

import javax.swing.*;


public class Main extends JPanel{



    public static void main(String[] args) {
        //loads ZIPCODE Database
        ZipCodeDB db = new ZipCodeDB();
        db.load();

        JFrame frame = new JFrame("CS219 Fancy App");

        frame.setSize(550, 400);
        // Don't set the layout. Let the top level
        // JPanel do it.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new WeatherPanel(db));
        frame.setVisible(true);


    }
}
