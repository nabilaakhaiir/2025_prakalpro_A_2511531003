package pekan7_2511531003;

public class Akun_2511531003 {
	//variabel global
	private String Username;
	private String Password;
	private String Email;
	private int PIN, Pin;

	//membuat mutator (setter)
	public void setUsername (String Username) {
		this.Username = Username;
	}
    public void setPassword (String password) {
		this.Password = password;
	}
    public void setEmail (String email) {
		this.Email = email;
	}
    public void setPIN (int Pin) {
		this.PIN = Pin;
    }
    
   //membuat accessor (getter)
   public String getUsername() {
     return Username;
   }
   public String getPassword() {
     return Password;
   }
   public String getEmail() {
	     return Email;
   }
   public int getPin() {
	     return PIN;
   }
   
   public boolean isPasswordValid() {
       return Password != null && Password.length() >=8;
   }
   
   public boolean isEmailValid() {
	   return Email != null && Email.contains("@") && Email.contains(".");
   
   }
   
   }
//nabila khairunnisa_2511531003
