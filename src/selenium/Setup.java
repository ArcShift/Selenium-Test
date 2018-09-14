/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium;

import java.net.URL;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

/**
 *
 * @author Jelajah Tekno Indone
 */
public class Setup {
  
  FirefoxOptions firefoxOptions = new FirefoxOptions();
  public WebDriver webDriver;
  JavascriptExecutor jsExe;
  
  public Setup(String url) {
    System.setProperty("webdriver.gecko.driver", "D:\\driver\\geckodriver.exe");
    //    firefoxOptions.addArguments("-headless");
    webDriver = new FirefoxDriver(firefoxOptions);
    webDriver.get(url);
    jsExe = (JavascriptExecutor) webDriver;
//    Object title=jsExe.executeScript("return document.title");
//    System.out.println(title);
  }
  
}
