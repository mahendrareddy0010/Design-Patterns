package behavioural.chainOfResponsibility.chain;

import behavioural.chainOfResponsibility.QueryType;

public abstract class SupportHandler {
    protected SupportHandler nextHandler;
    
    public abstract void handleRequest(QueryType queryType, String message);

    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public SupportHandler getNextHandler() {
        return nextHandler;
    }
}
