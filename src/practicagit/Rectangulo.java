
package practicagit;


public class Rectangulo extends Figura{
     private float base, altura;
     
   public Rectangulo(float base, float altura , Colores color) {   
       this.color=color;
       this.altura=altura;
       this.base=base;
   }

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura +", color="+color+ '}';
    }
    
    @Override
      public double area(){
          return (base*altura);
       
      }
      
      @Override
      public double perimetro(){
          return 2*(base+altura);
      }
   
    
    

}
