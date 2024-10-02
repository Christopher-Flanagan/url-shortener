package org.project.urlshortener.service.event;

public interface EventIdGenerator<T> {
    T fetchId();
}
