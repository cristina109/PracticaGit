
package practicagit;

public class ApFiguras {
    
    public static void main(String [] args){
        Figura lista[]=new Figura [3];
//        lista[0]=new Circulo ((float)9.8,"Coral");
//        lista[1]=new Rectangulo((float)6.5,(float)3.4,"Naranja");
//        lista[2]=new Triangulo((float)5.5,(float)4.5,"Verde");
//        
//    Triangulo triangulo=new Triangulo((float)5.5,(float)4.5,"Verde");
//    Rectangulo rectangulo=new Rectangulo((float)6.5,(float)3.4,"Naranja");
//    Circulo circulo=new Circulo((float)9.8,"Coral");
        
        for(int i=0;i<lista.length;i++){
            System.out.println("Clases: "+lista[i].getClass().getName());
            System.out.println("Area: "+lista[i].area());
        }
        
//    triangulo.mostrarDatos();
//    rectangulo.mostrarDatos();
//    
//    if(triangulo instanceof Triangulo){
//        System.out.println("El objeto es de la clase triángulo");
//    }
//    if(rectangulo instanceof Rectangulo){
//        System.out.println("El objeto es de la clase rectángulo");
//    }
//    if(circulo instanceof Circulo){
//        System.out.println("El objeto es de la clase Círculo");
//    }
//    
    
    }
}
