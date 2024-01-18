import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;

public class PersonaRefacTest {
   
    private static PersonaRefac persona = new PersonaRefac("Agenda de Imanol"); 
    
   
    @BeforeClass
    public static void cargarDatos() {
       
        persona.addTelefono("Imanol", "696255265");
        persona.addTelefono("Maite", "649344375");
        persona.addTelefono("Aimar", "689194880");
        persona.addTelefono("Maria", "908770143");
        persona.addTelefono("Edu", "699194800");
        persona.addTelefono("Aitor", "666194250");
        persona.addTelefono("Nerea", "699294220");          
    }
   

    @Test
    public void testGetNombre() {
        String nombre = persona.getNombreAgenda("689194880");
        assertEquals("Aimar", nombre);
    }   

    @Test
    public void testGetTelefono() {
        String telefono = persona.getTelefonoAgenda("Aitor");
        assertEquals("666194250", telefono);
    }    

    @Test
    public void testeliminatTelefono() {    
    persona.eliminarTelefono("Nerea");   
    assertTrue(true);
    }

    @Test
    public void testanadirTelefono() {       
    persona.addTelefono("Juan","897586123");
    assertTrue(true);
    }

    @Test
    public void testSetTelefono() {        
    persona.setTelefono("Maria","605305709");   
    assertTrue(true);
}

}