package expediatest;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {
	
	
	public static Logger log = Logger.getLogger(Logs.class.getName());
	
	public void logTech() {
		
		PropertyConfigurator.configure("./src/test/resources/Properties/log4j.properties");
		log.info("This is information log");
		log.error("This is the error message");
		
	}

}
