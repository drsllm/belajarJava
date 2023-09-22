package inputdata;
import java.util.Scanner;

public class InputData {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        int umur;
        double tinggiBadan;
        
        System.out.print("Nama \t\t: ");
        nama = input.nextLine();
        System.out.print("Umur \t\t: ");
        umur = input.nextInt();
        System.out.print("Tinggi Badan \t: ");
        tinggiBadan = input.nextDouble();
        System.out.println("=======================================");
        
        System.out.print(nama + " berumur " + umur + " tahun dengan tinggi badan " + tinggiBadan + " cm\n");
    }
    
}
