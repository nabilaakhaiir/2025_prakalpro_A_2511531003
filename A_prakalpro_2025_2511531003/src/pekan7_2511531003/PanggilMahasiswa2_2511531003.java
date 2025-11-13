package pekan7_2511531003;
import java.util.Scanner;
public class PanggilMahasiswa2_2511531003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input = new Scanner (System.in);
        System.out.print("NIM: ");
        String x = input.nextLine();
        System.out.print("NAMA: ");
        String y = input.nextLine();
        Mahasiswa_2511531003 a= new Mahasiswa_2511531003 ();
        a.setNim2(x);
        a.setNama(y);
        if (x.startsWith("25")) {
        	System.out.println (y + " anda angkatan 2025");
        }
        if (x.contains("1153")) {
        	System.out.println ("Anda Mahasiswa Informatika");
	}
 a.Cetak2();
 input.close();
}
	}

//nabila khairunnisa_2511531003