package com.benwaffle.pslib;

public class Log {
	public enum Level {
		ERROR, // serious problems (eg ArrayIndexOutOfBounds)
		WARN, // warnings (eg wrong username/password)
		DEBUG // what program is doing (eg logging in)
	}
	
	public static Level logLvl = Level.ERROR;
	
	public static void e(String text){
		System.err.println(System.currentTimeMillis() + " [ERROR] " + text);
	}
	
	public static void w(String text){
		if (logLvl == Level.WARN || logLvl == Level.DEBUG)
			System.out.println(System.currentTimeMillis() + " [WARN] " + text);
	}
	
	public static void d(String text){
		if (logLvl == Level.DEBUG)
			System.out.println(System.currentTimeMillis() + " [DEBUG] " + text);
	}
}
