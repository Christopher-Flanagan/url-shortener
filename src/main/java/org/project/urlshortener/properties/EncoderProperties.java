package org.project.urlshortener.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("feature.encoder-url")
@Data
public class EncoderProperties {
    private final String baseUrl;
}
