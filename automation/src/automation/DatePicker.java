package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePicker {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.phptravels.net/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@class='cc-btn cc-dismiss']")).click();
		d.findElement(By.xpath("//input[@type='text'and@id='checkin']")).click();
		String Year="2022";
		String Month="Dec";
		String Day="31";
		WebElement f=d.findElement(By.xpath("/html/body"));
		Actions a=new Actions(d);
		a.doubleClick(f).perform();
		//d.findElement(By.xpath("//div[@class='datepicker--months datepicker--body']")).click();
		//d.findElement(By.xpath("//*[@class='datepicker--cells datepicker--cells-years']")).click();
		List<WebElement> yr=d.findElements(By.xpath("//*[@class='datepicker--cells datepicker--cells-years']/div"));
		List<WebElement> mn=d.findElements(By.xpath("//div[@class='datepicker--months datepicker--body']/div"));
		List<WebElement> dy=d.findElements(By.xpath("//div[@class='datepicker--cells datepicker--cells-days']/div"));
		System.out.println("day size"+dy.size());
		System.out.println("month size"+mn.size());
		System.out.println("year size"+yr.size());
		
		for(WebElement ry:yr)
			
		{
			if(ry.getText().equals(Year))
			{
				ry.click();
			}
				
		}
		for(WebElement nm:mn)
		{
			if(nm.getText().equals(Month))
			{
				nm.click();
			}
		}
		for(WebElement yd:dy)
		{
			if(yd.getText().equals(Day))
			{
				yd.click();
			}
		}

	}

}
