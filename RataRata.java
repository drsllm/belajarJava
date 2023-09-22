package ratarata;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RataRata {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        boolean lanjut = true;

        while (lanjut) {
            try {
                System.out.print("Masukkan jumlah angka yang akan dihitung: ");
                int jumlah = input.nextInt();

                if (jumlah <= 0) {
                    System.out.println("Jumlah angka harus lebih dari 0.");
                    continue;
                }

                System.out.println("Masukkan " + jumlah + " angka:");

                double total = 0;

                for (int i = 1; i <= jumlah; i++) {
                    System.out.print("Angka ke-" + i + ": ");
                    total += input.nextDouble();
                }

                double rataRata = total / jumlah;
                System.out.println("Nilai rata-rata: " + rataRata);

                System.out.print("Apakah Anda ingin menghitung rata-rata lagi? (ya/tidak): ");
                String jawaban = input.next().toLowerCase();

                if (!jawaban.equals("ya")) {
                    lanjut = false;
                    System.out.println("Program Selesai.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Input yang Anda masukkan tidak valid. Masukkan angka yang benar.");
                input.nextLine(); // Membersihkan buffer input
            }
        }

        input.close();
    }
}



