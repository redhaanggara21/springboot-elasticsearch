package com.red21.springlogelk.properties;

import ch.qos.logback.core.util.Duration;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("elasticsearch")
public class ElasticsearchProperties {
    private String[] hostAndPort;
    private Duration socketTimeout;
    private Duration connectTimeout;
}
