package com.company;

import java.util.ArrayList;

import static com.company.Regras.descarregaMargemFinal;
import static com.company.Regras.retornaPinguimCandidato;

public class BuscaAEstrela {

    static void doBuscaAEstrela(ArrayList<Pinguim> margemInicial, ArrayList<Pinguim> margemFinal, ArrayList<Pinguim> jangada){
        System.out.println("\n-------Inicio do Game---------------------\n");

        System.out.println("---------Pinguins na margem inicial---------");
        for(Pinguim obj: margemInicial){
            System.out.println(obj.toString());
        }
        System.out.println("--------------------------------------------");

        retornaPinguimCandidato(margemInicial,jangada);

        System.out.println("\nPinguins na margem inicial após escolha dos candidatos: ");

        for(Pinguim obj: margemInicial){
            System.out.println(obj.toString());
        }

        System.out.println("--------------------------------------------\n");
        System.out.println("Pinguins na jangada: ");

        for(Pinguim obj: jangada){
            System.out.println(obj.toString());
        }

        System.out.println("--------------------------------------------");

        descarregaMargemFinal(margemFinal,jangada);

        System.out.println("\n-------Descarregando o candidato permitido da jangada-------");
        System.out.println("Pinguins na margem final: ");

        for(Pinguim obj: margemFinal){
            System.out.println(obj.toString());
        }

        System.out.println("\n-------Retorna Jangada com o Pinguim-------");
        for(Pinguim obj: jangada){
            System.out.println(obj.toString());
        }

        margemInicial.add(jangada.get(0));
        jangada.clear();

        System.out.println("-------------------2º Iteracao-------------------------");

        retornaPinguimCandidato(margemInicial,jangada);

        System.out.println("\nPinguins na margem inicial após escolha dos candidatos: ");

        for(Pinguim obj: margemInicial){
            System.out.println(obj.toString());
        }

        System.out.println("--------------------------------------------\n");
        System.out.println("Pinguins na jangada: ");

        for(Pinguim obj: jangada){
            System.out.println(obj.toString());
        }

    }

}
