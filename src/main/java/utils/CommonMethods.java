package utils;

import java.util.concurrent.TimeUnit;

public class CommonMethods {
	
	
	 public static void sleepTime(int time) throws InterruptedException
	    {
	    	Thread.sleep(TimeUnit.SECONDS.toMillis(time));
	    }

}
