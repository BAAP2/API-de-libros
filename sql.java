import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BookCatalog {
    // Código anterior...

    public static void main(String[] args) {
        // Código anterior...

        // Conexión a la base de datos
        String url = "jdbc:mysql://localhost:3306/literalura";
        String user = "root";
        String password = "password";

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            // Inserción de datos
            String sql = "INSERT INTO libros (titulo, autor, descripcion) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "Título del libro");
            statement.setString(2, "Autor del libro");
            statement.setString(3, "Descripción del libro");

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("Libro insertado exitosamente!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
