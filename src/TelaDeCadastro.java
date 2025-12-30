import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaDeCadastro {
    public TelaDeCadastro() {
        JFrame frame = new JFrame("Tela de Cadastro");
        frame.setSize(800, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        JLabel label = new JLabel("Tela De Cadastro");
        label.setBounds(330, 20, 300, 120);
        frame.add(label);

        JLabel lblLogin = new JLabel("Login:");
        lblLogin.setBounds(250, 100, 100, 25);
        frame.add(lblLogin);

        JTextField txtLogin = new JTextField();
        txtLogin.setBounds(350, 100, 200, 25);
        frame.add(txtLogin);


        JLabel lblSenha = new JLabel("Senha:");
        lblSenha.setBounds(250, 150, 100, 25);
        frame.add(lblSenha);

        JPasswordField txtSenha = new JPasswordField();
        txtSenha.setBounds(350, 150, 200, 25);
        frame.add(txtSenha);


        JLabel lblConfirmar = new JLabel("Confirmar Senha:");
        lblConfirmar.setBounds(250, 200, 120, 25);
        frame.add(lblConfirmar);

        JPasswordField txtConfirmar = new JPasswordField();
        txtConfirmar.setBounds(350, 200, 200, 25);
        frame.add(txtConfirmar);


        JButton btnCadastrar = new JButton("Cadastrar");
        btnCadastrar.setBounds(350, 260, 200, 30);
        frame.add(btnCadastrar);


        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String login = txtLogin.getText();
                String senha = new String(txtSenha.getPassword());
                String confirmar = new String(txtConfirmar.getPassword());

                if (login.isEmpty() || senha.isEmpty() || confirmar.isEmpty()) {
                    JOptionPane.showMessageDialog(null,
                            "Preencha todos os campos!");
                    return;
                }

                if (!senha.equals(confirmar)) {
                    JOptionPane.showMessageDialog(null,
                            "As senhas não conferem!");
                    return;
                }

                JOptionPane.showMessageDialog(null,
                        "Cadastro realizado com sucesso!");


            }
        });

        frame.setVisible(true);
    }
}