package pms.infrastructure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("app")
public class TogglesConfig{

    private List<Toggle> toggles = new ArrayList<>();

    public List<Toggle> getToggles() {
        return toggles;
    }

    public void setToggles(List<Toggle> toggles) {
        this.toggles = toggles;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder("TogglesConfig[{");
        toggles.forEach(t -> sb.append(t.toString()).append(", "));
        sb.append("}]");
        return sb.toString();
    }
}

