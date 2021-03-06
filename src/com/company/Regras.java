package com.company;

import java.util.ArrayList;

public class Regras {

    static boolean verificaRegraJangada(ArrayList<Pinguim> jangada) {   //filho não pode ficar na jangada com pai de outra cor
        Pinguim integrante1 = jangada.get(0); //primeiro pinguim da jangada
        Pinguim integrante2 = jangada.get(1); //segundo pinguim da jangada

        if (integrante1.getCor().equals(integrante2.getCor())) // pai e filho da mesma cor
            return true;
        else if (!integrante1.isEhPai() && !integrante2.isEhPai()) //filhos de cores diferentes
            return true;

        return false;
    }

    static boolean verificaMargem(ArrayList<Pinguim> margem) {   //filho não pode ficar sozinho na margem sem seu pai

        if (margem.size() == 1 && margem.get(0).isEhPai()) {
            return true;
        } else if (margem.size() == 1 && !margem.get(0).isEhPai()) {
            return false;
        } else {
            for (int i = 0; i < margem.size(); i++) {
                for (int j = i + 1; j < margem.size(); j++) {
                    if (margem.get(i).getCor().equals(margem.get(j).getCor())) //pai e filho da mesma cor estão na mesma margem
                        return false;
                    if (!margem.get(i).isEhPai() && !margem.get(i).getCor().equals(margem.get(j).getCor())) //filho na margem sem o pai da mesma cor
                        return false;
                }

            }
            return true;
        }
    }

    static boolean verificaMargemFinal(ArrayList<Pinguim> margemFinal) {
        if (margemFinal.size() == 6)
            return true;
        return false;
    }

    static void descarregaMargemFinal(ArrayList<Pinguim> margemFinal, ArrayList<Pinguim> jangada) {
        Pinguim aux1 = jangada.get(0); //
        Pinguim aux2 = jangada.get(1); //

        margemFinal.add(aux1);
        jangada.remove(aux1);

        if (!verificaMargem(margemFinal) && verificaMargem(margemFinal)) {
            jangada.add(aux1);
            margemFinal.remove(aux1);
        }

        margemFinal.add(aux2);
        jangada.remove(aux2);

        if (!verificaMargem(margemFinal) && verificaMargem(margemFinal)) {
            jangada.add(aux2);
            margemFinal.remove(aux2);
        }

        if (jangada.size() == 0){
            jangada.add(aux2);
        }
    }

    static int calculaFuncaoPinguinsSelecionados(ArrayList<Pinguim> margemInicial, ArrayList<Pinguim> jangada) { //verifica todos os pinguins da margem e calcula o f final
        int g = 0;
        ArrayList<Pinguim> margemInicialAux = (ArrayList<Pinguim>) margemInicial.clone();
        margemInicialAux.remove(jangada.get(0));
        margemInicialAux.remove(jangada.get(1));

        for (Pinguim aux : margemInicialAux) {
            g = g + aux.getCustoReal();
        }
        return g + margemInicialAux.size();
    }


    static void retornaPinguimCandidato(ArrayList<Pinguim> margemInicial, ArrayList<Pinguim> jangada) {  //verifica qual pinguim ira ser selecionado

        int[][] candidados = new int[margemInicial.size()][margemInicial.size()];

        int menorFuncao = Integer.MAX_VALUE;
        int auxI = 0;
        int auxJ = 0;

        if (jangada.size() == 0) {

            for (int i = 0; i < margemInicial.size(); i++) {
                for (int j = i + 1; j < margemInicial.size(); j++) {
                    jangada.add(margemInicial.get(i));
                    jangada.add(margemInicial.get(j));
                    if (verificaRegraJangada(jangada)) {
                        candidados[i][j] = calculaFuncaoPinguinsSelecionados(margemInicial, jangada);
                    }
                    jangada.clear();
                }
            }

            for (int i = 0; i < margemInicial.size(); i++) {
                for (int j = i + 1; j < margemInicial.size(); j++) {
                    if (candidados[i][j] != 0 && candidados[i][j] < menorFuncao) {
                        menorFuncao = candidados[i][j];
                        auxI = i;
                        auxJ = j;
                    }
                }
            }

            jangada.add(margemInicial.get(auxI));
            jangada.add(margemInicial.get(auxJ));

            margemInicial.remove(auxI);

            if (margemInicial.size() == 1) {
                margemInicial.remove(auxJ);
            } else if (margemInicial.size() == 0) {
                return;
            } else {
                margemInicial.remove(auxJ - 1);
            }

        } else {
            for (int j = 0; j < margemInicial.size(); j++) {
                jangada.add(margemInicial.get(j));
                if (verificaRegraJangada(jangada)) {
                    candidados[1][j] = calculaFuncaoPinguinsSelecionados(margemInicial, jangada);
                }
                jangada.remove(margemInicial.get(j));
            }

            for (int j = 1; j < margemInicial.size(); j++) {
                if (candidados[1][j] != 0 && candidados[1][j] < menorFuncao) {
                    menorFuncao = candidados[1][j];
                    auxJ = j;
                }
            }

            jangada.add(margemInicial.get(auxJ));

       //     if (margemInicial.size() == 1) {
                margemInicial.remove(auxJ);
        //    } else if (margemInicial.size() == 0) {
          //      return;
          //  } else {
            //    margemInicial.remove(auxJ - 1);
           // }
        }
    }
}
