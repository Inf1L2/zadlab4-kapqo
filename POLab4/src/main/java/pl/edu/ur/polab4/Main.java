package pl.edu.ur.polab4;
import pl.edu.ur.polab4.obliczanieFigur.*;
import pl.edu.ur.polab4.wprowadzDane.*;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO zad 4, 5
        int zadanie;
        Scanner sc = new Scanner(System.in);
        System.out.println("Wybierz zadanie (4,5): ");
        zadanie = sc.nextInt();
        
        switch(zadanie){
            case 4:
        //zad4
        Koło kolo1 = new Koło(5);
        System.out.println("Koło: ");
        kolo1.obwod();
        kolo1.pole();
        
        Kwadrat kwadrat1 = new Kwadrat(3);
        System.out.println("\nKwadrat: ");
        kwadrat1.obwod();
        kwadrat1.pole();
        
        Prostokąt prostokat1 = new Prostokąt(2, 4);
        System.out.println("\nProstokąt: ");
        prostokat1.obwod();
        prostokat1.pole();
        
        Sześcian szescian1 = new Sześcian(8);
        System.out.println("\nSześcian: ");
        szescian1.obj();
        
        
        Prostopadłościan prostopadloscian1 = new Prostopadłościan(5,9,3);
        System.out.println("\nProstopadłóścian: ");
        prostopadloscian1.obj();
        
        Kula kula1 = new Kula(7);
        System.out.println("\nKula: ");
        kula1.obj();
        
        Stożek stozek1 = new Stożek(13,5);
        System.out.println("\nStożek: ");
        stozek1.obj();
        
        break;
        
        case 5:
         Tablica.menu();
        break;
        
        default:
        System.out.println("Nie ma takiego zadania.");
        break;
        }
    }
}