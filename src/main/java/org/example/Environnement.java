package org.example;

import javax.swing.SwingWorker;

public class Environnement extends SwingWorker<Object, String> {

	private UsineViewRenderer usineViewRenderer ;
	private boolean actif = true;
	private static final int DELAI = 100;
	
	@Override
	protected Object doInBackground() throws Exception {
		while(actif) {
			Thread.sleep(DELAI);

//			usineViewRenderer.render();
			/**
			 * C'est ici que vous aurez � faire la gestion de la notion de tour.
			 */
			firePropertyChange("TEST", null, "Ceci est un test");
		}
		return null;
	}

}