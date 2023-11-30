import java.io.FileReader; // digunakan untuk membaca file
import java.io.IOException; // digunakan untuk menangani exception jenis IOException
// IOException adalah exception yang dihasilkan ketika terjadi error saat menggunakan file.
import java.util.Scanner;

public class File {

    public static String bacaFile(String fileName) throws IOException {
        FileReader reader = null;
        try {
            reader = new FileReader(fileName);
            System.out.println("File " + fileName );
            // Placeholder for content or return null
            return ""; 
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (Exception e) {
                    System.out.println("Error closing file: " + e.getMessage());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama file: ");
        String fileName = scanner.nextLine();

        try {
            String fileContent = bacaFile(fileName);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
