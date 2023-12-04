import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaders {
    public static String bacaFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            return content.toString();
        } catch (FileNotFoundException e) {
            System.err.println("File tidak ditemukan: " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Terjadi kesalahan saat membaca file: " + fileName);
            e.printStackTrace();
        }
        return null;
    }
}
