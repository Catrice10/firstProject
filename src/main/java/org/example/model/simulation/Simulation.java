package org.example.model.simulation;

import java.util.List;

public class Simulation {
    private List<Usine> usine;
    private Chemins chemins;

    // getters and setters

    public List<Usine> getUsine() {
        return usine;
    }

    public void setUsine(List<Usine> usine) {
        this.usine = usine;
    }

    public Chemins getChemins() {
        return chemins;
    }

    public void setChemins(Chemins chemins) {
        this.chemins = chemins;
    }
}
