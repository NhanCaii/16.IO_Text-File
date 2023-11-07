import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("numbers.txt");
        int maxValue = ReadAndWriteFile.findMax(numbers);
        readAndWriteFile.writeFile("result.txt", maxValue);
    }
}