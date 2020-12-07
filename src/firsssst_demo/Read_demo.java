package firsssst_demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_demo {
	public static void main(String[]args) throws FileNotFoundException {
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\pallavi\\TestNg\\config.properties");
	try {
		p.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	String name = p.getProperty("browser");
	System.out.println(name);
	
	
}
}