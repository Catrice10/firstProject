package org.example.controller;

import org.example.model.SimulationView;
import org.example.model.metadata.Metadonnees;
import org.example.model.metadata.UsineMetadata;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ConfigurationViewConverterTest {

    public static final String SUCCESSFULL_CONFIGURATION_JSON = "classpath://successfullConfiguration.json";
    private final ConfigurationViewConverter configurationViewConverter = new ConfigurationViewConverter();

    @Test
    void loadViewFromJson() throws URISyntaxException {
        URL resource = getClass().getClassLoader().getResource("successfullConfiguration.json");

        SimulationView configurationView = configurationViewConverter.convertToView(new File(resource.toURI()));

        Metadonnees metadonnees = configurationView.getMetadonnees();
        assertThat(metadonnees).isNotNull();
        List<UsineMetadata> usines = metadonnees.getUsine();
        assertThat(usines).hasSize(5);

        assertFirstUsine(usines);

    }

    private void assertFirstUsine(List<UsineMetadata> usines) {
        UsineMetadata usine = usines.get(0);
        assertThat(usine.getSortie()).isNotNull();
        assertThat(usine.getEntree()).isNull();
        assertThat(usine.getIntervalProduction()).isEqualTo(100);
    }
}