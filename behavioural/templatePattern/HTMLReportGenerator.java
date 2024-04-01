package behavioural.templatePattern;

public class HTMLReportGenerator extends ReportGenerator{
    
    @Override
    public String collectData() {
        return "HTML data";
    }

    @Override
    public String processData(String data) {
        return "Processed HTML data : " + data;
    }

    @Override
    public String formatData(String data) {
        return "formatted HTML data : " + data;
    }
    
}
