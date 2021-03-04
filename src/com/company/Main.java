package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pinguim> margemDireita = new ArrayList<>();
        ArrayList<Pinguim> margemEsquerda = new ArrayList<>();
        ArrayList<Pinguim> jangada = new ArrayList<>();
        ArrayList<Heuristica> listHeuristica = new ArrayList<>();
        ArrayList<CustoReal> listCustoReal = new ArrayList<>();

        Pinguim p1 = new Pinguim("red", true);
        Pinguim f1 = new Pinguim("red", false);

        Pinguim p2 = new Pinguim("green", true);
        Pinguim f2 = new Pinguim("green", false);

        Pinguim p3 = new Pinguim("blue", true);
        Pinguim f3 = new Pinguim("blue", false);

        margemDireita.add(p1);
        margemDireita.add(f1);
        margemDireita.add(p2);
        margemDireita.add(f2);
        margemDireita.add(p3);
        margemDireita.add(f3);

        listCustoReal.add(new CustoReal(p1,5));
        listCustoReal.add(new CustoReal(f1,2));

        listCustoReal.add(new CustoReal(p2,4));
        listCustoReal.add(new CustoReal(f2,1));

        listCustoReal.add(new CustoReal(p3,6));
        listCustoReal.add(new CustoReal(f3,3));
    }
}
