package com.example.repository;

import com.example.model.SomeData;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class SomeDataRepo {

    public Optional<SomeData> get() {
        return Optional.of(new SomeData("some-id"));
    }

}
