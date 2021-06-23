package com.Base.org;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_Page {

	public static WebDriver driver;
	public static Properties prop;

	public Base_Page() throws Exception {
		prop = new Properties();
		FileInputStream ip = new FileInputStream("./src/main/java/com/config/config.properties");
		prop.load(ip);
	}

	public static void initialization() {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
}
