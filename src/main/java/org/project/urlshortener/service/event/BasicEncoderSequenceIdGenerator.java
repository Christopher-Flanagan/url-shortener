package org.project.urlshortener.service.event;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class BasicEncoderSequenceIdGenerator implements EventIdGenerator<Integer> {

    private final Random idGenerator;

    public BasicEncoderSequenceIdGenerator() {
        this.idGenerator = new Random();
    }

    @Override
    public Integer fetchId() {
        return idGenerator.nextInt();
    }
}
