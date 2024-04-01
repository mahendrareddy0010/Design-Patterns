public abstract class ReportGenerator {
    public abstract String collectData();
    public abstract String processData(String data);
    public abstract String formatData(String data);

    public void printReport(String report) {
        System.out.println(report);
    }

    public void generateData() {
        String data = collectData();
        String processedData = processData(data);
        String report = formatData(processedData);

        printReport(report);
    }
}
