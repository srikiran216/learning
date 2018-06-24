package automation;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SearchPreferedWordInGoogleSearch 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("Enter a word to search ");
		Scanner scan=new Scanner(System.in);
		String x=scan.nextLine();
		System.out.println("Enter a prefered word u want");
		String y=scan.nextLine();
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement e=driver.findElement(By.name("q"));
		Actions a=new Actions(driver);
		a.sendKeys(e, x).build().perform();
		int c=0;
		while(2>1)
		{
			if(e.getAttribute("value").equals(y))
			{
				System.out.println("The word u want to search was found");
				a.sendKeys(Keys.ENTER).build().perform();
				break;
			}
			else if(c==11)
			{
				System.out.println("The word u trying to search was not found");
				break;
			}
			else
			{
				a.sendKeys(Keys.DOWN).build().perform();
				Thread.sleep(1000);
				System.out.println(e.getAttribute("value"));
				c= c+1;
				Thread.sleep(1000);
			}
		}
	}

}
