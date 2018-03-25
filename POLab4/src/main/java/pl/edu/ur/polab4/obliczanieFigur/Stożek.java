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
public class Stożek {
    
    private double pr;
    private double H;
    
        public Stożek(double pr, double H){
         this.H = H;   
         this.pr = pr;
        }
    
        public void obj(){
         double pi = 3.14;
         double obj = (1.0/3.0)*pi*H*(pr*pr);
         System.out.println("Objętość stożka wynosi: " + obj);
        }
}
