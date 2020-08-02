package Com.JAVA_ProjectDxc;





	import java.io.File;
	import java.io.IOException;
	import java.util.Scanner;
	 public class Directory {
	public String path;

	      

	      public void setPath(String path) {
	    	  this.path = path;
	      File file = new File("C:\\Users\\kmanneli\\Downloads\\Director\\" + path);
	      boolean bool = file.mkdir();
	      if(bool){
	    	  System.out.println("Registration sucessful");
	         System.out.println("Directory created successfully");
	         System.out.println(file.getAbsolutePath());
	         System.out.println(file.getName());
	         
	      }else{
	         System.out.println("Sorry couldn’t create specified directory");  
	      }  
	      }
	 	}

