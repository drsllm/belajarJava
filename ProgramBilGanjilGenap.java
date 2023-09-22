package programbilganjilgenap;
import java.util.Scanner;
public class ProgramBilGanjilGenap {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan sebuah angka (0 untuk keluar): ");
            angka = input.nextInt();

            if (angka == 0) {
                System.out.println("Program berakhir.");
            } else if (angka % 2 == 0) {
                System.out.println("Angka genap.");
            } else {
                System.out.println("Angka ganjil.");
            }
        } while (angka != 0);

        input.close();
    }
}





