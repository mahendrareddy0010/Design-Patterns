package behavioural.chainOfResponsibility;

import behavioural.chainOfResponsibility.chain.BillingSupportHandler;
import behavioural.chainOfResponsibility.chain.GeneralSupportHandler;
import behavioural.chainOfResponsibility.chain.SupportHandler;
import behavioural.chainOfResponsibility.chain.TechnicalSupportHandler;

public class CustomerSupport {
    public static SupportHandler getSupportChain() {
        SupportHandler technicalSupportHandler = new TechnicalSupportHandler();
        SupportHandler generalSupportHandler = new GeneralSupportHandler();
        SupportHandler billingSupportHandler = new BillingSupportHandler();

        technicalSupportHandler.setNextHandler(billingSupportHandler);
        billingSupportHandler.setNextHandler(generalSupportHandler);

        return technicalSupportHandler;
    }
}
