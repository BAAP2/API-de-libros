import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class BookCatalog {
    // Código anterior...

    public static void main(String[] args) {
        // Código anterior...

        JsonObject jsonObject = JsonParser.parseString(content.toString()).getAsJsonObject();
        JsonObject items = jsonObject.getAsJsonObject("items");

        System.out.println("Libros: " + items);
    }
}
