package org.example;

import javax.swing.*;

public class Simulation {

	/**
	 * Cette classe repr�sente l'application dans son ensemble.
	 */
	public static void main(String[] args) {
		Environnement environnement = new Environnement();
		FenetrePrincipale fenetre = new FenetrePrincipale();

		environnement.addPropertyChangeListener(fenetre);
		environnement.execute();

		while(true) {
			if(environnement.getState() == SwingWorker.StateValue.DONE) {
				System.out.println("DONE !!!!!!!!");
			}
		}
	}

}
