package behavioural.chainOfResponsibility;

import behavioural.chainOfResponsibility.chain.SupportHandler;

public class Main {
    public static void main(String[] args) {
        SupportHandler chainHead = CustomerSupport.getSupportChain();

        chainHead.handleRequest(QueryType.GENERAL, "general query");
        chainHead.handleRequest(QueryType.TECHNICAL, "technical query");
        chainHead.handleRequest(QueryType.BILLING, "billing query");
    }
}
