/*
 * 
 * Escribe un programa que pida 10 números por teclado y que luego muestre los números introducidos 
 * junto con las palabras "máximo" y "mínimo" al lado del máximo y del mínimo respecticamente.
 * 
 * @author: Adrián Perogil Fernández
 * 
 */
import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numero = new int[10];
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;
        int i;
        for (i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + " a introducir: ");
            numero[i] = sc.nextInt();
            if (numero[i] < minimo) {
                minimo = numero[i];
            }
            if (numero[i] > maximo) {
                maximo = numero[i];
            }
        }
        for (i = 0; i < 10; i++) {
            System.out.print(numero[i]);
            if (numero[i] == maximo) {
                System.out.print(" máximo");
            }
            if (numero[i] == minimo) {
                System.out.print(" mínimo");
            }
            System.out.println();
        }
        sc.close();
    }
}
