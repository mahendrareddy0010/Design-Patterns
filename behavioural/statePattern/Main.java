package behavioural.statePattern;

public class Main {
    public static void main(String[] args) {
        Document doc = new Document();

        doc.approve();
        doc.publish();
        doc.publish();
        doc.approve();
    }
}
