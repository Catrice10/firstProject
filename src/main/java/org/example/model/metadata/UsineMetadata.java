package org.example.model.metadata;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class UsineMetadata {
    private String type;
    private Icones icones;
    private List<Entree> entree;
    private Sortie sortie;
    @JsonProperty("interval-production")
    private int intervalProduction;
    private int quantite;
    private int capacite;

    // getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Icones getIcones() {
        return icones;
    }

    public void setIcones(Icones icones) {
        this.icones = icones;
    }

    public List<Entree> getEntree() {
        return entree;
    }

    public void setEntree(List<Entree> entree) {
        this.entree = entree;
    }

    public Sortie getSortie() {
        return sortie;
    }

    public void setSortie(Sortie sortie) {
        this.sortie = sortie;
    }

    public int getIntervalProduction() {
        return intervalProduction;
    }

    public void setIntervalProduction(int intervalProduction) {
        this.intervalProduction = intervalProduction;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }
}
