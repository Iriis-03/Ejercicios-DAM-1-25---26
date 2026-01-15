package org.example.TEMA5POO;

public class Televisor {

    private int canal;
    private int volumen;

    public Televisor(){
        canal = 1;
        volumen = 5;
    }

    public Televisor(int valorCanal, int volumen){

        canal = valorCanal;
        this.volumen = volumen;

    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int valorCanal){
        this.canal = valorCanal;
    }

    public int getVolumen(){
        return volumen;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public void subirCanal(){
        if (canal > 100){
            canal = 1;
        } else {
            canal++;
        }
    }

    public void bajarCanal(){
        if (canal < 1){
            canal = 100;
        } else {
            canal--;
        }
    }

}

