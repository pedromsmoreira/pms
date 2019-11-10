package pms.infrastructure;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;

@Component
@ConfigurationProperties
@Validated
class Toggle {
    @NotEmpty
    private String name;
    @NotEmpty
    private Boolean active;
}
