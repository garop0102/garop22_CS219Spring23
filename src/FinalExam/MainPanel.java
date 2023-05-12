package FinalExam;

import GUI.IOPanel;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class MainPanel extends JPanel {

    JTextArea input, output;


    public MainPanel() {
        JLabel header = new JLabel("Final Exam Part 2");
        header.setFont(new Font("Times New Roman",
                Font.BOLD, 40));
        header.setBackground(Color.WHITE);
        header.setOpaque(true);
        add(header);

        JPanel input_panel = new JPanel();
        JLabel input_label = new JLabel();
        input_panel.add(input_label);
        input = new JTextArea(10, 50);
        input.setFont(new Font("Arial", Font.PLAIN, 10));
        Border TitledBorder = new TitledBorder("Input");
        input.setBorder(TitledBorder);
        input_panel.add(input);
        add(input_panel);

        JPanel output_panel = new JPanel();
        JLabel output_label = new JLabel();
        output_panel.add(output_label);
        output = new JTextArea(10, 50);
        output.setFont(new Font("Arial", Font.PLAIN, 10));
        Border TitledBorder2 = new TitledBorder("Output");
        output.setBorder(TitledBorder2);
        output_panel.add(output);
        add(output_panel);

        JPanel button_panel = new JPanel();
        JButton stats = new JButton("Stats");
        button_panel.add(stats);
        //ActionListener statistics = new statistics();
        ActionListener statistics = new statistics();
        stats.addActionListener(statistics);
        add(button_panel);


    }
    private class statistics implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(Integer.valueOf(input.getText()));
            output.setText(String.valueOf(Collections.min(arr)));
        }
    }
}
