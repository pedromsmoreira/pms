package pms.infrastructure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties("cassandra")
@Validated
public class CassandraConfig {
    @NotEmpty
    private String contactPoints;
    @NotEmpty
    private String keyspace;
    @Min(1025)
    @Max(65536)
    private Integer port;

    public String getContactPoints() {
        return contactPoints;
    }

    public void setContactPoints(String contactPoints) {
        this.contactPoints = contactPoints;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getKeyspace() {
        return keyspace;
    }

    public void setKeyspace(String keyspace) {
        this.keyspace = keyspace;
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
