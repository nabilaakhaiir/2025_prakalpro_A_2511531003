package pekan3;

import java.util.Scanner;

public class OperatorBangunRuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner input = new Scanner(System.in);

		        // Input
		        System.out.print("Masukkan alas segitiga: ");
		        double a = input.nextDouble();

		        System.out.print("Masukkan tinggi segitiga: ");
		        double ts = input.nextDouble();

		        System.out.print("Masukkan tinggi prisma: ");
		        double t = input.nextDouble();

		        // Hitung luas alas
		        double L_alas = 0.5 * a * ts;

		        // Hitung volume
		        double V = L_alas * t;

		        // Output
		        System.out.println("Volume prisma segitiga = " + V);
		        input.close();
	}

}
