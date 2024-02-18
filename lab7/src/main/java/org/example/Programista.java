package org.example;

public class Programista extends IT {
    Programista(String imie, String nazwisko, double pensja, int lataStazu){
        super(imie, nazwisko, pensja, lataStazu);
        this.ustawPensjaPoPodatkach(pensja*(1-(0.17*0.5)));
        this.ustawDodatek(premiaZaStaz(lataStazu)*(1-(0.17*0.5)));
    }

}
