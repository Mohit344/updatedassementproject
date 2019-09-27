package com.atmecs.util;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/**
 * The class loads the data of the property file and returns the value associated with the key
 * in the property file. 
 * @author Mohit.Jaiswal
 *
 */

public class ReadPropertiesFile {
	static Properties property;
	static File file;
	static FileReader reader;

	/**
	 * methods takes parameter as
	 * @param filePath
	 * @return the propeties of the property file
	 * @throws IOException
	 */

	public static Properties loadProperty(String pathName) throws IOException {
		property= new Properties();
		file = new File(pathName);
		reader = new FileReader(file);
		property.load(reader);

		return property;

	}

}
