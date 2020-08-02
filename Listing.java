package Com.JAVA_ProjectDxc;



	


	
	import java.io.File;
	

	public class Listing {
		public static void main(String[] args) {
			
		
			File files = new File("C:\\Users\\kmanneli\\Downloads\\Director");
			File filenames[] = files.listFiles(); {
			
			for (File filename : filenames)
			{
				
				System.out.println(filename);
				System.out.println("File Name : " + filename.getName());
			}

		}
		}
	}

