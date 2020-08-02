



	
	package Com.JAVA_ProjectDxc;

	import java.io.File;
	import java.util.Scanner;
	public class Logging_in
	{
		private String user_name;
		private String password;
		int op;
	   public String getUser() {
			return user_name;
		}
		public void setUser(String user) {
			this.user_name = user;
		}
		public String getPass() {
			return password;
		}
		public void setPass(String password) {
			this.password = password;
		}
	void login()
	   {
		
	        String username, password;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter username:");
	        username = s.nextLine();
	        System.out.print("Enter password:");
	        password = s.nextLine();
	        if(username.equals(user_name) && password.equals(password))
	        {
	            System.out.println("login  Successful");
	            
	        }
	        else
	        
	            System.out.println("login Failed");
	        }
	    }
	

	
