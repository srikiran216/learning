package automation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\kiran\\SELENIUM\\geckodriver.exe");
        FirefoxDriver kir=new FirefoxDriver();
		kir.get("https://www.google.co.in");
		
		
		}

}
