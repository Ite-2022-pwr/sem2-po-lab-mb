package org.example;

public class KosztPociag implements ISrodekTransportu{
    @Override
    public double liczKoszt(double droga) {
        return droga/20;
    }
}
