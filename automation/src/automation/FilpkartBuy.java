package automation;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FilpkartBuy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.flipkart.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//div/button[@class='_2AkmmA _29YdH8']")).click();
		Actions a=new Actions(d);
		WebElement elect=d.findElement(By.cssSelector("#container > div > div.zi6sUf > div > div > span:nth-child(1)"));
		a.moveToElement(elect).build().perform();
		WebElement sam=d.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div/div[1]/a[4]"));
		a.moveToElement(sam).click().perform();
		WebElement win=d.findElement(By.cssSelector("#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div:nth-child(1) > div > div:nth-child(2) > div > div > div.EstLIe._1YX8KZ > div > div:nth-child(1) > div > div > div:nth-child(2) > div:nth-child(1) > a"));
		win.click();
		Set<String> handles=d.getWindowHandles();
		for (String newWin : handles) 
		{
			d.switchTo().window(newWin);
		} 
		d.findElement(By.cssSelector("#container > div > div._3Z5yZS.NDB7oB._12iFZG._3PG6Wd > div.ooJZfD._3FGKd2 > div.ooJZfD._2oZ8XT.col-5-12._2GJ0F- > div:nth-child(2) > div > ul > li:nth-child(1) > button")).click();

	}

}
