package pms.infrastructure;

import com.typesafe.config.ConfigFactory;
import org.springframework.stereotype.Component;

@Component
public class CassandraConfig {
    private String contactPoints;
    private String keyspace;
    private Integer port;

    public CassandraConfig(){
        var cassandraCfg = ConfigFactory.load();
        this.contactPoints = cassandraCfg.getString("cassandra.contactpoints");
        this.port = cassandraCfg.getInt("cassandra.port");
        this.keyspace = cassandraCfg.getString("cassandra.keyspace");
    }

    public String getContactPoints() {
        return contactPoints;
    }

    public Integer getPort() {
        return port;
    }

    public String getKeyspace() {
        return keyspace;
    }

    @Override
    public String toString() {
        return "CassandraConfig{" +
                "contactPoints='" + contactPoints + '\'' +
                ", keyspace='" + keyspace + '\'' +
                ", port=" + port +
                '}';
    }
}
