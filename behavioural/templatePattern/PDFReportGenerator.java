public class PDFReportGenerator extends ReportGenerator{
    
    @Override
    public String collectData() {
        return "PDF data";
    }

    @Override
    public String processData(String data) {
        return "Processed PDF data : " + data;
    }

    @Override
    public String formatData(String data) {
        return "formatted PDF data : " + data;
    }
    
}
