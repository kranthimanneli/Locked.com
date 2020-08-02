package Com.JAVA_ProjectDxc;


	

	import java.io.File;
	import java.util.Scanner;

	public class Main_Type {
		public static void main(String[] args)
		{
			
			System.out.println("******WELCOME TO LOCKME.COM******");
			Scanner scan=new Scanner(System.in);
			Register reg = new Register();
			Logging_in log=new Logging_in();
			//System.out.println(" 1.Registration \n  2.Login ");
			//int choice=scan.nextInt();
		
			try {	
			while(true)
			{
							System.out.println(" 1.Registration \n 2.Login ");
							int choice=scan.nextInt();
							
							
						switch(choice)
						{
						case 1:System.out.println("******WELCOME TO LOCKME.COM******");
						    System.out.println("--------FILE MANAGEMENT SYSTEM------");
						    System.out.println("Developed by****Kranthi kumar Manneli");
							System.out.println("USER NAME:user name should have 5 letter in lower case and 3 numbers after the letter");
							System.out.println("PASSWORD:Password should be less than 5and more than 9 characters in length.should contain upper case,lower case,number,special character");
							;
							   System.out.print("user name  :");
							   reg.setUsername(scan.next());
							   System.out.println("password  :");
							   reg.setPassword(scan.next());
							   System.out.println(reg.getUsername());
							   System.out.println(reg.getPassword());
							   Directory cd=new Directory();
							   reg.PasswordValidation();
							 //  System.out.println("enter the user name of the folder to store Files");
							  cd.setPath(reg.getUsername());
							  
							   break;
						case 2:System.out.println("Login");
							

								log.setPass(reg.getPassword());
								log.setUser(reg.getUsername());
								log.login();
								while(true) {
									System.out.println("MENU");
									System.out.println("5.View  3.Add 4.Search 6.delete  7.Close Application ");
									int pp = scan.nextInt();
									System.out.print("Your choice, 0 to quit: ");
									
									switch(pp) {
									case 3:System.out.println("Adding");
									Add.main(null);
									break;
									
									case 4: System.out.println("Searching");
									Searching.main(null);
									break;
									
									case 5: System.out.println("View the file");
									Listing.main(null);
									break;
									
									case 6 : System.out.println("Delete the file");
									Del.main(null);
									break;
									
									case 7: System.out.println("Close application");
									break;
									}
								}
								
		
						
						default:System.out.println("Select valid number");
						break;
				}
			}

	}
		catch(Exception ex)
		{
		System.out.println(ex.getMessage());
			
	}
		
		}	
		}


