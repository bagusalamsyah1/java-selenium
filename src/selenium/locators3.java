package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators3 {
    public static void main (String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://www.ebay.com/");

        // absolute xpath
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/div[1]/input[1]")).sendKeys("T-shirts");
//        driver.findElement(By.xpath("/html[1]/body[1]/header[1]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/table[1]/tbody[1]/tr[1]/td[3]/input[1]")).click();

        // relative xpath
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("shirts for men");
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();

        // or operator
        // driver.findElement(By.xpath("//input[@id='gh-ac'or @name='_nkw']")).sendKeys("shirts for men");

        // or operator
        // driver.findElement(By.xpath("//input[@id='gh-ac'and @name='_nkw']")).sendKeys("shirts for women");

        // contains method
        // driver.findElement(By.xpath("//input[contains(@name,'_n')]")).sendKeys("Shirts for kids");

        // starts-with
        driver.findElement(By.xpath("//input[starts-with(@name,'_n')]")).sendKeys("Shirts for kids");
    }
}
