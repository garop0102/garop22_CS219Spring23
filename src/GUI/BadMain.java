package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class BadMain implements ActionListener {

        JTextArea input, output;
        public static void main(String[] args) {
            BadMain m = new BadMain();
            m.go();

        }

        private void go() {
            JFrame frame = new JFrame("CS219 Text Processor");
            frame.setSize(1100,700);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new FlowLayout());

            JLabel header = new JLabel("CS219 Text Processor");
            header.setFont(new Font("Chiller",
                    Font.BOLD, 30));
            header.setBackground(Color.RED);
            header.setOpaque(true);
            frame.add(header);

            // combine label/textarea into a JPanel
            JPanel input_panel = new JPanel();

            // input label
            JLabel input_label = new JLabel("input");
            input_panel.add(input_label);

            // make input text area
            input = new JTextArea(10, 60);
            input.setFont(new Font("Arial", Font.PLAIN, 20));
            input_panel.add(input);
            frame.add(input_panel);

            // combine label/textarea into a JPanel
            JPanel output_panel = new JPanel();

            // input label
            JLabel output_label = new JLabel("output");
            output_panel.add(output_label);

            // make input text area
            output = new JTextArea(10, 60);
            output.setFont(new Font("Arial", Font.PLAIN, 20));
            output_panel.add(output);
            frame.add(output_panel);

            // Add a button to the bottom
            JButton submit = new JButton("Submit");
            submit.addActionListener(this);
            frame.add(submit);

            frame.setVisible(true);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String s = input.getText().toUpperCase();
            output.setText(s);
        }
    }

