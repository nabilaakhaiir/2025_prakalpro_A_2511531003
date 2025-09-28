package pekan3;

import java.util.Scanner;

public class MenghitungUpahMingguan {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan nama karyawan : ");
        String nama = keyboard.nextLine();
        System.out.print("Masukkan golongan (a/b/c/d) : ");
        char golongan = keyboard.next().charAt(0);
        System.out.print("Masukkan jam kerja : ");
        int jamKerja = keyboard.nextInt();

        int upahPerJam;
        if (golongan == 'a') {
            upahPerJam = 1000;
        } else if (golongan == 'b') {
            upahPerJam = 2000;
        } else if (golongan == 'c') {
            upahPerJam = 3000;
        } else if (golongan == 'd') {
            upahPerJam = 4000;
        } else {
            System.out.println("Golongan tidak valid!");
            keyboard.close();
            return;
        }

        int upah = jamKerja * upahPerJam;

        if (jamKerja > 60) {
            int lembur = (jamKerja - 60) * 5000;
            upah += lembur;
        }

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Nama Karyawan : " + nama);
        System.out.println("Golongan      : " + golongan);
        System.out.println("Jam Kerja     : " + jamKerja);
        System.out.println("Total Upah    : Rp " + upah);

        keyboard.close();
    }
}