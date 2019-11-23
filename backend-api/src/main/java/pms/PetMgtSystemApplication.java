package pms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetMgtSystemApplication {

    private static final Logger LOGGER= LoggerFactory.getLogger(PetMgtSystemApplication.class);

    public static void main(String[] args){
        LOGGER.info("Starting application...");
        SpringApplication.run(PetMgtSystemApplication.class, args);
    }

}
