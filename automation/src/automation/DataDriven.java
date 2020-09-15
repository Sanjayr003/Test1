package automation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDriven {

	public static void main(String[] args) throws BiffException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.navigate().to("http://demo.automationtesting.in/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		d.findElement(By.xpath("//*[@id='email']")).sendKeys("sanjayr003@gmail.com");
		d.findElement(By.xpath("//*[@id='enterimg']")).click();
		
		FileInputStream f=new FileInputStream("C:\\Users\\sanja\\Desktop\\Selenium\\ExcelDatas\\AutomationTestingDatas.xls");
		Workbook b=Workbook.getWorkbook(f);
		Sheet s=b.getSheet(0);
		String fn=s.getCell(0,1).getContents();
		String ln=s.getCell(1,1).getContents();
		String add=s.getCell(2,1).getContents();
		String email=s.getCell(3,1).getContents();
		String pno=s.getCell(4,1).getContents();
		String pass=s.getCell(5,1).getContents();
		String cpass=s.getCell(6,1).getContents();
		
		
		d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(fn);
		d.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(ln);
		d.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(add);
		d.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
		d.findElement(By.xpath("//*[@type='tel']")).sendKeys(pno);
		d.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(pass);
		d.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(cpass);
	}

}
