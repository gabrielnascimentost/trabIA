package com.company;

import java.util.ArrayList;

public class Regras {

    static boolean verificaRegraJangada(ArrayList<Pinguim> jangada){   //filho não pode ficar na jangada com pai de outra cor
        Pinguim integrante1 = jangada.get(0); //primeiro pinguim da jangada
        Pinguim integrante2 = jangada.get(1); //segundo pinguim da jangada

        if(integrante1.getCor().equals(integrante2.getCor())) // pai e filho da mesma coisa
            return true;
        else if(!integrante1.isEhPai() && !integrante2.isEhPai()) //filhos de cores diferentes
            return true;

        return false;
    }

    static boolean verificaMargem(ArrayList<Pinguim> margem){   //filho não pode ficar sozinho na margem sem seu pai

        for(int i = 0; i < margem.size(); i++){
            for(int j = 1; j <margem.size(); j++){
                if(margem.get(i).getCor().equals(margem.get(j).getCor())) //pai e filho da mesma cor estão na mesma margem
                    return true;
                else if(margem.get(i).isEhPai() && !margem.get(j).getCor().equals(margem.get(i).getCor())) //somente o pai esta na margem
                    return true;
            }
        }
        return false;
    }

}
