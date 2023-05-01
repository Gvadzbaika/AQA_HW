package org.example;

import com.codeborne.selenide.SelenideElement;

public class Category {

    private SelenideElement categoryName;

    public Category(SelenideElement categoryName){
        this.categoryName = categoryName.$("a.categories_link.btn");
    }

    public String getCategoryName() {
        return categoryName.getText();
    }
}
