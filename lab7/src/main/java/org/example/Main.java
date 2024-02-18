package org.example;

public class Main {
    public static void main(String[] args) {
        Ksiegowy ksieg1 = new Ksiegowy("Adam", "Wiśniewski", 6000);
        System.out.println(ksieg1);
        IT it1 = new IT("Agata", "Wróbel",7500, 3);
        System.out.println(it1);
        IT it2 = new IT("Paweł", "Kowalski",5000, 1);
        System.out.println(it2);
        Programista prog1 = new Programista("Ada", "Nowak",8000, 6);
        System.out.println(prog1);

        System.out.println("-------------------------------------");
        System.out.println("zysk dla dystansu 200, wynagrodzenie 10 i pociągu: "+ZyskTransport.liczZysk("Pociag",10,200));
        double a = ZyskTransport.liczZysk("Samolot",50,50);
        double b = ZyskTransport.liczZysk("Samolot",40,30);
        System.out.println("zlecenie 1 dystans 50, wynagrodzenie 50 i samolotu: "+a);
        System.out.println("zlecenie 2 dystans 30, wynagrodzenie 40 i samolotu: "+b);
        if (a > b){
            System.out.println("zlecenie 1 zyskowne bardziej");
        } else if (a == b) {
            System.out.println("zyskowne tak samo");
        } else{
            System.out.println("zlecenie 2 bardziej zyskowne");
        }
        double c = ZyskTransport.liczZysk("Samolot",45,350);
        double d = ZyskTransport.liczZysk("Pociag",45,350);
        System.out.println("zysk dla dystansu 350, wynagrodzenie 45 i samolotu: "+ c);
        System.out.println("zysk dla dystansu 350, wynagrodzenie 45 i pociągu: "+ d);
        if (c > d){
            System.out.println("samolot bardziej opłacalny");
        } else if (c == d) {
            System.out.println("zyskowne tak samo");
        } else{
            System.out.println("pociąg bardziej opłacalny");
        }
    }


}