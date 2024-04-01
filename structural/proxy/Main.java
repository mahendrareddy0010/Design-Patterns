package structural.proxy;

public class Main {
    public static void main(String[] args) {
        DatabaseQuery db = new ProxDatabaseQuery();

        System.out.println(db.executeQuery("query1"));
        System.out.println(db.executeQuery("query2"));
        System.out.println(db.executeQuery("query3"));
        System.out.println(db.executeQuery("query2"));
        System.out.println(db.executeQuery("query3"));
        System.out.println(db.executeQuery("query1"));
    }
}
