package Propertiesconfig;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFiledemo1 {
		
	static Properties prop =new Properties();
	
	public static void main(String[] args) throws Exception {
		
		getfrompropfile();
		setfrompropfile();
		getfrompropfile();		
		
	}
	
	public static void getfrompropfile() throws Exception {
		InputStream input= new FileInputStream("C:\\Users\\Vinoth\\eclipse-workspace\\Seleniumframework\\src\\test\\java\\Propertiesconfig\\config1.properties");
		prop.load(input);
		String value = prop.getProperty("name");
		System.out.println(value);		
	}
	
	public static void setfrompropfile() throws Exception {
		
		OutputStream output= new FileOutputStream("C:\\Users\\Vinoth\\eclipse-workspace\\Seleniumframework\\src\\test\\java\\Propertiesconfig\\config1.properties");
		prop.setProperty("name","Ajay");
		prop.store(output, null);		
	}

}
