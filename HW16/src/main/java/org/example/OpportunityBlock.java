package org.example;

import com.codeborne.selenide.SelenideElement;

import java.util.List;

public class OpportunityBlock {
    private SelenideElement opportunityTitle;



    public OpportunityBlock(SelenideElement opportunity) {
        this.opportunityTitle = opportunity.$("p.opportunity-item_title.p-l");
    }

    public String getOpportunityTitle() {
        return opportunityTitle.getText();
    }

}
