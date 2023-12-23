package com.example.service

import com.example.client.SourceDataClient
import com.example.model.ProcessedData
import com.example.repository.SomeDataRepo
import org.springframework.stereotype.Service

@Service
class ProcessingService(
    private val repo: SomeDataRepo,
    private val client: SourceDataClient,
) {
    fun process(): ProcessedData {
        val src = client.get().orElseThrow { IllegalArgumentException("Source data not found") }
        val some = repo.get().orElseThrow { IllegalArgumentException("Some data not found") }
        return ProcessedData.builder()
            .someId(some.id)
            .sourceId(src.id)
            .build()
    }
}