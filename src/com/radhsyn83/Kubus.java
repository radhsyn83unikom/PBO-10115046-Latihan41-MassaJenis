package com.radhsyn83;

public class Kubus {
    private int sisi;
    private int massa;

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }

    public int getMassa() {
        return massa;
    }

    public void setMassa(int massa) {
        this.massa = massa;
    }

    public int hitungVoulume(int parSisi) {
        return parSisi*parSisi*parSisi;
    }

    public int hitungMassaJenis(int parMassa, int volume) {
        return parMassa/volume;
    }
}
