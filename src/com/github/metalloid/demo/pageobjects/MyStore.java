package com.github.metalloid.demo.pageobjects;

import com.github.metalloid.demo.controls.Link;
import com.github.metalloid.pagefactory.FindBy;
import com.github.metalloid.webdriver.WebDriverPool;

public class MyStore extends PageObject {

    @FindBy(linkText = "Contact us")
    private Link contactUs;

    public MyStore open() {
        WebDriverPool.get().get("http://automationpractice.com/index.php");
        return this;
    }

    public void clickContactUs() {
        contactUs.open();
    }
}
