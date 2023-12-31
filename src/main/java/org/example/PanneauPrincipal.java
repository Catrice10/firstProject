package org.example;

import org.example.model.SimulationView;
import org.example.model.simulation.Chemin;
import org.example.model.simulation.Simulation;
import org.example.model.simulation.Usine;
import org.example.view.CheminViewRenderer;
import org.example.view.UsineViewRenderer;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class PanneauPrincipal extends JPanel {
    private SimulationView simulationView;

    private final IconCache iconCache = new IconCache();

    private final Map<Integer, Usine> usineCache = new HashMap<>();
    private final UsineViewRenderer usineViewRenderer = new UsineViewRenderer(iconCache);
    private final CheminViewRenderer cheminViewRenderer = new CheminViewRenderer();

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        if (simulationView != null) {
            Simulation simulation = simulationView.getSimulation();
            for(Chemin chemin : simulation.getChemins().getChemin()) {
                cheminViewRenderer.render(chemin, g, usineCache);
            }
            for(Usine usine : simulation.getUsine()) {
				usineViewRenderer.render(simulationView.getMetadonnees(), usine, g);
			}


        }

	}

    public void setSimulationView(SimulationView simulationView) {
        if(usineCache.isEmpty()) {
            simulationView.getSimulation().getUsine().forEach(usine -> usineCache.put(usine.getId(), usine));
        }
        this.simulationView = simulationView;
    }
}