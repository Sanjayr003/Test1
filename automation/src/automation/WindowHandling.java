package automation;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://leafground.com/pages/Window.html");
		d.manage().window().maximize();
		String str=d.getWindowHandle();
		System.out.println(str);
		WebElement w1=d.findElement(By.xpath("//button[@id='home']"));
		w1.click();
		
		Set<String> handles=d.getWindowHandles();
		
		for (String newWin : handles) 
		{
			d.switchTo().window(newWin);
		}
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.findElement(By.xpath("//img[@alt='Alert']")).click();
		d.findElement(By.xpath("//button[@onclick='normalAlert()']")).click();
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.switchTo().alert().accept();
		String nw=d.getCurrentUrl();
		System.out.println(nw);
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.close();
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		d.switchTo().window(str);
		d.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		int n=d.getWindowHandles().size();
		System.out.println("Windows opened "+n);
		d.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		Set<String> mulhan = d.getWindowHandles();
		for (String allwin : mulhan) 
		{
			if(!allwin.equals(str))
			{
				d.switchTo().window(allwin);
				d.close();
			}
		}
		
	}

}
