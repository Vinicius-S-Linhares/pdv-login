import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Screen {
    public Screen() {

        JFrame frame = new JFrame("login");


        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        JLabel titulo = new JLabel("BEM VINDO AO PDV SANSLIN");
        titulo.setBounds(290, 50, 300, 150);
        frame.add(titulo);


        JButton login = new JButton("Login");
        login.setBounds(170, 200, 120, 40);

        login.addActionListener(e -> {
            frame.dispose();
            new TelaLogin();
        });

        JButton cadastrar = new JButton("cadastrar");
        cadastrar.setBounds(300, 200, 120, 40);

        cadastrar.addActionListener(e -> {
            frame.dispose();      //
            new TelaDeCadastro();
        });


        JButton sair = new JButton("Sair");
        sair.setBounds(430, 200, 120, 40);



        sair.addActionListener(e -> System.exit(0));


        frame.add(login);
        frame.add(cadastrar);
        frame.add(sair);

    }
}