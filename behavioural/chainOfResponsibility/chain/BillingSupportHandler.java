package behavioural.chainOfResponsibility.chain;

import behavioural.chainOfResponsibility.QueryType;

public class BillingSupportHandler extends SupportHandler{
    
    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType == QueryType.BILLING) {
            System.out.println("Processing the : " + message);
        } else {
            nextHandler.handleRequest(queryType, message);
        }
    }

}
