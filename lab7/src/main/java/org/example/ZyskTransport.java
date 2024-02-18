package org.example;

import java.util.Objects;

public class ZyskTransport {

    public static double liczZysk(String srodekTransportu, double wynagrodzenie, double droga){
        if (Objects.equals(srodekTransportu, "Samolot")){
            KosztSamolot koszt = new KosztSamolot();
            return wynagrodzenie - koszt.liczKoszt(droga);
        } else if (Objects.equals(srodekTransportu, "Pociag")) {
            KosztPociag koszt = new KosztPociag();
            return wynagrodzenie - koszt.liczKoszt(droga);
        }
        return wynagrodzenie;
    }

}
