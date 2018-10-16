package Clases;

import java.util.Scanner;

public class PedirNumerosRecursivoSuma {

    Scanner lector = new Scanner(System.in);
    int arreglo[];
    int a;
    int total = 0;

    public void inicio() {

        System.out.print("Cantidad de numeros: ");
        a = lector.nextInt();
        arreglo = new int[a];
        agregar(0);
    }

    public void agregar(int i) {

        if (i < arreglo.length) {
            System.out.print("Numero[" + (i + 1) + "] ");
            arreglo[i] = lector.nextInt();
            agregar(i + 1);
        }
        nointercambio(0);
    }

    public void nointercambio(int j) {

        if (j < arreglo.length) {
            System.out.print(arreglo[j] + " ");
            nointercambio(j + 1);
        }
        int X = arreglo.length-1;
        System.out.println("\nSe Intercambiaron a: ");
        impresion(X);
    }
    public void impresion(int l) {
        if (l >= 0) {
            System.out.print(arreglo[l]+" ");
            total = total + arreglo[l];
            impresion(l - 1);
        }else{
            System.out.println();
            System.out.println("Suma: "+total);
            salir();
        }
    }
    public void salir(){
        System.exit(0);
    }
    public static void main(String[] args) {
        PedirNumerosRecursivoSuma In = new PedirNumerosRecursivoSuma();
        In.inicio();
    }
}
