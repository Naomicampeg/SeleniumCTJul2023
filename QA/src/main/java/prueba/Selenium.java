package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hola Selenium");
	String exePath= "./driver/chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",exePath);
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	}

}
