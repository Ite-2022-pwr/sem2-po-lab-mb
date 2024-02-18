package org.example;

public class IT extends Pracownik{
    private int lataStazu;

    IT(String imie, String nazwisko, double pensja, int lataStazu){
        super(imie, nazwisko, pensja);
        this.lataStazu = lataStazu;
        super.ustawDodatek(premiaZaStaz(lataStazu)*0.83);
    }

    double premiaZaStaz(int lataStazu){
        if (lataStazu < 2){
            return 500;
        } else if (lataStazu>=2&&lataStazu<5) {
            return 2000;
        } else if (lataStazu>=5) {
            return 5000;
        } else {
            return 0;
        }
    }

}
