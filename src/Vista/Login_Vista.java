package vista;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login_Vista extends JFrame {
    private final JTextField txtUsuario;
    private final JPasswordField txtPassword;
    private final JButton btnLogin;

    public Login_Vista() {
        setTitle("Inicio de Sesión - USAC Bank");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Componentes de la ventana
        JLabel lblUsuario = new JLabel("Usuario:");
        txtUsuario = new JTextField(15);

        JLabel lblPassword = new JLabel("Contraseña:");
        txtPassword = new JPasswordField(15);

        btnLogin = new JButton("Iniciar Sesión");

        // Agregar componentes a la ventana
        add(lblUsuario);
        add(txtUsuario);
        add(lblPassword);
        add(txtPassword);
        add(btnLogin);

        setVisible(true);
    }

    // Getters para los componentes
    public JTextField getTxtUsuario() {
        return txtUsuario;
    }

    public JPasswordField getTxtPassword() {
        return txtPassword;
    }

    public JButton getBtnLogin() {
        return btnLogin;
    }
}