package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pinguim> margemInicial = new ArrayList<>();
        ArrayList<Pinguim> margemFinal = new ArrayList<>();
        ArrayList<Pinguim> jangada = new ArrayList<>();
        ArrayList<Heuristica> listHeuristica = new ArrayList<>();
        ArrayList<CustoReal> listCustoReal = new ArrayList<>();

        Pinguim p1 = new Pinguim("red", true);
        Pinguim f1 = new Pinguim("red", false);

        Pinguim p2 = new Pinguim("green", true);
        Pinguim f2 = new Pinguim("green", false);

        Pinguim p3 = new Pinguim("blue", true);
        Pinguim f3 = new Pinguim("blue", false);

        margemInicial.add(p1);
        margemInicial.add(f1);
        margemInicial.add(p2);
        margemInicial.add(f2);
        margemInicial.add(p3);
        margemInicial.add(f3);

        listCustoReal.add(new CustoReal(p1,5));
        listCustoReal.add(new CustoReal(f1,2));

        listCustoReal.add(new CustoReal(p2,4));
        listCustoReal.add(new CustoReal(f2,1));

        listCustoReal.add(new CustoReal(p3,6));
        listCustoReal.add(new CustoReal(f3,3));
    }
}
