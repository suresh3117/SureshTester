package Selini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Waittt {
	public static void main(String[]args) {
		
	}
	System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Selli\\target\\driver\\msedgedriver.exe");
	WebDriver driver=new EdgeDriver(); //type caste /upcasting;
	String url=("https://www.facebook.com/");
	driver.get(url);
}
