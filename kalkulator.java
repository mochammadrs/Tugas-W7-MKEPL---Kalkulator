import java.text.DecimalFormat;
import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angkaPertama = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angkaKedua = input.nextDouble();

        tampilkanHasil("penjumlahan", angkaPertama + angkaKedua);
        tampilkanHasil("pengurangan", angkaPertama - angkaKedua);
        tampilkanHasil("perkalian", angkaPertama * angkaKedua);
        tampilkanHasil("pembagian", angkaPertama / angkaKedua);

        input.close();
    }

    public static void tampilkanHasil(String operasi, double hasil) {
        DecimalFormat format = new DecimalFormat("0.##");
        String hasilFormat = format.format(hasil);
        System.out.println("Hasil " + operasi + ": " + hasilFormat);
    }
}
