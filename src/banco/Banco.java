package banco;

import controlador.Login_Control;
import vista.Login_Vista;

public class Banco {

    public static void main(String[] args) {
        // Crear la vista de login
        Login_Vista vistaLogin = new Login_Vista();

        // Crear el controlador de login y pasarle la vista
        Login_Control controladorLogin = new Login_Control(vistaLogin);
    }
}