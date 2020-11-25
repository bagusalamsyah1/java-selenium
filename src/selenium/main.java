package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main {
    public static void main (String[] args) {
        // open the chrome browser
        System.setProperty("webdriver.chrome.driver","C://Program Files (x86)//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // navigate to the url
        driver.get("https://www.google.com");
    }
}
