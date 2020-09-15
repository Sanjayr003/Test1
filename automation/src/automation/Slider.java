package automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://demo.automationtesting.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id='email']")).sendKeys("sanjayr003@gmail.com");
		d.findElement(By.xpath("//*[@id='enterimg']")).click();
		WebElement wig=d.findElement(By.xpath("//a[@href='Widgets.html']"));
		Actions act=new Actions(d);
		act.moveToElement(wig).build().perform();
		WebElement sli=d.findElement(By.xpath("//a[@href='Slider.html']"));
		act.moveToElement(sli).click().perform();
		WebElement inslide=d.findElement(By.id("slider"));
		act.dragAndDropBy(inslide, 0, 0).perform();
		//act.dragAndDropBy(inslide, 10,20).perform();

	}

}
