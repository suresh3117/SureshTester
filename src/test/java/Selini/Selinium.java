package Selini;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
public class Selinium {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\admin\\eclipse-workspace\\Selli\\target\\driver\\msedgedriver.exe");
		WebDriver driv=new EdgeDriver(); //type caste /upcasting;
		String url=("https://www.flipkart.com/account/login?ret=%2F");
		driv.get(url);
	  String page=driv.getPageSource();
		System.out.println(page);
		driv.manage().window().maximize();
		driv.navigate().back();
		Thread.sleep(4000);
		driv.navigate().forward();
		Thread.sleep(4000);
		driv.switchTo().newWindow(WindowType.TAB);
	String s=driv.getCurrentUrl();
		String s4=driv.getTitle();
		System.out.println(s4);
	System.out.println(s);
	if(url.equals(s)) {
		System.out.println("matched");
	}
	else {
		System.out.println("not matched");  
	}
	
	driv.close();
	Thread.sleep(4000);
	driv.quit();
		System.out.println("gtghfgh");
		
	}

}
