// Clase que representa una agenda.
// Tiene como atributo un array de tipo Telefono.


public class Agenda {

    private Telefono[] agenda;

    // Inicializa el array con 10 posiciones.

    public Agenda() {
        agenda = new Telefono[10];
    }

    // Retorna la lista de teléfonos en la agenda.

    public Telefono[] getAgenda() {
        return agenda;
    }

    // Modifica el array de telefonos de la agenda.

    public void setAgenda(Telefono[] agenda) {
        this.agenda = agenda;
    }
  
    // Agrega un objeto Telefono a la agenda.

    public void addTelefono(Telefono telefono) {         
       
        int pos = buscarPosicionTelefono(telefono.getNombre());
        
        if (pos == -1) {
            // No existe ningun telefono para ese nombre
            for (int i = 0; i < agenda.length; i++) {
                if (agenda[i] == null) {
                    agenda[i]=telefono;                                     
                    break;
                }
            }
        } else {
            // Existe un telefono para ese nombre
            // Se actualiza el teléfono.
            agenda[pos].setTelefono(telefono.getTelefono());
        }
        System.out.println("El registro se ha añadido / modificado correctamente");
    }

    // Devuelve el número de teléfono asociado a un nombre en la agenda.

    public String getTelefono(String nombre) {
        int pos = buscarPosicionTelefono(nombre);
        if (pos == -1) {
            return null;
        } else return agenda[pos].getTelefono();   
     }

    // Obtiene el nombre asociado a un número de teléfono.

    public String getNombre(String telefono) {
        for (int i = 0; i < agenda.length; i++) {
                if (agenda[i] != null && agenda[i].getTelefono().equals(telefono)) {                   
                   return agenda[i].getNombre();                                                  
                }
            }        
        return null;
       
    }

    // Elimina un teléfono de la agenda dado un nombre.

    public void eliminarTelefono(String nombre) {
        int pos = buscarPosicionTelefono(nombre);
        if (pos == -1) {
            System.out.println("\nNo se ha encontrado el nombre");
        } else {
            agenda[pos] = null;
            System.out.println("\nEl registro se ha eliminado correctamente");
        }
    }

    // Actualiza el número de teléfono de un contacto en la agenda.

    public void setTelefono(String nombre, String telefonoNuevo) {
        int pos = buscarPosicionTelefono(nombre);
        if (pos == -1) {
            System.out.println("No se ha encontrado el nombre");
        } else {
            agenda[pos].setTelefono(telefonoNuevo);
            System.out.println("\nEl teléfono se ha actualizado correctamente");
        }
    }

    // Busca la posición de un teléfono en el arreglo de nombres de persona.

    public int buscarPosicionTelefono(String nombre) {

        for (int i = 0; i < agenda.length; i++) {
            if (agenda[i] != null && agenda[i].getNombre().equals(nombre)) {
                return i; // El nombre se ha encontrado en la posicion i
            }
        }
        return -1; // El nombre no se ha encontrado
    }
}
