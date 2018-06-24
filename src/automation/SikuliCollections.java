package automation;

import java.util.Iterator;

import org.sikuli.script.FindFailed;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class SikuliCollections {

	public static void main(String[] args) throws Exception 
	{
		
		ImagePath.setBundlePath("D:\\kiran\\SELENIUM\\eclipse-workspace\\learning\\");
		Screen s=new Screen();
		s.click("minimize.png");
		Thread.sleep(5000);
		Iterator<Match> l=s.findAll("edit.png");
		int count=0;
		
		while(l.hasNext())
		{
			count=count+1;
			l.next().click();
			Thread.sleep(2000);
		}
		System.out.println(count);

	}

}
