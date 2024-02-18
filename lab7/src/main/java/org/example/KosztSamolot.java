package org.example;

public class KosztSamolot implements ISrodekTransportu{

    @Override
    public double liczKoszt(double droga) {
        return (droga*droga)/100;
    }
}
