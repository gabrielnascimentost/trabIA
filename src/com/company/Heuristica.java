package com.company;

public class Heuristica {

    private Pinguim elemento;
    private int heuristica;

    public Heuristica(Pinguim elemento, int heuristica) {
        this.elemento = elemento;
        this.heuristica = heuristica;
    }

    public Pinguim getElemento() {
        return elemento;
    }

    public void setElemento(Pinguim elemento) {
        this.elemento = elemento;
    }

    public int getHeuristica() {
        return heuristica;
    }

    public void setHeuristica(int heuristica) {
        this.heuristica = heuristica;
    }
}
