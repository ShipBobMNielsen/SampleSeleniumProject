import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SampleTestClass {

  WebDriver driver;

  @BeforeEach
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.manage().window().maximize();
  }

  @Test
  void sampleTest() {

  }

  @AfterEach
  public void teardown() {
    driver.quit();
  }
}
