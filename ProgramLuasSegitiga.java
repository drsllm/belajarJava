package programluassegitiga;
import java.util.Scanner;

public class ProgramLuasSegitiga {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alas, tinggi;
        
        System.out.print("Masukkan panjang alas segitiga (cm)/t: ");
        alas = input.nextDouble();
        
        System.out.print("Masukkan tinggi segitiga (cm)/t: ");
        tinggi = input.nextDouble();
        
        System.out.println("Luas segitiga adalah " + (alas * tinggi) * 1 / 2 + " cm");
    }
    
}
