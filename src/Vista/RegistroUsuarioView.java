package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RegistroUsuarioView extends JFrame {
    private JTextField txtCUI;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JButton btnRegistrar;

    public RegistroUsuarioView() {
        setTitle("Registro de Usuario - USAC Bank");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Componentes de la ventana
        JLabel lblCUI = new JLabel("CUI:");
        txtCUI = new JTextField();

        JLabel lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField();

        JLabel lblApellido = new JLabel("Apellido:");
        txtApellido = new JTextField();

        btnRegistrar = new JButton("Registrar");

        // Agregar componentes a la ventana
        add(lblCUI);
        add(txtCUI);
        add(lblNombre);
        add(txtNombre);
        add(lblApellido);
        add(txtApellido);
        add(btnRegistrar);

        setVisible(true);
    }

    // Getters para los componentes
    public JTextField getTxtCUI() {
        return txtCUI;
    }

    public JTextField getTxtNombre() {
        return txtNombre;
    }

    public JTextField getTxtApellido() {
        return txtApellido;
    }

    public JButton getBtnRegistrar() {
        return btnRegistrar;
    }
}