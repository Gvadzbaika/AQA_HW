package org.example;

import java.util.List;

    public interface OpportunitiesProvider {
        List<OpportunityBlock> getOpportunitiesBlocks();
        List<String> getOpportunities(List<OpportunityBlock> opportunityBlockList);
    }

