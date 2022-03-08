package nLayeredInfo.core;

import nLayeredInfo.jLogger.jLoggerManager;

public class jLoggerManagerAdapter implements LoggerService{

	@Override
	public void logToSystem(String message) {
		jLoggerManager jloggerManager=new jLoggerManager();
		jloggerManager.log(message);
	}

}
