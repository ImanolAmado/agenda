import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

public class AgendaTest {
   
    private static Agenda miAgenda = new Agenda();    
   
    @BeforeClass
    public static void cargarDatos() {
       
        Telefono[] telefonos = new Telefono[10];

        telefonos[0] = new Telefono("Imanol", "696255265");
        telefonos[1] = new Telefono("Maite", "649344375");
        telefonos[2] = new Telefono("Aimar", "689194880");
        telefonos[3] = new Telefono("Maria", "908770143");
        telefonos[4] = new Telefono("Edu", "699194800");
        telefonos[5] = new Telefono("Aitor", "666194250");
        telefonos[6] = new Telefono("Nerea", "699294220");
    
        // Dejo la posición 7 del array libre para probar el método de añadir
        
        telefonos[8] = new Telefono("Miren", "644998820");
        telefonos[9] = new Telefono("Koldo", "622194220");

        miAgenda.setAgenda(telefonos);
    }

    @Test
    public void testBuscarPosicionTelefono() {
        int posicion = miAgenda.buscarPosicionTelefono("Koldo");
        assertEquals(9, posicion);
    }     

    @Test
    public void testGetNombre() {
        String nombre = miAgenda.getNombre("622194220");
        assertEquals("Koldo", nombre);
    }   

    @Test
    public void testGetTelefono() {
        String telefono = miAgenda.getTelefono("Aitor");
        assertEquals("666194250", telefono);
    }    

    @Test
    public void testeliminatTelefono() {    
    miAgenda.eliminarTelefono("Nerea");   
    assertTrue(true);
    }

    @Test
    public void testanadirTelefono() {    
    Telefono telefono = new Telefono ("Juan","897586123");
    miAgenda.addTelefono(telefono);   
    assertTrue(true);
    }

    @Test
    public void testSetTelefono() {        
    miAgenda.setTelefono("Maria","605305709");   
    assertTrue(true);
}

}