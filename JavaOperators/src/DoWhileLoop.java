import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Programa para un menu de opciones
        // Inicializamos la variable de respuesta del usuario
        int response = 3;
        do {
            System.out.println("Selecciona el numero de la opcion deseada");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Salir");

            // Con este objeto de la clase Scanner, recibimos la respuesta leyendo la entrada del usuario con el teclado
            Scanner sc = new Scanner(System.in);
            // En esta variable capturo la respuesta que da el usuario
            response = Integer.valueOf(sc.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Elegiste Movies");
                    break;
                case 2:
                    System.out.println("Elegiste Series");
                    break;
                case 3:
                    System.out.println("Gracias por visitarnos");
                    break;
                default:
                    System.out.println("Selecciona una opcion correcta");
            }
        } while(response != 3);
    }
}
