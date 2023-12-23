package com.example.model;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ProcessedData {

    String sourceId;
    String someId;

}
