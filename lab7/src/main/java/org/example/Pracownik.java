package org.example;

public class Pracownik {
    private String imie;
    private String nazwisko;
    private double pensja;
    private double pensjaPoPodatkach;
    private double pensjaPoDodatkach;

    Pracownik(String imie, String nazwisko, double pensja){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
        pensjaPoPodatkach = pensja*0.83;
    }

    public double getPensja(){
        return pensja;
    }

    public double getPensjaPoPodatkach(){
        return pensjaPoPodatkach;
    }

    public void ustawPensjaPoPodatkach(double pensjaPoPodatkach){
        this.pensjaPoPodatkach=pensjaPoPodatkach;
    }

    public void ustawDodatek(double dodatek){
        pensjaPoDodatkach = pensjaPoPodatkach + dodatek;
    }

    public double getPensjaPoDodatkach() {
        return pensjaPoDodatkach;
    }

    @Override
    public String toString(){
        return "Imie: "+imie+" Nazwisko: "+nazwisko+" Pensja przed podatkami: "+pensja+" Pensja po podatkach i dodatkach: "+getPensjaPoDodatkach();
    }
}
