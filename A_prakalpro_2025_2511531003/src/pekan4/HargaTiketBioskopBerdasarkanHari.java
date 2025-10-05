package pekan4;
import java.util.Scanner;
public class HargaTiketBioskopBerdasarkanHari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		 System .out.print("masukkan nama pembeli: ");
	       String NamaPembeli = input.nextLine();
	       
	       System .out.print("masukkan jumlah tiket: ");
	       int JumlahTiket = input.nextInt();
	      
	       System .out.print("masukkan hari (1=senin-kamis, 2=Jumat, 3=Sabtu-minggu): ");
	       int hari = input.nextInt();
	     
	       System .out.print("masukkan waktu tayang (1=Pagi, 2=Siang, 3=Malam): ");
	       int WaktuTayang = input.nextInt();
	       
	       System .out.print("masukkan jenis studio (1=Reguler, 2=Deluxe, 3=Premium): ");
	       int JenisStudio = input.nextInt();
	       input.close ();
	       
	      
	double HargaDasar = 0;
    String namaStudio = "";
    switch (JenisStudio) {
        case 1: 
        	HargaDasar = 30000; 
        	namaStudio = "Reguler"; 
        break;
        case 2: 
        	HargaDasar = 50000; 
        	namaStudio = "Deluxe"; 
        	break;
        case 3: 
        	HargaDasar = 70000; 
        	namaStudio = "Premium"; 
        	break;
        default: 
        	System.out.println("Studio tidak valid");
    }

    double BiayaHari = 0;
    String namaHari = "";
    switch (hari) {
        case 1: 
        	namaHari = "Senin-Kamis"; 
        	BiayaHari = 0.10; 
        	break;
        case 2: 
        	namaHari = "Jumat"; 
        	BiayaHari = 0.20; 
        	break;
        case 3: 
        	namaHari = "Sabtu-Minggu"; 
        	BiayaHari = 0.30; 
        	break;
        default: System.out.println("Hari tidak valid");
    }
    
    double BiayaWaktu = 0;
    String namaWaktu = "";
    switch (WaktuTayang) {
        case 1: 
        	namaWaktu = "Pagi"; 
        	BiayaWaktu = 0.0; 
        	break;
        case 2: 
        	namaWaktu = "Siang"; 
        	BiayaWaktu = 0.10; 
        	break;
        case 3: 
        	namaWaktu = "Malam"; 
        	BiayaWaktu = 0.20; 
        	break;
        default: System.out.println("Waktu tayang tidak valid");
    }

    double HargaPertiket = HargaDasar + (HargaDasar * BiayaHari) + (HargaDasar * BiayaWaktu);
    double Subtotal = HargaPertiket * JumlahTiket;

    double Diskon = 0;
    if (JumlahTiket >= 5) {
        Diskon = Subtotal * 0.20;
    }

    double Total = Subtotal - Diskon;

    
    System.out.println("=== PEMBELIAN TIKET BIOSKOP ===");
    System.out.println("Nama Pembeli    : " + NamaPembeli);
    System.out.println("Jumlah Tiket    : " + JumlahTiket);
    System.out.println("Hari            : " + namaHari);
    System.out.println("Waktu Tayang    : " + namaWaktu);
    System.out.println("Jenis Studio    : " + namaStudio);
    System.out.println("-------------------------------------");
    System.out.println("Harga Dasar     : Rp " + HargaDasar + "/tiket");
    System.out.println("Biaya Hari      : +" + (BiayaHari*100) + "%");
    System.out.println("Biaya Waktu     : +" + (BiayaWaktu*100) + "%");
    System.out.println("Harga per Tiket : Rp " + HargaPertiket);
    System.out.println("Subtotal        : Rp " + Subtotal);
    System.out.println("Diskon (20%)    : Rp " + Diskon);
    System.out.println("-------------------------------------");
    System.out.println("TOTAL BAYAR     : Rp " + Total);

	}
}




	      
	    
	
	


