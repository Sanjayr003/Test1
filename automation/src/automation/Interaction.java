package automation;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interaction {

	public static void main(String[] args) throws AWTException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://demo.automationtesting.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//input[@id='email']")).click();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_A);
		
		//BufferedImage image=new Robot().createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		//ImageIO.write(image,"png",new File("C:\\Users\\sanja\\Desktop\\Selenium\\ScrSht\\fGG.png"));
		Rectangle screensize=new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage tmp=r.createScreenCapture(screensize);
		ImageIO.write(tmp,"png", new File("C:\\Users\\sanja\\Desktop\\Selenium\\ScrSht\\fG.png"));

	}

}
