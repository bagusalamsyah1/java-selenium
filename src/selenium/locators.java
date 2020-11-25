package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class locators {
    public static void main (String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://www.google.com/");

        // locator by id
//        driver.findElement(By.id("search_query_top")).sendKeys("T-Shirts");

        //locator by name
//        driver.findElement(By.name("search_query")).sendKeys("Shirts");
//        driver.findElement(By.name("search_qu")).sendKeys("Shirts");

        // locator by link text
//        driver.findElement(By.linkText("Printed Dress")).click();

        // locator by partial link text
//        driver.findElement(By.partialLinkText("Printed Dress")).click();

        // locator by tag name
        List<WebElement> link=driver.findElements(By.tagName("a"));
        System.out.println(link.size()); //21

        // locator name of links
        for (WebElement l : link)
        {
            System.out.println(l.getText());
        }
    }
}
