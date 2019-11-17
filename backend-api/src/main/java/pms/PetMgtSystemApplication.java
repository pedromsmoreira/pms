package pms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pms.infrastructure.CassandraConfig;
import pms.infrastructure.FeatureFlagsConfig;

@SpringBootApplication
public class PetMgtSystemApplication {

    private static final Logger LOGGER= LoggerFactory.getLogger(PetMgtSystemApplication.class);

    @Autowired
    private CassandraConfig cassandraConfig;
    @Autowired
    private FeatureFlagsConfig togglesConfig;

    public static void main(String[] args){
        LOGGER.info("Starting application...");
        SpringApplication.run(PetMgtSystemApplication.class, args);
    }

}
