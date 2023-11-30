import java.util.InputMismatchException; //digunakan untuk menangkap kesalahan input
import java.util.Scanner;

public class supermarket {
    private static String kodeBarang, namaBarang, gudang;
    private static double hargaBeli, hargaJual;
    private static int jumlahBarang;

    private static void setHarga(String kodeBarang, String namaBarang, String gudang, double hargaBeli, double hargaJual, int jumlahBarang) throws MyException {
        if (hargaJual <= 0) {
            throw new MyException("Terjadi Kesalahan: Harga jual harus lebih dari 0");
        } else if (jumlahBarang < 1) {
            throw new MyException("Terjadi Kesalahan: Jumlah barang harus lebih dari 1");
        }
        System.out.println("Harga Jual: " + hargaJual + " & Jumlah Barang yang dibeli: " + jumlahBarang);
        // Add further processing here if needed
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            do {
                System.out.print("Masukkan Kode Barang: ");
                kodeBarang = scanner.nextLine();
            } while (kodeBarang.trim().isEmpty());

            do {
                System.out.print("Masukkan Nama Barang: ");
                namaBarang = scanner.nextLine();
            } while (namaBarang.trim().isEmpty());

            do {
                System.out.print("Masukkan Gudang: ");
                gudang = scanner.nextLine();
            } while (gudang.trim().isEmpty());

            System.out.print("Masukkan Harga Beli: ");
            hargaBeli = scanner.nextDouble();

            do {
                System.out.print("Masukkan Harga Jual: ");
                hargaJual = scanner.nextDouble();
                if (hargaJual <= 0) {
                    System.out.println("Terjadi Kesalahan: Harga jual harus lebih dari 0");
                }
            } while (hargaJual <= 0);

            do {
                System.out.print("Masukkan Jumlah Barang: ");
                jumlahBarang = scanner.nextInt();
            } while (jumlahBarang < 1);

            setHarga(kodeBarang, namaBarang, gudang, hargaBeli, hargaJual, jumlahBarang);
        } catch (InputMismatchException e) {
            System.out.println("Terjadi Kesalahan: Input tidak valid. Harap masukkan angka.");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
