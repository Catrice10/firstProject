package org.example;

import org.example.controller.SimulationViewObserver;
import org.example.model.SimulationView;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;

public class FenetrePrincipale extends JFrame implements PropertyChangeListener {

	private static final long serialVersionUID = 1L;
	private static final String TITRE_FENETRE = "Laboratoire 1 : LOG121 - Simulation";
	private static final Dimension DIMENSION = new Dimension(700, 700);
	private final PanneauPrincipal panneauPrincipal;

	public FenetrePrincipale(SimulationViewObserver simulationViewObserver) {
		panneauPrincipal = new PanneauPrincipal();
		MenuFenetre menuFenetre = new MenuFenetre(simulationViewObserver);
		add(panneauPrincipal);
		add(menuFenetre, BorderLayout.NORTH);

		JButton start = new JButton("start");
		start.addActionListener(e -> {
			Thread thread = new Thread(() -> {
				for (int i = 0; i < 500; i++) {
					try {
						Thread.sleep(25);
					} catch (InterruptedException ex) {
						throw new RuntimeException(ex);
					}
					simulationViewObserver.moveAllUsine();
				}
			});
			thread.start();

		});
		add(start, BorderLayout.SOUTH);

		// Faire en sorte que le X de la fen�tre ferme la fen�tre
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle(TITRE_FENETRE);
		setSize(DIMENSION);
		// Rendre la fen�tre visible
		setVisible(true);
		// Mettre la fen�tre au centre de l'�cran
		setLocationRelativeTo(null);
		// Emp�cher la redimension de la fen�tre
		setResizable(false);
	}

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("VIEW")) {
			SimulationView simulationView = (SimulationView) evt.getNewValue();
			panneauPrincipal.setSimulationView(simulationView);
			panneauPrincipal.repaint();
		}
	}
}
