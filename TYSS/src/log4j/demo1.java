package log4j;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class demo1 {

	public static void main(String [] args) throws FileNotFoundException, IOException {
		Properties p=new Properties();
		p.load(new FileInputStream("C:\\Users\\Rohith\\git\\repository01\\TYSS\\src\\f1.properties"));
		String value = p.getProperty("one");
		System.out.println(value);
		System.out.println(p.getProperty("two"));
	}
	
}
