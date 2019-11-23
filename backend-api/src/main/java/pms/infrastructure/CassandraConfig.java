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
        this.contactPoints = cassandraCfg.getString(ConfigPathConstants.Cassandra.CONTACT_POINTS);
        this.port = cassandraCfg.getInt(ConfigPathConstants.Cassandra.PORT);
        this.keyspace = cassandraCfg.getString(ConfigPathConstants.Cassandra.KEYSPACE);
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