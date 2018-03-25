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
public class Koło {
    
    private double pr;
        public Koło(double pr){
         this.pr = pr;   
        }
    
    public void obwod(){
     double pi = 3.14;   
     double obwod = 2*pi*pr;
     System.out.println("Obwód koła wynosi : " + obwod);
    }
    
    public void pole(){
     double pi = 3.14;   
     double pole = 2*pi*(pr*pr);
     System.out.println("Pole koła wynosi : " + pole);
    }
    
}
