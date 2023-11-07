import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String csvFile = "quocgia.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) {
                    int id = Integer.parseInt(data[0]);
                    String code = data[1];
                    String name = data[2];
                    System.out.println("ID: " + id + ", Code: " + code + ", Name: " + name);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
