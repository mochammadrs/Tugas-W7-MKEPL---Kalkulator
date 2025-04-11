import java.util.Scanner;

public class kalkulator {

  public static void main(String[] args) {

    try (Scanner input = new Scanner(System.in)) {
        System.out.println("Masukkan angka pertama: ");
        double angkaPertama = input.nextDouble();

        System.out.println("Masukkan angka kedua: ");
        double angkaKedua = input.nextDouble();

        System.out.println("Hasil penjumlahan: " + (angkaPertama + angkaKedua));
        System.out.println("Hasil pengurangan: " + (angkaPertama - angkaKedua));
        System.out.println("Hasil perkalian: " + (angkaPertama * angkaKedua));
        System.out.println("Hasil pembagian: " + (angkaPertama / angkaKedua));
    }
  }
}
