import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class MyPanel extends JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Login Screen");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel usernamePanel = new JPanel();
        usernamePanel.add(new JLabel("Username:"));
        JTextField usernamePrompt = new JTextField(10);
        usernamePanel.add(usernamePrompt);
        usernamePanel.setLayout(new FlowLayout());

        JPanel passwordPanel = new JPanel();
        passwordPanel.add(new JLabel("Password:"));
        passwordPanel.add(new JTextField(10));
        passwordPanel.setLayout(new FlowLayout());

        JPanel loginButton = new JPanel();
        JButton button = new JButton("Login");
        button.addActionListener(e -> System.out.println(e.getActionCommand()));

        loginButton.add(button);
        JPanel sellSoul = new JPanel();
        sellSoul.add(new JCheckBox("Sell your soul to our company"));

        JPanel panel = new JPanel();
        panel.add(usernamePanel);
        panel.add(passwordPanel);
        panel.add(loginButton);
        panel.add(sellSoul);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        frame.setContentPane(panel);
        frame.setVisible(true);
    }
}