package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.MainView;

public class MainController {
    private MainView vista;

    public MainController(MainView vista) {
        this.vista = vista;

        // Agregar acciones a los botones
        vista.getBtnRegistroUsuario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la vista de registro de usuario
                System.out.println("Registro de Usuario");
            }
        });

        vista.getBtnCrearCuenta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes abrir la vista de creación de cuentas
                System.out.println("Crear Cuenta");
            }
        });

        // Agrega más acciones para los otros botones...
    }
}