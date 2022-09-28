package finTech;
import java.io.*;

public class throw_keyword{
//	public static void throw_keyword()throws FileNotFoundException
//	{
//		
//	    throw new FileNotFoundException();
//	}
	public static void main(String args[]) {
		
		try {
			FileReader file=new FileReader("C:/Users/SRIRAM/Desktop/java.docx");
			BufferedReader fileinput=new BufferedReader(file);
			
		}
		catch(FileNotFoundException e) {
			System.out.print(e);
		}
		System.out.print("rest");
	}
}
