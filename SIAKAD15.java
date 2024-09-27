import java.util.Scanner;

public class SIAKAD15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir, nilaiUjianAkhir;

        System.out.println("Masukkan nama : ");
        nama = input.nextLine();
        System.out.println("Masukkan nim : ");
        nim = input.nextLine();
        System.out.println("Masukkan kelas : ");
        kelas = input.nextLine();
        System.out.println("Masukkan NoAbsen : ");
        absen = input.nextByte();

        System.out.println("Masukkan nilai kuis : ");
        nilaiKuis = input.nextDouble();
        System.out.println("Masukkan nilai ujian tengah : ");
        nilaiUjian = input.nextDouble();
        System.out.println("Masukkan nilai tugas : ");
        nilaiTugas = input.nextDouble();
        System.out.println("Masukkan nilai ujian akhir : ");
        nilaiUjianAkhir = input.nextDouble();

        nilaiAkhir = ((nilaiKuis * 0.2) + (nilaiTugas * 0.15) + (nilaiUjian * 0.3) + (nilaiUjianAkhir * 0.35));

        System.out.println("Mahasiswa dengan Nama : " + nama + " (NIM : " + nim + ")" + " kelas : " + kelas + " No Absen : " + absen );
        System.out.println("Nilai Akhir : " + nilaiAkhir);

        if(nilaiAkhir > 80 && nilaiAkhir <=100){
            System.out.println("Nilai akhir huruf: A");
            System.out.println("Kualifikasi: Sangat Baik");
        }else if(nilaiAkhir > 73 && nilaiAkhir <= 80){
            System.out.println("Nilai akhir huruf: B+");
            System.out.println("Kualifikasi: Lebih dari baik");
        }else if(nilaiAkhir > 65 && nilaiAkhir <= 73){
            System.out.println("Nilai akhir huruf: B");
            System.out.println("Kualifikasi: Baik");
        }else if(nilaiAkhir > 60 && nilaiAkhir <= 65){
            System.out.println("Nilai akhir huruf: C+");
            System.out.println("Kualifikasi: Lebih dari cukup");
        }else if(nilaiAkhir > 50 && nilaiAkhir <= 60){
            System.out.println("Nilai akhir huruf: C");
            System.out.println("Kualifikasi: Cukup");
        }else if(nilaiAkhir > 39 && nilaiAkhir <= 50){
            System.out.println("Nilai akhir huruf: D");
            System.out.println("Kualifikasi: Kurang");
        }else{
            System.out.println("Nilai akhir huruf: E");
            System.out.println("Kualifikasi: Gagal");
        }
    }
}
