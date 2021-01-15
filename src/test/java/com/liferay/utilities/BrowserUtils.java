package com.liferay.utilities;

public class BrowserUtils {
    
//Performs a pause
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
