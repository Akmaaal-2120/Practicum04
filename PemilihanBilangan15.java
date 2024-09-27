import java.util.Scanner;
public class PemilihanBilangan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hasil;
        System.out.print(" Masukkan sebuah angka : ");
        int angka = sc.nextInt();

        hasil = (angka % 2 == 0) ? " Termasuk bilangan genap " : " Termasuk bilangan ganji";

        System.out.println(angka + hasil);


    }
    
}