package Banco;

import controlador.LoginController;
import vista.LoginView;

public class Banco {

    public static void main(String[] args) {
        // Crear la vista de inicio de sesión
        LoginView vistaLogin = new LoginView();

        // Crear el controlador de inicio de sesión y pasarle la vista
        LoginController controladorLogin = new LoginController(vistaLogin);
    }
}