package Clases;

import java.util.Scanner;
 
public class Suma
{
    public static void main(String[] ARGS)
    {
        Scanner obtener = new Scanner(System.in);
        int cantidadNumeros,total,i,nuevoNumero;
 
        System.out.print("Ingresa la cantidad de numeros a sumar: ");
        cantidadNumeros = obtener.nextInt();
 
        total = 0;
 
        for(i = 1; i <= cantidadNumeros; i++)
        {
            System.out.print("Ingresa el numero (" + i + ") : ");
            nuevoNumero = obtener.nextInt();
 
            total = total + nuevoNumero;
        }
        
        
        
        System.out.println("La suma total de los numeros es : " + total);
    }
}