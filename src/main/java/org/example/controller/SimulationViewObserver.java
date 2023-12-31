package org.example.controller;

import org.example.model.SimulationView;
import org.example.model.simulation.Usine;

import java.util.List;

public class SimulationViewObserver {

    private SimulationView configurationView;
    private boolean hasBeenUpdated;

    public SimulationView getConfigurationView() {
        return configurationView;
    }

    public void updateView(SimulationView configurationView) {
        this.configurationView = configurationView;
        this.hasBeenUpdated = true;
    }

    public boolean hasBeenUpdated() {
        return hasBeenUpdated;
    }

    public void hasBeenUpdated(boolean hasBeenUpdated) {
        this.hasBeenUpdated = hasBeenUpdated;
    }

    public void moveAllUsine() {
        configurationView.getSimulation().getUsine().forEach(usine -> {
            usine.setX(usine.getX()+1);
        });

        hasBeenUpdated = true;
    }
}
