import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        File sourceFile = new File("source.txt");
        File targetFile = new File("target1.txt");

        if (!sourceFile.exists()) {
            System.out.println("Tệp nguồn không tồn tại.");
        } else if (targetFile.exists()) {
            System.out.println("Tệp đích đã tồn tại. Vui lòng chọn tên tệp khác.");
        } else {
            try (FileReader reader = new FileReader(sourceFile);
                 FileWriter writer = new FileWriter(targetFile)) {
                int character;
                int characterCount = 0;

                while ((character = reader.read()) != -1) {
                    writer.write(character);
                    characterCount++;
                }

                System.out.println("Sao chép thành công. Số ký tự trong tệp: " + characterCount);
            } catch (IOException e) {
                System.out.println("Lỗi trong quá trình sao chép tệp: " + e.getMessage());
            }
        }

        scanner.close();
    }
}
