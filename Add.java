package Com.JAVA_ProjectDxc;


	
	

	import java.io.File;
	import java.util.Scanner;
	import java.io.IOException;


	public class Add {

		public static void main(String[] args) throws IOException {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter filename");
			String filename = scan.next();
			File file = new File("C:\\Users\\kmanneli\\Downloads\\Director\\" + filename);
			boolean status;
			if (file.exists())
				System.out.println("File exists");
			else {
				status = file.createNewFile();
				System.out.println((status == true) ? "File Created.." : "File Not Created..");
			}

		}

	}



