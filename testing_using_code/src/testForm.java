import org.junit.Test ;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class testForm {
    WebDriver driver;

    @Test
    public void firstScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");
        WebElement NumberOneToTen = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
        NumberOneToTen.sendKeys("11");
        WebElement returned = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[2]/div/div[2]/div/div[2]/span"));
        Assert.assertTrue(returned.isDisplayed());
        driver.close();
    }

    @Test
    public void secondScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");
        WebElement button = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        button.click();
        WebElement returned = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[4]/div/span"));
        Assert.assertTrue(returned.isDisplayed());
        driver.close();
    }

    @Test
    public void thirdScenario() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://forms.office.com/Pages/ResponsePage.aspx?id=DQSIkWdsW0yxEjajBLZtrQAAAAAAAAAAAAN__tQlYTdURExDM0ZZQVBZQzIyRjQzMjNMTFk3RTYzMy4u");

        WebElement required = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[2]/div[3]/div/div[2]/div/div/input"));
        required.sendKeys("filled Text Field");

        WebElement button = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[2]/div[3]/div[1]/button/div"));
        button.click();
        WebElement returned = driver.findElement(By.xpath("//*[@id=\"form-container\"]/div/div/div/div/div[1]/div[2]/div[1]/div[1]/span"));
        Assert.assertEquals(returned.getText(), "Thanks!");
        driver.close();
    }



}
