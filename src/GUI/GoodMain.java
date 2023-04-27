package GUI;

import javax.swing.*;

public class GoodMain {

    public static void main(String[] args) {
        JFrame frame = new JFrame("CS219 Fancy App");
        frame.setSize(1100, 800);
        // Don't set the layout. Let the top level
        // JPanel do it.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainPanel());
        frame.setVisible(true);

    }
}
