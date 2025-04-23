import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Programa que solicita un numero y una potencia, para resolverlo y mostrar el resultado
 */
public class Potencia {
    /**
     * Metodo principal
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int res;
        String mens;

        mens ="Calculare la potencia de los números que introduzcas";
        res=Potencia (teclado,mens);
        mens ="El resultado de la operación es: "+res;
        texto (mens);
    }

    /**
     * Metodo que solicita los numeros, resuelve y devuelve el resultado
     * @param teclado
     * @param mensaje
     * @return
     */
    public static int Potencia (Scanner teclado, String mensaje) {
        int base;
        int potencia;
        int res;
        String mens;

        System.out.println(mensaje);
        mens ="Introduce el número base (el que está elevado)";
        base=leerEntero(teclado, mens);
        mens ="Ahora la potencia";
        potencia=leerEntero(teclado,mens);

        if (potencia==0) {
            res=1;
        } else {
            res=base;
            potencia--;
            int j;
            for (j=potencia;j>0; j--) {
                res=res*base;
            }
        }
        return res;
    }

    /**
     * Metodo para controlar que el usuario solo introduzca numeros
     * @param teclado
     * @param mensaje
     * @return
     */
    public static int leerEntero(Scanner teclado, String mensaje) {
        int num=0;

        do {
            try {
                System.out.println(mensaje);
                num= teclado.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Solo números");
                teclado.next();
            }
        } while (num<0);
        return num;
    }

    /**
     * metodoo para imprimir
     * @param mensaje
     */
    public static void texto (String mensaje) {
        System.out.println(mensaje);
    }
}
