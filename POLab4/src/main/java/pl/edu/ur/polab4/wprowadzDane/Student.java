/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

/**
 *
 * @author Kowali
 */
public class Student {

        public String imie;
        public String nazwisko;
        public int indeks;
        public String spec;
        public int rok;

    public Student(String imie, String nazwisko, int indeks, String spec, int rok) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.spec = spec;
        this.rok = rok;
    }

    public Student(String imie, String nazwisko, int indeks, String spec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.spec = spec;
    }

    public Student(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
        
        public void pokazDane() {
            System.out.println("Imie: " + this.imie);
            System.out.println("Nazwisko: " + this.nazwisko);
            System.out.println("Numer indeksu: " + this.indeks);
            System.out.println("Nazwa specjalnosci: "+ this.spec);
            System.out.println("Rok studiow: "+ this.rok);
        }
        
    }
