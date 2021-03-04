package com.company;

public class CustoReal {

    private Pinguim elemento;
    private int custoReal;

    public CustoReal(Pinguim elemento, int custoReal) {
        this.elemento = elemento;
        this.custoReal = custoReal;
    }

    public Pinguim getElemento() {
        return elemento;
    }

    public void setElemento(Pinguim elemento) {
        this.elemento = elemento;
    }

    public int getCustoReal() {
        return custoReal;
    }

    public void setCustoReal(int custoReal) {
        this.custoReal = custoReal;
    }
}
