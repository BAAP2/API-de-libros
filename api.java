import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class BookCatalog {
    private static final String API_URL = "https://www.googleapis.com/books/v1/volumes?q=search+terms&key=YOUR_API_KEY";

    public static void main(String[] args) {
        try {
            URL url = new URL(API_URL);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            in.close();
            conn.disconnect();

            System.out.println(content.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
