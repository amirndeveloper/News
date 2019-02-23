package ir.amirmohammadnoori.app;

import ir.amirmohammadnoori.rest.NewsRestService;

import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;
public class NewsApplication extends Application  {

    private Set<Object> singletons = new HashSet<Object>();
    public NewsApplication() {
        // Register our hello service
        singletons.add(new NewsRestService());
    }
    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}
