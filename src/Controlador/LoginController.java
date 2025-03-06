package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import vista.LoginView;
import vista.MainView;

public class LoginController {
    private LoginView vista;

    public LoginController(LoginView vista) {
        this.vista = vista;

        // Agregar acción al botón de login
        vista.getBtnLogin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = vista.getTxtUsuario().getText();
                String password = new String(vista.getTxtPassword().getPassword());

                // Validar credenciales (aquí puedes agregar tu lógica de validación)
                if (usuario.equals("AdministradorIPC1A") && password.equals("ipc1A1s2025")) {
                    JOptionPane.showMessageDialog(vista, "Bienvenido al sistema");

                    // Cerrar la ventana de inicio de sesión
                    vista.dispose();

                    // Abrir la pantalla principal
                    MainView vistaPrincipal = new MainView();
                    MainController controladorPrincipal = new MainController(vistaPrincipal);
                } else {
                    JOptionPane.showMessageDialog(vista, "Usuario o contraseña incorrectos");
                }
            }
        });
    }
}