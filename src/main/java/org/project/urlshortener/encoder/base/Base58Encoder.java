package org.project.urlshortener.encoder.base;


import lombok.extern.slf4j.Slf4j;
import org.project.urlshortener.encoder.Encoder;
import org.project.urlshortener.service.event.EventIdGenerator;

@Slf4j
public class Base58Encoder implements Encoder {

    private static final String BASE58_ALPHABET = "123456789ABCDEFGHJKLMNPQRSTUVWXYZabcdefghijkmnopqrstuvwxyz";

    private final EventIdGenerator<Integer> idGeneratorService;

    public Base58Encoder(EventIdGenerator<Integer> idGeneratorService) {
        this.idGeneratorService = idGeneratorService;
    }


    @Override
    public String encode(String input) {
        var sequenceId = idGeneratorService.fetchId();
        var encodedSequence = encode(sequenceId);

        return "";
    }

    private String encode(long input) {
        StringBuilder encoded = new StringBuilder();
        while (input > 0) {
            int remainder = (int) (input % 58);
            input /= 58;
            encoded.insert(0, BASE58_ALPHABET.charAt(remainder));
        }
        return encoded.toString();
    }

    
}
