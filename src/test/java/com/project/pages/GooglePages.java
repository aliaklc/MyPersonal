package com.project.pages;

import com.project.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePages {

    public GooglePages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(linkText = "Store")
    public WebElement store;

    @FindBy(linkText = "About")
    public WebElement about;




}
