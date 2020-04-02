package com.github.metalloid.demo.pageobjects;

import com.github.metalloid.demo.Selenium;
import com.github.metalloid.demo.controls.Link;
import com.github.metalloid.pagefactory.FindBy;

public class MyStore extends PageObject {

    @FindBy(linkText = "Contact us")
    private Link contactUs;

    public MyStore open() {
        Selenium.get().get("http://automationpractice.com/index.php");
        return this;
    }

    public void clickContactUs() {
        contactUs.open();
    }
}
