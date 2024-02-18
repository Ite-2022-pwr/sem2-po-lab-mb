package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class Dziekanat {
    public static void main(String[] args) throws Exception {
        System.out.println("Obiekty stworzone osobno:");

        // tworzenie obiektów osobno
        Student studentBlad = new Student(); // konstruktor domyślny
        studentBlad.show();
        Student studentAdam = new Student("Adam Bąk", 20, 2025); // konstruktor z parametrami
        studentAdam.show();
        Student studentAdamCopy = new Student(studentAdam); // konstruktor kopiujący
        studentAdamCopy.show();

        System.out.println("-----------------------------------------");
        // uzycie tablicy
        Student[] tab = new Student[3];
        //for (Student student : tab) {
        //    student.show();
        //}

        Arrays.fill(tab, new Student()); // uzupełnienie tablicy konstruktorami domyślnymi

        System.out.println("\nTablica:");
        for (Student student : tab) {
            student.show();
        }
        System.out.println("-----------------------------------------");
        // uzycie kolekcji
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student()); // konstruktor domyślny
        list.add(new Student("Adam Pol", 120, 2024)); // konstruktor z parametrami
        list.add(new Student(studentAdamCopy)); // konstruktor kopiujący

        System.out.println("\nKolekcja:");
        for (Student student : list) {
            student.show();
        }

        System.out.println("Liczba stworzonych obiektów: " + Student.getCount());

    }
}

class Student {
    private String name;
    private int ects;
    private StudentDateOfGraduation details;

    private static int countStatic_ = 0;
    //private int countNonStatic_ = 0;
    //private static int idStatic_ = 0;
    private int idNonStatic_ = 0;

    //konstruktor
    public Student() {
        this.name = "NO STUDENT";
        this.ects = -1;
        this.details = new StudentDateOfGraduation(0);

        countStatic_++;
        //countNonStatic_++;
        //idStatic_++;
        idNonStatic_=countStatic_;
        System.out.println("konstruktor domyślny użyty");
    }

    public Student(String name, int ects, int year) {
        this.name = name;
        this.ects = ects;
        this.details = new StudentDateOfGraduation(year);

        countStatic_++;
        //countNonStatic_++;
        //idStatic_++;
        idNonStatic_=countStatic_;
        System.out.println("konstruktor z parametrami użyty");
    }

    public Student(Student student) {
        this.name = student.name;
        this.ects= student.ects;
        this.details = new StudentDateOfGraduation(student.details.year);

        countStatic_++;
        // countNonStatic_++;
//        idStatic_++;
        idNonStatic_=countStatic_;
        System.out.println("konstruktor kopiujący użyty");
    }

    public void show() {
        System.out.print("Name: " + this.name + ", Ects: " + this.ects);
        this.details.show();
        System.out.println(", ID: " + this.idNonStatic_ );
    }

    public static int getCount() {
        return countStatic_;
    }

    private class StudentDateOfGraduation {

        private int year;

        public StudentDateOfGraduation(int year) {
            this.year = year;
        }

        public void show() {
            System.out.print(", Year: " + this.year);
        }
    }


}