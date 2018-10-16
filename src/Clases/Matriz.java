package Clases;

import java.util.Scanner;
public class Matriz {
    private Scanner teclado;
    private int[][] mat;
    
    public void cargar() {
        teclado=new Scanner(System.in);
        System.out.print("Filas De Matriz:");
        int filas=teclado.nextInt();
        System.out.print("Columnas De Matriz:");
        int columnas=teclado.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingresa Los Numeros:");
                mat[f][c]=teclado.nextInt();
            }
        }
    }
    
    public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
    
    
    public static void main(String[] ar) {
        Matriz ma=new Matriz();
        ma.cargar();
        ma.imprimir();
    }   
}