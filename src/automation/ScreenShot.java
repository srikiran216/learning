package automation;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot 
{
public static void main(String[] args) throws Exception 
{
	System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://www.way2sms.com");
	Thread.sleep(5000);
	File scr=driver.getScreenshotAs(OutputType.FILE);
	File dst=new File("D:\\kiran\\SELENIUM\\programs\\testscreenshot.png");
	FileUtils.copyFile(scr, dst);
	}

}
