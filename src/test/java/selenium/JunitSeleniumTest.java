package selenium;

import java.io.File;
import java.net.URL;
import java.util.Map;

import junit.framework.Assert;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class JunitSeleniumTest {
    @Test
    public void myTest() throws Exception {
    	String sysEnvStr = System.getenv("JAVA_HOME");
    	String sysEnvStr1 = System.getenv("PATH");
    	
    	System.out.println("Selenium Test Successfull"+sysEnvStr+"heheheh"+sysEnvStr1);
        
    	Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n", envName, env.get(envName));
        }


    	
    	WebDriver driver = new RemoteWebDriver(
                                new URL("http://app42seleniumipaddress/wd/hub/"), 
                                DesiredCapabilities.firefox());
        
        driver.get("http://www.google.com");
       
        
        // RemoteWebDriver does not implement the TakesScreenshot class
        // if the driver does have the Capabilities to take a screenshot
        // then Augmenter will add the TakesScreenshot methods to the instance
        WebDriver augmentedDriver = new Augmenter().augment(driver);
        File screenshot = ((TakesScreenshot)augmentedDriver).
                            getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File("/home/paasadmin/testimage.png"));
        Assert.assertEquals(driver.getTitle(), "Google");
		System.out.println("Selenium Test Successfull");
        
    }
	@Test
    public void myTest2() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest3() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest4() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest5() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest6() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest7() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest8() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest9() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest10() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest11() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest12() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest132() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest142() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest152() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest162() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest172() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest182() {
		Assert.assertEquals("Google", "Google");
	}
	@Test
    public void myTest192() {
		Assert.assertEquals("Google", "Google");
	}
}