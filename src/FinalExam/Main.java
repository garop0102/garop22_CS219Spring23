package FinalExam;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //code cannot read comma separated integers.
        //only can read integers with no space
        JFrame frame = new JFrame("CS219 Final Exam");
        frame.setSize(550, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MainPanel());
        frame.setVisible(true);
    }
}
