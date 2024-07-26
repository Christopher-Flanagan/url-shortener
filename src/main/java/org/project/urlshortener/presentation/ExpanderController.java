package org.project.urlshortener.presentation;

import lombok.RequiredArgsConstructor;
import org.project.urlshortener.service.url.UrlShortenService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/expand")
@RequiredArgsConstructor
public class ExpanderController {

    private final UrlShortenService service;

    @PostMapping
    public ResponseEntity<String> expandUrl(@RequestBody String url) {
        return ResponseEntity.ok(null);
    }
}
