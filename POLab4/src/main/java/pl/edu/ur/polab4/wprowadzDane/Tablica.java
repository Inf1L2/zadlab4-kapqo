/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.wprowadzDane;

import java.util.Scanner;

/**
 *
 * @author Kowali
 */
public class Tablica {

                Scanner sc = new Scanner(System.in);
                int indeks;
                Student[] tab;
                
                public Tablica(){
                this.indeks = 0;
                this.tab = new Student[100];
    }
                
                public void obiekty(){
                for(int i=0; i<tab.length; i++) {
                    tab[i] = new Student ("","",0,"",0);}
                }        
                
    
                public void wprowadzDane(){
                    
                }
        public void menu(){
                    Scanner sca = new Scanner(System.in);
                    int pod;
                    System.out.println("Który podpunkt zadania 5 chcesz wykonać: \n1 - Wprowadzenie danych studenta pod wybrany indeks tablicy\n2 - Usunięcie danych studenta spod wybranego indeksu\n3 - Wyswietlenie studenta o danym indeksie\n4 - Wyswietlenie wszystkich obiektow\n5 - Wyswietlenie zakresu studentow w podanym zakresie");
                    pod = sc.nextInt();
            switch(pod){
            case 1:
                    System.out.println("Podaj indeks tablicy do wprowadzenia/edycji danych: ");
                    int nr = sca.nextInt();
                    System.out.println("Podaj imie: ");
                    String imie = sca.next();
                    System.out.println("Podaj nazwisko: ");
                    String nazwisko = sca.next();
                    System.out.println("Podaj numer indeksu: ");
                    int indeks = sca.nextInt();
                    System.out.println("Podaj nazwe specjalnosci: ");
                    String spec = sca.next();
                    System.out.println("Podaj rok studiow: ");
                    int rok = sca.nextInt();
                    tab[nr] = new Student(imie ,nazwisko ,indeks ,spec ,rok);
                break;
            case 2:
                    System.out.print("Podaj indeks tablicy do usuniecia: ");
                    nr = sca.nextInt();
                    tab[nr] = new Student("","",0,"",0);
                break;
            case 3:
                    System.out.print("Podaj index tablicy do wyswietlenia: ");
                    nr = sca.nextInt();
                    System.out.println("Student o numerze: "+nr+"");
                    System.out.println("Imie: "+tab[nr].imie);
                    System.out.println("Nazwisko: "+tab[nr].nazwisko);
                    System.out.println("Numer indeksu: "+tab[nr].indeks);
                    System.out.println("Nazwa specjalizacji: "+tab[nr].spec);
                    System.out.println("Rok studiow: "+tab[nr].rok);
                break;
            case 4:
                    for(int i=0;i<100;i++){
                    System.out.println("\nStudent o numerze: "+i+"");
                    System.out.println("Imie: "+tab[i].imie);
                    System.out.println("Nazwisko: "+tab[i].nazwisko);
                    System.out.println("Numer indeksu: "+tab[i].indeks);
                    System.out.println("Nazwa specjalizacji: "+tab[i].spec);
                    System.out.println("Rok studiow: "+tab[i].rok);
                    }
                
                break;
            case 5:
                    System.out.print("Podaj indeks poczatkowy: ");
                    int min = sca.nextInt();
                    System.out.print("Podaj indeks koncowy: ");
                    int max = sca.nextInt();

        for (int i = min;i<=max;i++){
            System.out.println("\nStudent o numerze: "+i+"");
            System.out.println("Imie: "+tab[i].imie);
            System.out.println("Nazwisko: "+tab[i].nazwisko);
            System.out.println("Numer indeksu: "+tab[i].indeks);
            System.out.println("Nazwa specjalizacji: "+tab[i].spec);
            System.out.println("Rok studiow: "+tab[i].rok);
        }
                break;
            default:
                System.out.println("Nie ma takiego podpunktu.");
                break;
            
            }         
        
        }
}   