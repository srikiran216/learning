package automation;

import java.awt.image.BufferedImage;
import java.io.File;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.util.LoadLibs;

public class IrctcCpatcha {

	public static void main(String[] args) throws Exception 
	{
		//open browser
		System.setProperty("webdriver.chrome.driver", "D:\\kiran\\SELENIUM\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		//open irctc site
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in");
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='html5Captcha']")));
		WebDriverWait w=new WebDriverWait(driver, 15);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//script[@charset='utf-8']/parent::head/following-sibling::body/div/div[2]")));
		//get entire page screenshot
		File scrnshot=driver.getScreenshotAs(OutputType.FILE);
		BufferedImage fullimage=ImageIO.read(scrnshot);
		driver.switchTo().defaultContent();
		//get location of element on page
		WebElement ele=driver.findElement(By.id("html5Captcha"));
		Point p=ele.getLocation();
		//get height and width of th element
		int elewidth=ele.getSize().getWidth();
		int eleheight=ele.getSize().getHeight();
		//crop the entire page screenshot to get only element screen shot
		BufferedImage elescrnshot=fullimage.getSubimage(p.getX(), p.getY(), elewidth, eleheight);
		ImageIO.write(elescrnshot, "png", scrnshot);
		//copy the element screenshot to hard disk
		File captch=new File("D:\\kiran\\captch.png");
		FileUtils.copyFile(scrnshot, captch);
		//get text from captcha image using OCR
		Tesseract obj=new Tesseract();
		File fo=LoadLibs.extractTessResources("tessdata");
		obj.setDatapath(fo.getAbsolutePath());
		String captchText=obj.doOCR(captch);
		Thread.sleep(20000);
		System.out.println(captchText);
		
		/*driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='html5Captcha']")));
		WebElement eleClick=driver.findElement(By.xpath("//script[@charset='utf-8']/parent::head/following-sibling::body/div/div[2]/div[1]/div/div/div"));
		Actions a=new Actions(driver);
		a.click(eleClick);*/

	}

}
