package com.company;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Queue;

import static com.company.Regras.*;

public class Main {

    public static void main(String[] args) {
        ArrayList<Pinguim> margemInicial = new ArrayList<>();
        ArrayList<Pinguim> margemFinal = new ArrayList<>();
        ArrayList<Pinguim> jangada = new ArrayList<>();
        Queue<Pinguim> filaPinguins = new PriorityQueue<>();

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

        jangada.add(p3);
        jangada.add(f3);

        descarregaMargemFinal(margemFinal, jangada);

        for(Pinguim obj: margemFinal){
            System.out.println("Pinguins na margem esquerda: ");
            System.out.println(obj.toString());
        }

        for(Pinguim obj: jangada){
            System.out.println("Pinguins na jangada: ");
            System.out.println(obj.toString());
        }

    }
}
