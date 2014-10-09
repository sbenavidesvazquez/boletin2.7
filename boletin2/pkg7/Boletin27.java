//Renta que se debe pagar por un prestamo.
package boletin2.pkg7;

import java.util.Scanner;


public class Boletin27 {

    
    public static void main(String[] args) {
    float nominal,interesAnual,numeroAnos;
    
    System.out.print("nominal = ");
    Scanner dato= new Scanner(System.in);
    nominal=dato.nextFloat();
    
    System.out.print("interes anual = ");
    Scanner dato2= new Scanner(System.in);
    interesAnual=dato2.nextFloat();
    
    System.out.print("tiempo en años = ");
    Scanner dato3= new Scanner(System.in);
    numeroAnos=dato3.nextFloat();
    
    System.out.print("renda mensual = "+ ((nominal*(interesAnual/100)*(numeroAnos*12))/100));
    }
    
}
