package org.project.urlshortener.service.url;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.project.urlshortener.encoder.Encoder;
import org.project.urlshortener.domain.Identifiable;
import org.project.urlshortener.domain.entities.UrlEntity;
import org.project.urlshortener.service.event.EventIdGenerator;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class UrlShortenServiceImpl implements UrlShortenService {

    private final EventIdGenerator<Long> idGenerator;
    private final Encoder condenser;

    @Override
    @Transactional
    public String shortenUrl(String url) {
        log.info("Start - TODO ");

        log.debug("Condensing {}", url);
        var condensedUrl = condenser.encode(url);

        log.debug("Generating Id for URL {}", url);
        var uniqueId = idGenerator.fetchId();

        Identifiable record = UrlEntity.builder()
                .id(uniqueId)
                .url(url)
                .condensedUrl(condensedUrl)
                .build();

        log.debug("Saving record with unique Id {}", record.getUniqueId());

        log.info("Completed - TODO");

        return condensedUrl;
    }
}
