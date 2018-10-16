package Clases;

import java.util.Scanner;

public class Recursivo {
     private static Scanner sc;
     public static void main(String[] args) {
        int num;
        sc = new Scanner(System.in);
         System.out.print("Introduce un número para invertir: ");
        num = sc.nextInt();
        sc.close();
        System.out.printf("%nEl número %d invertido es el %s", num, invertirNumeroString(num));
        int numCifras = String.valueOf(num).length();
        System.out.printf("%nLa suma de los dígitos del número %d es %d                                                                               ", num, sumaDigitos(num));
     }
     private static int invertirNumero(int num, int pos){
        if(num<10){
            return num;
        } else {
            return num%10 * (int)Math.pow(10, pos) + invertirNumero(num/10, pos-1); 
        }
    }
    private static String invertirNumeroString(int num) {
        if(num<10){
            return String.valueOf(num);
        } else {
            return String.valueOf(num%10) + invertirNumeroString(num/10);
        }
    } 
     private static int sumaDigitos(int num){
		if(num==0){
			return 0;
		} else {
			return sumaDigitos(num/10) + num%10;
		}
	}
}
