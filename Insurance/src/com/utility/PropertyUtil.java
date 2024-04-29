package com.utility;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class PropertyUtil {
	
	    private static final String PROPERTY_FILE_PATH = "connection.properties";

	    public static String getPropertyString() {
	        Properties properties = new Properties();
	        try (FileInputStream fis = new FileInputStream(PROPERTY_FILE_PATH)) {
	            properties.load(fis);
	            String hostname = properties.getProperty("hostname");
	            String dbname = properties.getProperty("dbname");
	            String username = properties.getProperty("username");
	            String password = properties.getProperty("password");
	            String port = properties.getProperty("port");
	            return String.format("jdbc:mysql://%s:%s/%s", hostname, port, dbname);
	        } catch (IOException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	}



