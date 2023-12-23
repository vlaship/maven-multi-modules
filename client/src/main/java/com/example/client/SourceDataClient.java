package com.example.client;

import com.example.model.SourceData;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class SourceDataClient {

    private final RestClient restClient;

    public Optional<SourceData> get() {
        var body = restClient.get()
                .uri("http://localhost:8080/source")
                .retrieve()
                .body(SourceData.class);
        return Optional.ofNullable(body);
    }

}
