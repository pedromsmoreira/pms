package pms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pms.infrastructure.CassandraConfig;
import pms.infrastructure.TogglesConfig;

@SpringBootApplication
public class PetMgtSystemApplication implements CommandLineRunner {

    @Autowired
    private CassandraConfig cassandraConfig;
    @Autowired
    private TogglesConfig togglesConfig;

    public static void main(String[] args){
        SpringApplication.run(PetMgtSystemApplication.class, args);
    }

    @Override
    public void run(String... args){
        System.out.println(togglesConfig);
        System.out.println(cassandraConfig);
    }
}
