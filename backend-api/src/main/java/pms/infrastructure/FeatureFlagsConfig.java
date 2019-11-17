package pms.infrastructure;

import com.typesafe.config.ConfigFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import pms.PetMgtSystemApplication;

import java.util.HashMap;

@Component
public class FeatureFlagsConfig {
    private static final Logger LOGGER= LoggerFactory.getLogger(PetMgtSystemApplication.class);

    private HashMap<String, Boolean> featureFlags = new HashMap<>(1);

    public FeatureFlagsConfig() {
        var config = ConfigFactory.load();
        this.featureFlags.put(FeatureFlagsConstants.ACTIVATE_CASSANDRA_RW, config.getBoolean("featureFlags."+FeatureFlagsConstants.ACTIVATE_CASSANDRA_RW));
    }

    public boolean getFeatureFlagValueByName(String name){
        if (this.featureFlags.containsKey(name)) {
            return featureFlags.get(name);
        }

        LOGGER.info("FeatureFlag with name: {} Not Found. Check Name in Configuration.", name);
        return false;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("FeatureFlagsConfig[");
        for (var key : this.featureFlags.keySet()) {
            sb.append(String.format("{ \"%s\": %b },", key, this.featureFlags.get(key)));
        }
        sb.append("]");

        return sb.toString();
    }
}