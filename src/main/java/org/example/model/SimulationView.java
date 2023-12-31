package org.example.model;

import org.example.model.simulation.Simulation;
import org.example.model.metadata.Metadonnees;

public class SimulationView {
    private Metadonnees metadonnees;
    private Simulation simulation;

    // getters and setters

    public Metadonnees getMetadonnees() {
        return metadonnees;
    }

    public void setMetadonnees(Metadonnees metadonnees) {
        this.metadonnees = metadonnees;
    }

    public Simulation getSimulation() {
        return simulation;
    }

    public void setSimulation(Simulation simulation) {
        this.simulation = simulation;
    }
}

