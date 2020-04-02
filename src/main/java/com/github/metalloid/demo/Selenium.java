package com.github.metalloid.demo;

import com.github.metalloid.webdriver.MetalloidDriver;
import com.github.metalloid.webdriver.WebDriverPool;
import com.github.metalloid.webdriver.utils.Inject;
import com.github.metalloid.webdriver.utils.Mouse;
import com.github.metalloid.webdriver.utils.UtilsFactory;
import org.openqa.selenium.WebDriver;

public class Selenium extends MetalloidDriver {

    @Inject
    private Mouse mouse;

    public static Selenium get() {
        return (Selenium) WebDriverPool.getCustom();
    }

    public Selenium(WebDriver driver) {
        super(driver);
        UtilsFactory.initUtilities(driver, this);
    }

    @Override
    public void get(String url) {
        System.out.println("Opening url: " + url);
        driver.get(url);
    }

}
