package tests;

import com.github.metalloid.demo.Selenium;
import com.github.metalloid.demo.pageobjects.MyStore;
import com.github.metalloid.webdriver.WebDriverPool;
import org.junit.Test;

public class TestLinks {

    @Test
    public void test_1() {
        WebDriverPool.registerWrapper(Selenium.class);
        new MyStore().open()
                .clickContactUs();
    }
}
