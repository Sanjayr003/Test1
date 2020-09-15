package automation;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoTest {
	static WebDriver d;

	public static void main(String[] args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://demo.automationtesting.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id='email']")).sendKeys("sanjayr003@gmail.com");
		d.findElement(By.xpath("//*[@id='enterimg']")).click();
		String str=d.getCurrentUrl();
		System.out.println(str);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.navigate().back();
		String str2=d.getCurrentUrl();
		System.out.println(str2);
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//button[@id='btn2']")).click();
		d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys("Sanjay");
		d.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys("Ramachandran");
		d.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("5/80A, Araihatty Village and Post");
		d.findElement(By.xpath("//*[@type='email']")).sendKeys("sanjayr003@gmail.com");
		d.findElement(By.xpath("//*[@type='tel']")).sendKeys("9789449838");
		d.findElement(By.xpath("//*[@value='Male']")).click();
		d.findElement(By.xpath("//*[@value='Cricket']")).click();
		/*WebElement all=d.findElement(By.xpath("//select[@id='Skills']"));
		d.findElement(By.xpath("//select[@id='Skills']")).click();
		Select a=new Select(all);   Normal Select method
		//a.selectByIndex(7);
		a.selectByVisibleText("Excel");*/
		WebElement we=d.findElement(By.xpath("//select[contains(@class,'form')]"));
		Select sel=new Select(we);
		List<WebElement> op=sel.getOptions();
		for(WebElement q:op)
		{
			if(q.getText().equals("Excel"))
			{
				q.click();
				break;
			}
		}
		
		WebElement cou=d.findElement(By.xpath("//select[@id='countries']"));
		Select by=new Select(cou);
		String cc="India";
		List<WebElement> qw=by.getOptions();
		for(WebElement z:qw)
		{
			if(z.getText().equals(cc))
			{
				z.click();
			}
		}
		
		//Date-Month-Year
		List<WebElement> yl=d.findElements(By.xpath("//select[@placeholder='Year']//option"));
		List<WebElement> ml=d.findElements(By.xpath("//select[@placeholder='Month']//option"));
		List<WebElement> dl=d.findElements(By.xpath("//select[@placeholder='Day']//option"));
		
		System.out.println("Year List Size"+yl.size());
		System.out.println("Month List Size"+ml.size());
		System.out.println("Day List Size"+dl.size());
		
		//Year
		for(WebElement ly:yl)
		{
			if(ly.getText().equals("1995"))
			{
				ly.click();
				break;
			}
		}
		//Month
		for(WebElement lm:ml)
		{
			if(lm.getText().equals("August"))
			{
				lm.click();
				break;
			}
		}
		//Day
		for(WebElement ld:dl)
		{
			if(ld.getText().equals("15"))
			{
				ld.click();
				break;
			}
		}
		d.findElement(By.xpath("//div[@id='msdd']")).click();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> lgn=d.findElements(By.xpath("//div[@id='msdd']/following::li"));
		System.out.println("Lang List Size"+lgn.size());
		String l1="English";
		String l2="French";
		String l3="Hindi";
		for(WebElement ngl:lgn)
		{
			if(ngl.getText().equals(l1))
			{
				ngl.click();
			}
			else if(ngl.getText().equals(l2))
			{
				ngl.click();
			}
			else if(ngl.getText().equals(l3))
			{
				ngl.click();
				break;
			}
		}
		d.findElement(By.xpath("//div[@class='form-group']")).click();
		d.findElement(By.xpath("//span[@role='combobox']")).click();
		List<WebElement> qqw=d.findElements(By.xpath("//ul[@role='tree']/li"));
		System.out.println("Country Size"+qqw.size());
		for(WebElement wwq:qqw)
		{
			if(wwq.getText().equals("United States of America"))
			{
				wwq.click();
			}
		}
		
		WebElement pass1=d.findElement(By.xpath("//input[@id='firstpassword']"));
		pass1.sendKeys("Password1");
		WebElement pass2=d.findElement(By.xpath("//input[@id='secondpassword']"));
		pass2.sendKeys("Sanjay1");
		if(pass1.getText().equals(pass2.getText()))
		{
			d.findElement(By.xpath("//button[@id='submitbtn']")).click();
		}
		
		takescreenshot("Register_Page");
		
	}//End of main Function
	
	
	public static void takescreenshot(String filename) throws IOException
	{
		File f=((TakesScreenshot)d).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\sanja\\Desktop\\Selenium\\ScrSht"+filename+".png"));
		
	}

	 
	}//End of Class




