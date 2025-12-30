import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaLogin {
    public TelaLogin() {
        JFrame frame = new JFrame("Tela de Login");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Tela de Login");
        label.setBounds(290, 50, 300, 150);
        frame.add(label);

        frame.setVisible(true);
    }
}