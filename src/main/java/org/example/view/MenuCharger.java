package org.example.view;

import org.example.controller.ConfigurationViewConverter;
import org.example.controller.SimulationViewObserver;
import org.example.model.SimulationView;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.io.File;

public class MenuCharger extends JMenuItem {
    private static final String MENU_FICHIER_CHARGER = "Charger";

    private ConfigurationViewConverter configurationViewConverter = new ConfigurationViewConverter();
    private SimulationViewObserver usineViewRenderer;

    public MenuCharger(SimulationViewObserver usineViewRenderer) {
        super(MENU_FICHIER_CHARGER);
        this.usineViewRenderer = usineViewRenderer;
        addActionListener((ActionEvent e) -> loadJsonFile());
    }

    private void loadJsonFile() {
        JFileChooser fileChooser = new JFileChooser("C:\\Users\\rayan\\Documents\\javaLearning\\hassan\\src\\main\\resources");
        fileChooser.setDialogTitle("S�lectionnez un fichier de configuration");
        fileChooser.setAcceptAllFileFilterUsed(false);
        // Cr�er un filtre
        FileNameExtensionFilter filtre = new FileNameExtensionFilter(".json", "json");
        fileChooser.addChoosableFileFilter(filtre);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            SimulationView configurationView = configurationViewConverter.convertToView(selectedFile);
            usineViewRenderer.updateView(configurationView);
            System.out.println(selectedFile.getAbsolutePath());
        }
    }

}
