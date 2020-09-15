package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selenium {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanja\\Desktop\\Selenium\\ChromeDriver\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("https://accounts.google.com/");
//d.get("https://www.facebook.com/");
//d.navigate().to("https://accounts.google.com/");
d.manage().window().maximize();
d.findElement(By.cssSelector("#identifierId")).click();
d.findElement(By.cssSelector("#identifierId")).sendKeys("balasrinivas267@gmail.com");
d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
d.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("Balaji@4696");
d.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb")).click();
//WebDriverWait wait=new WebDriverWait(d,3);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")));
//d.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).click();
//d.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("Balaji@4696");
//d.findElement(By.name("password")).sendKeys("Balaji@4696");
d.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb")).click();
//d.findElement(By.id("email")).sendKeys("sanjayr003@gmail.com");
//d.findElement(By.id("pass")).sendKeys("TinTinTidun");
//d.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
//WebDriverWait wait=new WebDriverWait(d,5);
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"u_0_b\\\"]")));

//d.switchTo().alert().accept();
//d.findElement(By.cssSelector("#mount_0_0 > div > div:nth-child(1) > div.rq0escxv.l9j0dhe7.du4w35lb > div:nth-child(3) > div.n7fi1qx3.hv4rvrfc.b3onmgus.poy2od1o.kr520xx4.ehxjyohh > div.bp9cbjyn.j83agx80.rl25f0pe.byvelhso.l9j0dhe7.du4w35lb > div:nth-child(3) > span > div > div.oajrlxb2.tdjehn4e.qu0x051f.esr5mh6w.e9989ue4.r7d6kgcz.rq0escxv.nhd2j8a9.j83agx80.p7hjln8o.kvgmc6g5.cxmmr5t8.oygrvhab.hcukyx3x.jb3vyjys.rz4wbd8a.qt6c0cv9.a8nywdso.i1ao9s8h.esuyzwwr.f1sip0of.lzcic4wl.l9j0dhe7.abiwlrkh.p8dawk7l.bp9cbjyn.s45kfl79.emlxlaya.bkmhp75w.spb7xbtv.rt8b4zig.n8ej3o3l.agehan2d.sk4xxmp2.taijpn5t.qypqp5cg.q676j6op > svg > path")).click();
//d.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[2]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div/div/div/div/div/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div/div/div[2]/label/input")).sendKeys("Balaji Srinivas");
//d.findElement(By.xpath("//*[@id=\"100009757059593\"]/div/a/div/div[2]/span")).click();
//d.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys("Test1");
//d.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div/div/div/div/div/div/div[2]/div/div[2]/form/div/div[3]/div[2]/div[1]/div/div/div/div/div[2]/div/div/div/div")).sendKeys(Keys.ENTER);

//WebDriverWait wait=new WebDriverWait(d,5);
//d.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/div[2]")).click();
//d.findElement(By.name("password")).sendKeys("TinTinTidun");
//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb")));
//d.findElement(By.cssSelector("#passwordNext > div > button > div.VfPpkd-RLmnJb")).click();

	}

}
