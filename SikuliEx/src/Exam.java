import java.io.File;
import java.util.Properties;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Exam
{
	public static void main(String[] args) throws Exception
	{
	    System.setProperty("webdriver.chrome.driver", "D:\\app selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		/*Screen s=new Screen();
		ScreenImage sc=s.capture();
		ImageIO.write(sc.getImage(), "png", new File("D:\\scree.png"));*/
		System.out.println(driver.getCurrentUrl());
		driver.getPageSource();
		}
}
