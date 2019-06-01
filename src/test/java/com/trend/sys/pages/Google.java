package com.trend.sys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.inject.Inject;
import javax.inject.Named;

public class Google {
    private final WebDriver driver;


    @Inject
    private GoogleSearch searchBox;

    @Inject
    private Actions actions;

    @Inject
    private JavascriptExecutor jsExecutor;

    @Inject
    public Google(WebDriver driver) {
        this.driver = driver;
    }

    public void goTo() {
        this.driver.get("https://duckduckgo.com/");
        driver.manage().window().maximize();
    }
    /*public Google(WebDriver driver) {
        this.webDriver = driver;
        webDriver.get("https://www.google.com/");
        webDriver.manage().window().maximize();
    }
    public void writteSomething() {
        WebElement element1 = webDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
        element1.sendKeys("busncameeee");
    }
    public void pushButton() {
        WebElement element1 = webDriver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]"));
        element1.click();
    }*/
    public GoogleSearch getGoogleSearch() {
        return searchBox = new GoogleSearch(driver);
    }

    public Object execute(String script) {
        return jsExecutor.executeScript(script);
    }

    public void sercharAnother() {
        searchBox.clickImages();
    }
}
