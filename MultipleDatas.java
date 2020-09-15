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

public class MultipleDatas {

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
		int row=s.getRows();
		
		int col=s.getColumns();
		
		
		String fn=null;
		String ln=null;
		String add=null;
		String email=null;
		String pno=null;
		String pass=null;
		String cpass=null;
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
		 
			fn=s.getCell(0,i).getContents();
			ln=s.getCell(1,i).getContents();
			add=s.getCell(2,i).getContents();
			email=s.getCell(3,i).getContents();
			pno=s.getCell(4,i).getContents();
			pass=s.getCell(5,i).getContents();
			cpass=s.getCell(6,i).getContents();

			
			}
			
			d.findElement(By.xpath("//*[@placeholder='First Name']")).sendKeys(fn);
			d.findElement(By.xpath("//*[@placeholder='Last Name']")).sendKeys(ln);
			d.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys(add);
			d.findElement(By.xpath("//*[@type='email']")).sendKeys(email);
			d.findElement(By.xpath("//*[@type='tel']")).sendKeys(pno);
			d.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys(pass);
			d.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys(cpass);
			d.navigate().refresh();
		}
		
		
	}

	
}
