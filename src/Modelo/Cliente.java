package modelo;

public class Cliente {
    private String CUI;
    private String nombre;
    private String apellido;

    // Constructor
    public Cliente(String CUI, String nombre, String apellido) {
        this.CUI = CUI;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // Getters y Setters
    public String getCUI() {
        return CUI;
    }

    public void setCUI(String CUI) {
        this.CUI = CUI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
