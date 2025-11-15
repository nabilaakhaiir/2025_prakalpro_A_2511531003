package pekan7_2511531003;

import java.util.Scanner;

public class tugasAlproPekan7_2511531003 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println ("===== REGISTRASI AKUN BARU =====");
		
		  System.out.print("Masukkan Username     : ");
	        String i = input.nextLine();
	        System.out.print("Masukkan Password     : ");
	        String j = input.nextLine();
	        System.out.print("Masukkan Email        : ");
	        String k = input.nextLine();
	        System.out.print("Masukkan PIN (6 digit): ");
	        int l = input.nextInt();
	        
	        System.out.println();
	        Akun_2511531003 a = new Akun_2511531003();
	        a.setUsername(i);
	        a.setPassword(j);
	        a.setEmail(k);
	        a.setPIN(l);
	      
	        if (a.isPasswordValid() && a.isEmailValid()) {
	    		System.out.println("--- REGISTRASI BERHASIL ---");
	    		System.out.println("Akun untuk \"" + i + "\" telah berhasil dibuat");
	    		System.out.println();
	        }else {
	        	System.out.println("--- REGISTRASI GAGAL ---");
	        	
	        } if (j.length ()<8)	{ 	
	        	System.out.println("Password Anda \"" + i + "\" tidak valid (harus mengandung minimal 8 karakter) ");
	        	System.out.println();
	        }else {
	        	System.out.println("Email Anda \"" + i + "\" tidak valid (harus mengandung '@' dan '.') ");
	        	System.out.println();
	}
	    	System.out.println("--- DETAIL AKUN ---");
	    	System.out.print("Username (Lowercase) : ");
	    	System.out.println (i.toLowerCase ());
	    	System.out.print("Email(Uppercase)     : ");
	    	System.out.println (k.toUpperCase ());
	    	System.out.print("ID Pengguna(Gabungan): ");
	    	System.out.println (i + l);
	
	    	System.out.println();
	        System.out.println("--- Uji Tipe Data (PIN Anda: "+l+") ---");
	        int hasilInt = a.getPin() + 10;
	        System.out.println ("PIN (int) + 10      = " + hasilInt);
	        String hasilString = l + "10";
	        System.out.println ("PIN (String) + \"" + 10 + "\" = " + hasilString);
}
	}
//nabila khairunnisa_2511531003
