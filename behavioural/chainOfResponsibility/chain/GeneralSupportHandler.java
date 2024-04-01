package behavioural.chainOfResponsibility.chain;

import behavioural.chainOfResponsibility.QueryType;

public class GeneralSupportHandler extends SupportHandler{

    @Override
    public void handleRequest(QueryType queryType, String message) {
        if (queryType == QueryType.GENERAL) {
            System.out.println("Processing the : " + message);
        } else {
            nextHandler.handleRequest(queryType, message);
        }
    }
   
}
