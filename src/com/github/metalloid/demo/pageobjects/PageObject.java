package com.github.metalloid.demo.pageobjects;

import com.github.metalloid.core.Metalloid;

public abstract class PageObject {

    public PageObject() {
        Metalloid.initializePage(this);
    }
}
