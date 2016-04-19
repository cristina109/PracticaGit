/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

/**
 *
 * @author dam109
 */
    public class Circulo extends Figura{
   private float  radio;
   
    Circulo(float radio,Colores color){
        this.color=color;
        this.radio=radio;
    }

    @Override
    public String toString() {
        return "Circulo{" + "radio=" + radio + ", color= "+color+'}';
    }
  
        
    @Override
      public double area(){
          return (float) (Math.PI*Math.pow(radio, 2));
       
      }
      
      @Override
      public double perimetro(){
          return (float) (2*Math.PI*radio);
      }
   

}

