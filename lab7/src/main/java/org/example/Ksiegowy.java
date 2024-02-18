package org.example;

public class Ksiegowy extends Pracownik {
    Ksiegowy(String imie, String nazwisko, double pensja){
        super(imie, nazwisko, pensja);
        this.ustawDodatek((pensja*0.1)*0.83);
    }
}
