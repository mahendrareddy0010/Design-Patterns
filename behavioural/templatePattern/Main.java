public class Main {
    public static void main(String[] args) {
        ReportGenerator pdfReportGenerator = new PDFReportGenerator();
        pdfReportGenerator.generateData();

        ReportGenerator htmlReportGenerator = new HTMLReportGenerator();
        htmlReportGenerator.generateData();

        ReportGenerator csvReportGenerator = new CSVReportGenerator();
        csvReportGenerator.generateData();
    }
}
