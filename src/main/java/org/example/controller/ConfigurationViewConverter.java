package org.example.controller;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.model.SimulationView;

import java.io.File;
import java.io.IOException;

public class ConfigurationViewConverter {
    private final ObjectMapper objectMapper = new ObjectMapper();


    public ConfigurationViewConverter() {
        objectMapper.enable(JsonParser.Feature.ALLOW_COMMENTS);
    }


    public SimulationView convertToView(File selectedFilePath) {
        try {
            return objectMapper.readValue(selectedFilePath, SimulationView.class);
        } catch (DatabindException databindException) {
            throw new RuntimeException("Le json ne corresponds pas", databindException);
        } catch (IOException e) {
            throw new RuntimeException("je ne sais pas ce quil sest passé", e);
        }
    }
}
