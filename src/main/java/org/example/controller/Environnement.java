package org.example.controller;

import org.example.model.SimulationView;

import javax.swing.SwingWorker;

public class Environnement extends SwingWorker<Object, String> {

	private final SimulationViewObserver usineViewRenderer;
	private boolean actif = true;
	private static final int DELAI = 100;

	public Environnement(SimulationViewObserver usineViewRenderer) {
		this.usineViewRenderer = usineViewRenderer;
	}

	@Override
	protected Object doInBackground() throws Exception {
		while(actif) {
			Thread.sleep(DELAI);

			if(usineViewRenderer.hasBeenUpdated()) {
				SimulationView configurationView = usineViewRenderer.getConfigurationView();
				firePropertyChange("VIEW", null, configurationView);
				usineViewRenderer.hasBeenUpdated(false);
			}
		}
		return null;
	}

}