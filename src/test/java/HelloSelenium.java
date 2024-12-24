

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class HelloSelenium {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver(); 
        driver.get("https://techefficio.com");

        String title = driver.getTitle(); 
        System.out.println(title);

        WebElement serviceLink = driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/nav/div/div/ul/li[1]/a"));
        serviceLink.click();

        String newTitle = driver.getTitle(); 
        System.out.println(newTitle);

        driver.quit();

    }
}
