package org.project.urlshortener.service.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Random;

@Slf4j
@Service
public class BasicRecordIdGeneratorService implements EventIdGenerator<Long> {

    private final Random idGenerator;

    public BasicRecordIdGeneratorService() {
        this.idGenerator = new Random();
    }

    @Override
    public Long fetchId() {
        return idGenerator.nextLong();
    }
}
