package cloudtesla.crm.GenericLibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFileUtility {
		/**
		 * this method will read data from property file for the key given by user and return value to user
		 * @author 
		 *@param key
		 *@throws Throwable
		 *@return
		 */
		public String readDataFromPropertyFile(String key) throws IOException {
			FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\CommonData's.properties");
			Properties p=new Properties();
			p.load(fis);
			String value = p.getProperty(key);
			return value;
			
		}

		}

