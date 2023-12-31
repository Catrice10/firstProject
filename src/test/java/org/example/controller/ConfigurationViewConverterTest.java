package org.example.controller;

import org.example.model.ConfigurationView;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationViewConverterTest {

    public static final String SUCCESSFULL_CONFIGURATION_JSON = "successfullConfiguration.json";
    private final ConfigurationViewConverter configurationViewConverter = new ConfigurationViewConverter();

    @Test
    void loadViewFromJson() {

        ConfigurationView configurationView = configurationViewConverter.convertToView(new File(SUCCESSFULL_CONFIGURATION_JSON));

        assertThat()

    }
}