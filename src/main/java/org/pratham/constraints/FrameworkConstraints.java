package org.pratham.constraints;

public final class FrameworkConstraints {
	
	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir")+"/src/test/resources/Executables/chromedriver.exe";
	

	public static String getChromeDriverpath() {
		return CHROMEDRIVERPATH;
	}

	
}
