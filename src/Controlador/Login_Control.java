package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.Login_Vista;

public class Login_Control {

    public Login_Control(Login_Vista vista) {

        // Agregar acción al botón de login
        vista.getBtnLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.getTxtUsuario().getText();
                String password = new String(vista.getTxtPassword().getPassword());

                // Validar credenciales (aquí puedes agregar tu lógica de validación)
                if (usuario.equals("AdministradorIPC1A") && password.equals("ipc1A1s2025")) {
                    JOptionPane.showMessageDialog(vista, "Bienvenido al sistema");
                    // Aquí puedes abrir la pantalla principal
                } else {
                    JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos");
                }
            }
        });
    }
}