package day5;
import java.io.File;
public class CheckFileDirectory {

	public static void main(String[] args) {
		File my_file_dir = new File("C:\\Users\\hemal\\Downloads\\OneDrive\\Desktop\\pdf\\ai2.docx");
        if (my_file_dir.isDirectory()) 
          {
           System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
          } 
        else
         {
           System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
         }
        if (my_file_dir.isFile()) 
          {
           System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
          } 
        else
         {
           System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
         }  
     }
	}