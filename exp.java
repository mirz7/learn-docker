import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CityTimeApp {
    public static void main(String[] args) {
        String city = "Kerala"; // You can change this

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        System.out.println("City: " + city);
        System.out.println("Current Time: " + now.format(formatter));
    }
}
