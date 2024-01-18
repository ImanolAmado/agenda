// La clase Telefono representa el nombre de una persona 
// y su correspondiente número de teléfono.

public class Telefono {
    private String nombre;
    private String telefono;


    public Telefono(String nombre, String telefono){
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }  

}
