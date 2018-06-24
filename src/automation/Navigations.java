package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations 
{
public static void main(String[] args) throws Exception 
	{
	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com/");
	Thread.sleep(5000);
	driver.navigate().to("https://www.google.com/gmail/");
	Thread.sleep(5000);
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().forward();
	Thread.sleep(5000);
	driver.navigate().refresh();
	Thread.sleep(5000);
	driver.close();

	}

}
