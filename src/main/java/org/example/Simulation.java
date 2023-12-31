package org.example;

import org.example.controller.Environnement;
import org.example.controller.SimulationController;
import org.example.controller.SimulationViewObserver;

import javax.swing.*;

public class Simulation {

	/**
	 * Cette classe repr�sente l'application dans son ensemble.
	 */
	public static void main(String[] args) {

		SimulationViewObserver usineViewRenderer = new SimulationViewObserver();
		SimulationController simulationController = new SimulationController(usineViewRenderer);
		Environnement environnement = new Environnement(usineViewRenderer);
		FenetrePrincipale fenetre = new FenetrePrincipale(usineViewRenderer);

		environnement.addPropertyChangeListener(fenetre);
		environnement.execute();

		while(true) {
			if(environnement.getState() == SwingWorker.StateValue.DONE) {
				System.out.println("DONE !!!!!!!!");
			}
		}
	}

}
