package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\FirefoxDriver\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		//d.get("https://www.amazon.com/");
		d.navigate().to("https://accounts.google.com/");
		d.manage().window().maximize();
		d.findElement(By.id("identifierId")).sendKeys("sanjayr003");
		d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
		d.findElement(By.name("password")).sendKeys("TinTinTidun");
		d.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb")).click();

	}

}
