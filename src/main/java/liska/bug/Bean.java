package liska.bug;

import java.util.Map;
import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import io.quarkus.runtime.Startup;

@ApplicationScoped
@Startup
public class Bean {

    @Inject
    @ConfigProperty(name = "property-map")
    Map<String, String> propertyMap;

    @PostConstruct
    public void postConstruct() {
        propertyMap.forEach((key, value) -> {
            System.out.format("%s: %s%n", key, value);
        });
    }

}