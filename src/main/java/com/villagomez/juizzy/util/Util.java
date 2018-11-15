package com.villagomez.juizzy.util;

import java.io.IOException;
import org.springframework.stereotype.Component;
import com.villagomez.juizzy.constants.Constants;
import org.slf4j.*;

@Component
public class Util {
	
	public static void logAdd(Class classToLog, String methodName, String message, Constants.TYPES type) throws NoSuchMethodException, SecurityException, IOException {
		Logger LOGGER = LoggerFactory.getLogger(classToLog);
		String msg = "Method name: "+classToLog.getDeclaredMethod(methodName).getName()+" Message: "+message;
		switch (type) {
			case INFO:
				LOGGER.info(msg);
			break;
			case DEBUG:
				LOGGER.debug(msg);
			break;
			case WARN:
				LOGGER.warn(msg);
			break;
			case ERROR:
				LOGGER.error(msg);
			break;
			default:
				LOGGER.error("ERROR GENERADO EL LOG");
			break;	
		}
	}
}
