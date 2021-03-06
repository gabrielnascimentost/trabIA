package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

import static com.company.BuscaAEstrela.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pinguim> margemInicial = new ArrayList<>();
        ArrayList<Pinguim> margemFinal = new ArrayList<>();
        ArrayList<Pinguim> jangada = new ArrayList<>();

        Pinguim p1 = new Pinguim("red", true, 5);
        Pinguim f1 = new Pinguim("red", false, 2);

        Pinguim p2 = new Pinguim("green", true,4);
        Pinguim f2 = new Pinguim("green", false, 1);

        Pinguim p3 = new Pinguim("blue", true, 6);
        Pinguim f3 = new Pinguim("blue", false, 3);

        margemInicial.add(p1);
        margemInicial.add(f1);
        margemInicial.add(p2);
        margemInicial.add(f2);
        margemInicial.add(p3);
        margemInicial.add(f3);

        System.out.println("\n-------Inicio do Game---------------------\n");
        doBuscaAEstrela(margemInicial,margemFinal,jangada);
        System.out.println("\n-------Fim do Game------------------------\n");
    }
}
