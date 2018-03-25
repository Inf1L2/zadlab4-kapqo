/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.polab4.obliczanieFigur;

/**
 *
 * @author Kowali
 */
public class Kwadrat {
    
    private double bok;
    
        public Kwadrat(double bok){
           this.bok = bok; 
        }
        
        public void obwod(){  
        double obwod = 4*bok;
        System.out.println("Obwód kwadratu wynosi : " + obwod);
    }
        
        public void pole(){   
        double pole = bok*bok;
        System.out.println("Pole kwadratu wynosi : " + pole);
        }
}
