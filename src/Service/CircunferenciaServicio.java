/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area: PI * radio ^ 2).
e) Método perimetro(): para calcular el perímetro (Perimetro: 2 * PI * radio).
 */
package Service;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class CircunferenciaServicio {
    
    Scanner leer = new Scanner(System.in);
    
    public void crearCircunferencia(Circunferencia c1){
        
        System.out.print("Ingrese radio: ");
        c1.setRadio(leer.nextDouble());
    }
    
    public double area(Circunferencia circ){
        
        return Math.PI * Math.pow(circ.getRadio(), 2);
    }
    
    public double perimetro(Circunferencia circ){
        
        return 2 * Math.PI * circ.getRadio();
    }
    
}
