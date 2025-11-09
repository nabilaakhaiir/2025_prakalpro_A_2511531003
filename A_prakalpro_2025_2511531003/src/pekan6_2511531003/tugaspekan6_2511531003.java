package pekan6_2511531003;
import java.util.Random;
import java.util.Scanner;
public class tugaspekan6_2511531003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int tries = 0;
	    int sum = 0;
	    String jawab;
        boolean running = true;
        
        Scanner scan = new Scanner (System.in);
        while (running) {
           int dadu1 = rand.nextInt(6) + 1;
     	   int dadu2 = rand.nextInt(6) + 1;
     	   sum = dadu1+dadu2;
     	   System.out.println(dadu1 + " + " + dadu2 + " = "+ sum);
     	  tries ++;
     	 
	if (sum==7) {
		System.out.println("Tebakan Anda Benar");
		 System.out.println("Anda menang setelah " + tries + " percobaan!");
		running = false;
    } else {
    	System.out.println("Tebakan Anda Salah");
    	System.out.print("Apakah mau lempar dadu (ya/tidak?)");
    	jawab= scan.nextLine();
    	
		if (jawab.equalsIgnoreCase("tidak")) {
			System.out.println("Anda Gagal Menang");
			running = false;
		 }
      }
    }
  }
}
//nabila khairunnisa_2511531003