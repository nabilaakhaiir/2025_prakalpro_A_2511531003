package pekan2;

public class TugasAlproPekan2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    char inisial = 'J';       
	        int ranking = 8;        
	        float poin = 6430.5f;     
	        boolean lolos;            

	        // Logika kelolosan
	        if (ranking <= 8 && poin >= 5000) {
	            lolos = true;
	        } else {
	            lolos = false;
	        }

	        // Output hasil
	        System.out.println("=== Hasil Seleksi BWF World Tour Final ===");
	        System.out.println("Inisial Pemain : " + inisial);
	        System.out.println("Ranking Dunia  : " + ranking);
	        System.out.println("Total Poin     : " + poin);
	        System.out.println("Status Lolos   : " + lolos);
	}

}
