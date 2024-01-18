
public class PersonaRefac {

    private String nombre;
    private Agenda agenda;
   
    // Constructor
    public PersonaRefac(String nombre) {
        this.nombre = nombre;
        // iniciarlizar agenda
        agenda = new Agenda();
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Obtiene el número de teléfono asociado al nombre de una persona en la agenda.
     
    public String getTelefonoAgenda(String nombre) {
        return agenda.getTelefono(nombre); 
    }
    
    // Obtiene el nombre asociado a un número de teléfono en la agenda.
      
    public String getNombreAgenda(String telefono) {
        return agenda.getNombre(telefono); 
    }

    // Elimina el teléfono asociado al nombre especificado.

   public void eliminarTelefono(String nombre) {

         agenda.eliminarTelefono(nombre);
    }

    // Actualiza el teléfono de una persona.

    public void setTelefono(String nombre, String numeroTelefono ) {

        agenda.setTelefono(nombre, numeroTelefono);
    }
    
    // Agrega un nuevo teléfono a la agenda de la persona.
   
    public void addTelefono(String nombre, String numeroTelefono) {             
      
        Telefono telefono = new Telefono(nombre, numeroTelefono);
        agenda.addTelefono(telefono);
    }
  
}
