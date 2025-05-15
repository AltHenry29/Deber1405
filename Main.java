import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Participante 1 usando constructor completo
        System.out.println("Ingrese datos del Participante 1:");
        System.out.print("Nombre: ");
        String nombre1 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido1 = sc.nextLine();
        System.out.print("Edad: ");
        int edad1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono1 = sc.nextLine();
        System.out.print("Correo: ");
        String correo1 = sc.nextLine();
        System.out.print("Nacionalidad: ");
        String nacionalidad1 = sc.nextLine();
        System.out.print("¿Tiene certificado médico? (true/false): ");
        boolean certificado1 = sc.nextBoolean();
        System.out.print("¿Aceptó los términos? (true/false): ");
        boolean acepto1 = sc.nextBoolean();
        sc.nextLine();

        participantes p1 = new participantes(nombre1, apellido1, edad1, telefono1, correo1, nacionalidad1, certificado1, acepto1);
        p1.mostrarDatos();

        //Participante 2 con constructor parcial y setters
        System.out.println("\nIngrese datos del Participante 2:");
        System.out.print("Nombre: ");
        String nombre2 = sc.nextLine();
        System.out.print("Edad: ");
        int edad2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono2 = sc.nextLine();

        participantes p2 = new participantes(nombre2, edad2, telefono2);

        System.out.print("Apellido: ");
        p2.setApellido(sc.nextLine());
        System.out.print("Correo: ");
        p2.setCorreo(sc.nextLine());
        System.out.print("Nacionalidad: ");
        p2.setNacionalidad(sc.nextLine());
        System.out.print("¿Tiene certificado médico? (true/false): ");
        p2.setCertificadoMedico(sc.nextBoolean());
        System.out.print("¿Aceptó los términos? (true/false): ");
        p2.setAceptoTerminos(sc.nextBoolean());
        sc.nextLine();

        p2.mostrarDatos();

        //Participante 3 usando constructor con solo nombre y apellido, luego seteado
        System.out.println("\nIngrese datos del Participante 3:");
        System.out.print("Nombre: ");
        String nombre3 = sc.nextLine();
        System.out.print("Apellido: ");
        String apellido3 = sc.nextLine();

        participantes p3 = new participantes(nombre3, apellido3);

        System.out.print("Edad: ");
        p3.setEdad(sc.nextInt());
        sc.nextLine();
        System.out.print("Teléfono: ");
        p3.setTelefono(sc.nextLine());
        System.out.print("Correo: ");
        p3.setCorreo(sc.nextLine());
        System.out.print("Nacionalidad: ");
        p3.setNacionalidad(sc.nextLine());
        System.out.print("¿Tiene certificado médico? (true/false): ");
        p3.setCertificadoMedico(sc.nextBoolean());
        System.out.print("¿Aceptó los términos? (true/false): ");
        p3.setAceptoTerminos(sc.nextBoolean());

        System.out.println("\n----- Participante Actualizado -----");
        p3.mostrarDatos();

        sc.close();
    }
}


//public class Main {
//    public static void main(String[] args) {
//        // Crear un participante usando constructor completo (válido)
//        participantes p1 = new participantes("Laura", "Sánchez", 25, "099888777", "laura@gmail.com", "ecuatoriana",
//                true, true);
//        p1.mostrarDatos();
//
//        // Crear un participante con datos incompletos y sin cumplir requisitos
//        participantes p2 = new participantes("Yuberly", 17, "098112233");
//        p2.setApellido("Verdezoto");
//        p2.setCorreo("mario@gmail.com");
//        p2.setNacionalidad("colombiana");
//        p2.setCertificadoMedico(false);
//        p2.setAceptoTerminos(false);
//        p2.mostrarDatos();
//
//        // Crear un participante con solo nombre y apellido, luego setear los datos
//        participantes p3 = new participantes("Pedro", "Mena");
//        p3.setEdad(32);
//        p3.setTelefono("0987654321");
//        p3.setCorreo("pedro@gmail.com");
//        p3.setNacionalidad("ecuatoriana");
//        p3.setCertificadoMedico(true);
//        p3.setAceptoTerminos(true);
//        System.out.println("\n----- Participante Actualizado -----");
//        p3.mostrarDatos();
//    }
//}

