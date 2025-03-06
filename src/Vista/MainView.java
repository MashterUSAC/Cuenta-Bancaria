package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainView extends JFrame {
    private JButton btnRegistroUsuario;
    private JButton btnCrearCuenta;
    private JButton btnRetiros;
    private JButton btnDepositos;
    private JButton btnBuscarCuentas;
    private JButton btnHistorialTransacciones;
    private JButton btnGenerarReportes;
    private JButton btnDatosEstudiante;
    private JButton btnGenerarBitacora;

    public MainView() {
        setTitle("Pantalla Principal - USAC Bank");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(9, 1));

        // Componentes de la ventana
        btnRegistroUsuario = new JButton("Registro de Usuario");
        btnCrearCuenta = new JButton("Crear Cuenta");
        btnRetiros = new JButton("Retiros");
        btnDepositos = new JButton("Depósitos");
        btnBuscarCuentas = new JButton("Buscar Cuentas Asociadas");
        btnHistorialTransacciones = new JButton("Historial de Transacciones");
        btnGenerarReportes = new JButton("Generación de Reportes");
        btnDatosEstudiante = new JButton("Datos del Estudiante");
        btnGenerarBitacora = new JButton("Generar Bitácora");

        // Agregar componentes a la ventana
        add(btnRegistroUsuario);
        add(btnCrearCuenta);
        add(btnRetiros);
        add(btnDepositos);
        add(btnBuscarCuentas);
        add(btnHistorialTransacciones);
        add(btnGenerarReportes);
        add(btnDatosEstudiante);
        add(btnGenerarBitacora);

        setVisible(true);
    }

    // Getters para los botones
    public JButton getBtnRegistroUsuario() {
        return btnRegistroUsuario;
    }

    public JButton getBtnCrearCuenta() {
        return btnCrearCuenta;
    }

    public JButton getBtnRetiros() {
        return btnRetiros;
    }

    public JButton getBtnDepositos() {
        return btnDepositos;
    }

    public JButton getBtnBuscarCuentas() {
        return btnBuscarCuentas;
    }

    public JButton getBtnHistorialTransacciones() {
        return btnHistorialTransacciones;
    }

    public JButton getBtnGenerarReportes() {
        return btnGenerarReportes;
    }

    public JButton getBtnDatosEstudiante() {
        return btnDatosEstudiante;
    }

    public JButton getBtnGenerarBitacora() {
        return btnGenerarBitacora;
    }
}