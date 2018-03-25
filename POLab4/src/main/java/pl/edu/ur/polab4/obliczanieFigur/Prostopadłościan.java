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
public class Prostopadłościan {
    
    private double bok1;
    private double bok2;
    private double H;
    
        public Prostopadłościan(double bok1, double bok2, double H){
        this.bok1 = bok1;
        this.bok2 = bok2;
        this.H = H;
        }
    
        public void obj(){
            double obj = bok1*bok2*H;
            System.out.println("Objętość prostopadłościanu wynosi: " + obj);
        }
    
}
