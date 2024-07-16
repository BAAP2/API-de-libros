import java.util.Scanner;

public class BookCatalog {
    // Código anterior...

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("===================================");
            System.out.println("CATÁLOGO DE LIBROS - LiterAlura");
            System.out.println("===================================");
            System.out.println("1. Buscar libros");
            System.out.println("2. Mostrar todos los libros");
            System.out.println("3. Buscar por autor");
            System.out.println("4. Agregar un libro");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // Lógica para buscar libros
                    break;
                case 2:
                    // Lógica para mostrar todos los libros
                    break;
                case 3:
                    // Lógica para buscar por autor
                    break;
                case 4:
                    // Lógica para agregar un libro
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 5);

        scanner.close();
    }
}
