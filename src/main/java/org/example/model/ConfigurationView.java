package org.example.model;

import java.util.List;

public class ConfigurationView {
    private Metadonnees metadonnees;
    private Simulation simulation;

    // getters and setters

    public Metadonnees getMetadonnees() {
        return metadonnees;
    }

    public void setMetadonnees(Metadonnees metadonnees) {
        this.metadonnees = metadonnees;
    }

    public Simulation getSimulation() {
        return simulation;
    }

    public void setSimulation(Simulation simulation) {
        this.simulation = simulation;
    }
}

class Metadonnees {
    private List<Usine> usine;

    // getter and setter

    public List<Usine> getUsine() {
        return usine;
    }

    public void setUsine(List<Usine> usine) {
        this.usine = usine;
    }
}

class Usine {
    private Icones icones;
    private String entree;
    private String sortie;
    private int intervalProduction;

    // getters and setters

    public Icones getIcones() {
        return icones;
    }

    public void setIcones(Icones icones) {
        this.icones = icones;
    }

    public String getEntree() {
        return entree;
    }

    public void setEntree(String entree) {
        this.entree = entree;
    }

    public String getSortie() {
        return sortie;
    }

    public void setSortie(String sortie) {
        this.sortie = sortie;
    }

    public int getIntervalProduction() {
        return intervalProduction;
    }

    public void setIntervalProduction(int intervalProduction) {
        this.intervalProduction = intervalProduction;
    }
}

class Icones {
    private List<String> icone;

    // getter and setter

    public List<String> getIcone() {
        return icone;
    }

    public void setIcone(List<String> icone) {
        this.icone = icone;
    }
}

class Simulation {
    private List<String> usine;
    private Chemins chemins;

    // getters and setters

    public List<String> getUsine() {
        return usine;
    }

    public void setUsine(List<String> usine) {
        this.usine = usine;
    }

    public Chemins getChemins() {
        return chemins;
    }

    public void setChemins(Chemins chemins) {
        this.chemins = chemins;
    }
}

class Chemins {
    private List<String> chemin;

    // getter and setter

    public List<String> getChemin() {
        return chemin;
    }

    public void setChemin(List<String> chemin) {
        this.chemin = chemin;
    }
}
