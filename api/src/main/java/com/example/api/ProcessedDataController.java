package com.example.api;

import com.example.model.ProcessedData;
import com.example.service.ProcessingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

@RestController
@RequiredArgsConstructor
public class ProcessedDataController {

    private final ProcessingService processingService;

    @GetExchange("/processing")
    public ResponseEntity<ProcessedData> get() {
        return ResponseEntity.ok(processingService.process());
    }

}
