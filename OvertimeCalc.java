import javax.swing.*;
import java.awt.event.*;

public class OvertimeCalc {
    public static void main(String[] args) {
        // x pos, y pos, x size, y size

        JFrame frame = new JFrame("Overtime calculator");
        frame.setSize(450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel label = new JLabel("Total Sold :");
        label.setBounds(50, 40, 200, 30);

        JTextField textField = new JTextField();
        textField.setBounds(150, 40, 200, 30);

        JLabel label1 = new JLabel("Quota :");
        label1.setBounds(50, 90, 200, 30);

        JTextField textField1 = new JTextField();
        textField1.setBounds(150, 90, 200, 30);

        JLabel label2 = new JLabel("Days Left :");
        label2.setBounds(50, 140, 200, 30);

        JLabel label3 = new JLabel(" ");
        label3.setBounds(125, 140, 200, 30);

        JButton button0 = new JButton("0");
        button0.setBounds(150, 140, 50, 30);

        JButton button1 = new JButton("1");
        button1.setBounds(200, 140, 50, 30);

        JButton button2 = new JButton("2");
        button2.setBounds(250, 140, 50, 30);

        JButton button3 = new JButton("3");
        button3.setBounds(300, 140, 50, 30);

        JButton button = new JButton("Calculate");
        button.setBounds(200, 180, 100, 30);

        button0.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("0");
                label3.setText("0");
            }
        });

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("1");
                label3.setText("1");
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("2");
                label3.setText("2");
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("3");
                label3.setText("3");
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int quot = Integer.parseInt(textField1.getText());
                int totsold = Integer.parseInt(textField.getText());
                int deadline = Integer.parseInt(label3.getText());
                if (deadline == 0) {
                    deadline = -1;
                }

                int bonus = (totsold - quot) / 5 + (deadline * 15);

                JOptionPane.showMessageDialog(null, "Overtime bonus will be : " + bonus);
            }
        });


        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.add(textField);
        frame.add(textField1);
        frame.add(button);
        frame.add(button0);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
