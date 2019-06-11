package com;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFileDemo {

	public static void main(String[] args) {

		try {
			
			FileInputStream fis=new FileInputStream("src/names.properties");
			Properties props=new Properties();
			props.load(fis);
			
			System.out.println(props);
			
			System.out.println("Name: "+props.getProperty("name"));
			
			

		} catch (Exception e) {
			System.out.println("Failed due to " + e);
		}

	}

}
