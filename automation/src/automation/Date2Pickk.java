package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date2Pickk {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("https://www.expedia.ca/?pwaLob=wizard-hotel-pwa-v2");
		d.manage().window().maximize();
		d.findElement(By.xpath("//button[@data-name='d1']")).click();
		
		String month="October 2020";
		String date="15";
		
		while(true)
		{
			
			String text=d.findElement(By.xpath("//div[1]//h2[@class='uitk-new-date-picker-month-name uitk-type-medium' and text()='September 2020']")).getText();
			if(text.equals(month))
			{
				break;
			}
			else
			{
				d.findElement(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[1]/button[2]")).click();
			}
			
			List<WebElement> all=d.findElements(By.xpath("//*[@id=\"wizard-hotel-pwa-v2-1\"]/div[2]/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[1]/table[1]/tbody//td[2]/button"));
			
			for(WebElement lla:all)
			{
				System.out.println(lla.getText());
			}
		
		
		}
		

	}

}
 