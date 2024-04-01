public class CSVReportGenerator extends ReportGenerator{

    @Override
    public String collectData() {
        return "CSV data";
    }

    @Override
    public String processData(String data) {
        return "Processed CSV data : " + data;
    }

    @Override
    public String formatData(String data) {
        return "formatted CSV data : " + data;
    }
    
}
