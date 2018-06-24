package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getattri
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.findElement(By.xpath("//*[@autocomplete='username']")).sendKeys("dslkjflkj",Keys.ENTER);
		Thread.sleep(5000);
        String text=driver.findElement(By.xpath("(//*[@jsname='B34EJ'])[1]")).getAttribute("class");
        System.out.println(text);
	}

}
