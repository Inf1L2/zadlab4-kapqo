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
public class Kula {
    
    private double pr;
    
        public Kula(double pr){
         this.pr = pr;   
        }
    
        public void obj(){
         double pi = 3.14;   
         double obj = (4/3)*pi*pr;
         System.out.println("Objętość kuli wynosi: " + obj);
        }
        
}
