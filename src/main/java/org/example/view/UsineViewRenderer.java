package org.example.view;

import org.example.IconCache;
import org.example.model.metadata.Metadonnees;
import org.example.model.simulation.Usine;

import javax.swing.*;
import java.awt.*;

public class UsineViewRenderer {
    private final IconCache iconCache;

    public UsineViewRenderer(IconCache iconCache) {

        this.iconCache = iconCache;
    }

    public void render(Metadonnees metadonnees, Usine usine, Graphics g) {
        String type = usine.getType();
        String stage = usine.getStage();
        ImageIcon imageIcon = iconCache.get(metadonnees, type, stage);
        g.drawImage(imageIcon.getImage(), usine.getX(), usine.getY(), imageIcon.getImageObserver());
    }

}
