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
public class Prostokąt {
          
        private double bok1;
        private double bok2;
    
        public Prostokąt(double bok1, double bok2){
           this.bok1 = bok1; 
           this.bok2 = bok2;
        }
        
        public void obwod(){  
        double obwod = 2*bok1+2*bok2;
        System.out.println("Obwód prostokątu wynosi : " + obwod);
    }
        
        public void pole(){   
        double pole = bok1*bok2;
        System.out.println("Pole prostokątu wynosi : " + pole);
        }
}
