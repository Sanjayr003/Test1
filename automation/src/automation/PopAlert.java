package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopAlert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//input[@name='email']")).sendKeys("sanjayr003@gmail.com");
		d.findElement(By.xpath("//input[@name='pass']")).sendKeys("TinTinTidun");
		d.findElement(By.xpath("//button[@name='login']")).click();
		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		d.switchTo().alert().accept();


	}

}
