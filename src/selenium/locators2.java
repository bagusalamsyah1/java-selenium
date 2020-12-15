package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locators2 {
    public static void main (String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver", "C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // max the chrome browser
        driver.manage().window().maximize();

        // navigate to the url
        driver.get("https://opensource-demo.orangehrmlive.com/");

        // enter valid username
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");

        // rnter valid password
        driver.findElement(By.name("txtPassword")).sendKeys("admin123");

        // click on login
        driver.findElement(By.id("btnLogin")).click();

        // verify the URL
        // getCurrentURl()
        String act_url = driver.getCurrentUrl();
        System.out.println(act_url);

        // verify
        String desired_url ="https://opensource-demo.orangehrmlive.com/index.php/dashboard";
        if (act_url.equals(desired_url))
        {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }

        // verify title
        // get title()
        String act_title = driver.getTitle();
        System.out.println(act_title);
        String desired_title = "OrangeHRM";
        // verify
        if(act_title.equals(desired_title))
        {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
        String ps = driver.getPageSource();
        System.out.println(ps);
        driver.close();
    }
}
