package test.java.tests;

import com.github.metalloid.demo.pageobjects.MyStore;
import org.junit.Test;

public class TestLinks {

    @Test
    public void test_1() {
        new MyStore().open()
                .clickContactUs();
    }
}
