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
public class Sześcian {
    
    private double bok;
    
        public Sześcian(double bok){
        this.bok = bok;
        }
    
        public void obj(){
            double obj = bok*bok*bok;
            System.out.println("Objętość szcześcianu wynosi: " + obj);
        }
}
