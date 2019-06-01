package com.trend.sys.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import javax.inject.Inject;

public class GoogleSearch {
    @FindBy(xpath = "//*[@id=\"search_form_input_homepage\"]")
    WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"search_button_homepage\"]")
    WebElement searchButton;


    @FindBy(xpath = "//*[@id=\"duckbar_static\"]/li[2]/a")
    WebElement buttonImages;

    @Inject
    public GoogleSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchFor(String txt) {
        searchBox.sendKeys(txt);
        searchButton.click();
    }

    public void clickImages() {
        buttonImages.click();
    }
}
