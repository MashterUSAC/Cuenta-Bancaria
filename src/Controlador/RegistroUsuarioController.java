package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.Cliente;
import vista.RegistroUsuarioView;

public class RegistroUsuarioController {
    private RegistroUsuarioView vista;

    public RegistroUsuarioController(RegistroUsuarioView vista) {
        this.vista = vista;

        // Agregar acción al botón de registrar
        vista.getBtnRegistrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CUI = vista.getTxtCUI().getText();
                String nombre = vista.getTxtNombre().getText();
                String apellido = vista.getTxtApellido().getText();

                // Validar que los campos no estén vacíos
                if (CUI.isEmpty() || nombre.isEmpty() || apellido.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Todos los campos son obligatorios");
                    return;
                }

                // Aquí puedes agregar la lógica para guardar el cliente en una lista
                Cliente nuevoCliente = new Cliente(CUI, nombre, apellido);
                JOptionPane.showMessageDialog(vista, "Usuario registrado exitosamente");

                // Cerrar la ventana de registro
                vista.dispose();
            }
        });
    }
}