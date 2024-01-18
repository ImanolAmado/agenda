import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        String nombreContacto;
        String numeroTelefono;    

        PersonaRefac persona = new PersonaRefac("Agenda de Imanol");
        Scanner sc = new Scanner(System.in);
        int respuesta;

        do {
            System.out.println("\n\n---MENU PRINCIPAL---");
            System.out.println("\n1 - Añadir teléfono agenda.");
            System.out.println("2 - Ver teléfono de persona.");
            System.out.println("3 - Buscar persona por su teléfono.");
            System.out.println("4 - Modificar un número de teléfono.");
            System.out.println("5 - Eliminar un teléfono de la agenda.");
            System.out.println("0 - Salir");
            System.out.print("\nIntroduce una opción: ");
            respuesta = sc.nextInt();
            sc.nextLine();

            switch (respuesta) {
                case 1:
                    System.out.print("\nIntroduce el nombre de la persona: ");
                    nombreContacto=sc.nextLine();
                    System.out.print("Introduce el teléfono de la persona: ");
                    numeroTelefono=sc.nextLine();
                    persona.addTelefono(nombreContacto, numeroTelefono);
                    break;
                case 2:
                    System.out.print("\nIntroduce el nombre de la persona: ");
                    nombreContacto=sc.nextLine();
                    System.out.println("Su telefono es: " + persona.getTelefonoAgenda(nombreContacto));
                    break;
                case 3:
                    System.out.print("\nIntroduce el telefono de la persona: ");
                    numeroTelefono=sc.nextLine();
                    System.out.println("Ese teléfono pertenece a: " + persona.getNombreAgenda(numeroTelefono));
                    break;
                case 4:
                    System.out.print("\nIntroduce el nombre de la persona: ");
                    nombreContacto=sc.nextLine();
                    System.out.print("Introduce el telefono nuevo: ");
                    numeroTelefono=sc.nextLine();
                    persona.setTelefono(nombreContacto, numeroTelefono);
                    break;
                case 5:
                    System.out.print("\nIntroduce el nombre de la persona: ");
                    nombreContacto=sc.nextLine();
                    persona.eliminarTelefono(nombreContacto);
                    break;
                case 0:
                    System.out.println("Agur!");
                    break;
                default:
                    System.out.println("opción erronea");
                    break;
            }
        } while (respuesta != 0);
        sc.close();
    } 
}
