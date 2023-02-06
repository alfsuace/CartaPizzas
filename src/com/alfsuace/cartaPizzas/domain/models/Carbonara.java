package com.alfsuace.cartaPizzas.domain.models;

public class Carbonara extends Pizza{
    private boolean quesoCabra;
    private boolean quesoAzul;

    public boolean isQuesoAzul() {
        return quesoAzul;
    }

    public void setQuesoAzul(boolean quesoAzul) {
        this.quesoAzul = quesoAzul;
    }


    public boolean isQuesoCabra() {
        return quesoCabra;
    }

    public void setQuesoCabra(boolean quesoCabra) {
        this.quesoCabra = quesoCabra;
    }




}
