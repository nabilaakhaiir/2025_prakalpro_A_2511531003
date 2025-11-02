package pekan5;

public class TugasPekan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.print("#");
			for (int i = 0; i < 16; i ++) {
				 System.out.print("=");			    	   
				}
			     System.out.print("#");
			     System.out.println();
			             
			     for (int j = 0; j < 4; j ++) {
			     System.out.print("|");
			      for (int k = 0; k < (-2*j+6); k ++) {
				    System.out.print(" ");		
			      }
				  System.out.print("<>");
				    for (int l = 0; l < 4*j; l++) {
			        System.out.print(".");	
				  }	
				    System.out.print("<>");
				  
				    for (int k = 0; k < (-2*j+6); k ++) {
					    System.out.print(" ");	
		}
				    System.out.print("|");
				    System.out.println();
		}
			     for (int j = 0; j < 4; j ++) {
				     System.out.print("|");
				      for (int k = 0; k < (2*j); k ++) {
					    System.out.print(" ");		
				      }
					  System.out.print("<>");
					    for (int l = 0; l < (-4*j+12); l++) {
				        System.out.print(".");	
					  }	
					    System.out.print("<>");
					  
					    for (int k = 0; k < (2*j); k ++) {
						    System.out.print(" ");	
			}
					    System.out.println("|");
		}
			     System.out.print("#");
					for (int i = 0; i < 16; i ++) {
						 System.out.print("=");			    	   
						}
					     System.out.println("#");
			     }
		}