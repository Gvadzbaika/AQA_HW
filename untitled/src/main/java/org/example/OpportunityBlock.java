package org.example;

import com.codeborne.selenide.SelenideElement;

public class OpportunityBlock {
    private SelenideElement opportunityTitle;

    public OpportunityBlock(SelenideElement opportunity) {
        this.opportunityTitle = opportunity.$("p.opportunity-item_title.p-l");
    }

    public String getOpportunityTitle() {
        return opportunityTitle.getText();
    }

}
