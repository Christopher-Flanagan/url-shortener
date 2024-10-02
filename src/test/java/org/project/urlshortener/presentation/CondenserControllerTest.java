package org.project.urlshortener.presentation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.project.urlshortener.service.url.UrlShortenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@WebMvcTest
public class CondenserControllerTest {

    @MockBean
    private UrlShortenService service;
    @Autowired
    private CondenserController controller;


    @Test
    @DisplayName("Controller test")
    public void shortenUrlTest() {
        when(service.shortenUrl(any())).thenReturn("Short");
        var result = controller.shortenUrl("");
        assertEquals("Short", result.getBody());
    }
}
