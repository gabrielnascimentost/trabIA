package com.company;

public class Pinguim {
    private String cor;
    private boolean ehPai;
    private int custoReal;

    public Pinguim(String cor, boolean ehPai, int custoReal) {
        this.cor = cor;
        this.ehPai = ehPai;
        this.custoReal = custoReal;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isEhPai() {
        return ehPai;
    }

    public void setEhPai(boolean ehPai) {
        this.ehPai = ehPai;
    }

    public int getCustoReal() {
        return custoReal;
    }

    public void setCustoReal(int custoReal) {
        this.custoReal = custoReal;
    }
}
