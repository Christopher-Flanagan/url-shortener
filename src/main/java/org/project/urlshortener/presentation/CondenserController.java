package org.project.urlshortener.presentation;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.project.urlshortener.service.url.UrlShortenService;

@RestController
@RequestMapping(path = "/condense")
@RequiredArgsConstructor
public class CondenserController {

    private final UrlShortenService service;

    @PostMapping
    public ResponseEntity<String> shortenUrl(@RequestBody String url) {
        var response = service.shortenUrl(url);
        return ResponseEntity.ok(response);
    }
}
