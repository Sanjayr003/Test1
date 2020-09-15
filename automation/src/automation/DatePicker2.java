package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.phptravels.net/");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@class='cc-btn cc-dismiss']")).click();
		d.findElement(By.xpath("//input[@type='text'and@id='checkin']")).click();
		
		String Month="December 2020";
		String Day="31";
		while(true)
		{
		String text=d.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[2]")).getText();
		if(text.equals(Month))
		{
			break;
		}
		else
		{
			d.findElement(By.xpath("//*[@id=\"datepickers-container\"]/div[1]/nav/div[3]/svg")).click();
		}
		}
		
		d.findElement(By.xpath("//div[@class='datepicker--cells datepicker--cells-days']/div[contains(text(),"+Day+")]")).click();
		

	}

}
