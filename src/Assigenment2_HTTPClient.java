import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Assigenment2_HTTPClient {
    public static void main(String[] args) throws ClassNotFoundException, URISyntaxException, IOException, InterruptedException {
        //Class.forName("mysql.jdbc.drive.MySQLDriver");

        HttpRequest httpClient= HttpRequest.newBuilder()
                .uri(new URI("https://fakestoreapi.com/products"))
                .GET()
                .build();


        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(httpClient, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response : "+response.body());
        /*try(Connection connection=DriverManager.getConnection("jdbc:mysql:thin@localhost:3122")){

        } catch (SQLException e) {
            System.err.println("DB Error occured "+e.getMessage());
            throw new RuntimeException(e);
        }*/
    }
}
