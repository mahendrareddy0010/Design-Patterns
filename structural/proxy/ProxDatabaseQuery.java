package structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class ProxDatabaseQuery implements DatabaseQuery{
    private DatabaseQuery realDatabaseQuery = new RealDatabaseQuery();
    private Map<String, String> cache = new HashMap<>();

    @Override
    public String executeQuery(String query) {
        if (!cache.containsKey(query)) {
            cache.put(query, realDatabaseQuery.executeQuery(query));
        }

        return cache.get(query);
    }
    
}
