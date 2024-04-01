package structural.proxy;

public class RealDatabaseQuery implements DatabaseQuery {

    @Override
    public String executeQuery(String query) {
        System.out.println("Executing the Query : " + query);

        return "Result of " + query;
    }
    
}
