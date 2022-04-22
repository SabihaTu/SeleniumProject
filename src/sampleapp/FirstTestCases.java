package sampleapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCases {

    public static WebDriver webDriver = null;

    public static void main(String[] args)
    {
        webDriver = initWebDriver("webdriver.chrome.driver", "C:\\Users\\Developer01\\Downloads\\chromedriver_win32\\chromedriver.exe");
        openWebDriver(webDriver, "http://automationpractice.com") ;
    }

    public static WebDriver initWebDriver(String webDriverName, String webDriverLocation)
    {
        System.setProperty(webDriverName, webDriverLocation);
        WebDriver webDriver = new ChromeDriver();
        return webDriver;
    }

    public static void openWebDriver(WebDriver wd,  String url)
    {
        wd.manage().window().maximize();
        wd.get("http://automationpractice.com");
    }


}
