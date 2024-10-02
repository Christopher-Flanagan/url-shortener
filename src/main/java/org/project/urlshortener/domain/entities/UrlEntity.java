package org.project.urlshortener.domain.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.project.urlshortener.domain.Identifiable;

import java.time.ZonedDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UrlEntity implements Identifiable {

    private long id;
    private String url;
    private String condensedUrl;
    private ZonedDateTime createTimestamp;
    private ZonedDateTime insertTimestamp;


    @Override
    public String getUniqueId() {
        return String.format("%d", id);
    }
}
