package org.example.view;

import org.example.model.simulation.Chemin;
import org.example.model.simulation.Usine;

import java.awt.*;
import java.util.Map;

public class CheminViewRenderer {

    private static final int VERTICAL_SHIFT = 15;
    private static final int HORIZONTAL_SHIFT = 16;

    public void render(Chemin chemin, Graphics g, Map<Integer, Usine> usineCache) {

        Usine startingUsine = usineCache.get(chemin.getDe());
        Usine endingingUsine = usineCache.get(chemin.getVers());

        g.drawLine(startingUsine.getX() + HORIZONTAL_SHIFT,
                startingUsine.getY() + VERTICAL_SHIFT,
                endingingUsine.getX() + HORIZONTAL_SHIFT,
                endingingUsine.getY() + VERTICAL_SHIFT);
    }
}
