package com.company;

public class Pinguim {
    private String cor;
    private boolean ehPai;

    public Pinguim(String cor, boolean ehPai) {
        this.cor = cor;
        this.ehPai = ehPai;
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
}
