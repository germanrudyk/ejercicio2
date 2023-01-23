/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import Entidad.Circunferencia;
import Service.CircunferenciaServicio;
import java.util.Scanner;

/**
 *
 * @author German
 */
public class Menu {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private final CircunferenciaServicio cs;

    private final Circunferencia c = new Circunferencia();

    public Menu() {
        this.cs = new CircunferenciaServicio();
    }

    public void menu() {

        int opc;

        try {

            do {

                System.out.println("\nCIRCUNFERENCIA");
                System.out.println("1 - Ingresar radio");
                System.out.println("2 - Calcular area");
                System.out.println("3 - Calcular perimetro");

                opc = leer.nextInt();

                switch (opc) {
                    case 1:
                        cs.crearCircunferencia(c);
                        break;
                    case 2:
                        System.out.println("El area es: " + cs.area(c) + "\n");
                        break;
                    case 3:
                        System.out.println("El perimetro es: " + cs.perimetro(c) + "\n");
                        break;
                    case 4:
                        break;
                    default:
                        throw new Exception("Opcion incorrecta\n");
                }

            } while (opc != 4);

            System.out.println("Adios");

        } catch (Exception e) {

            System.out.println("Opcion incorrecta\n");

        }

    }
}
