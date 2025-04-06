package While;

import java.util.Scanner;

public class Atv40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contador = 0;
        do {
            System.out.print("Digite um número (0 para parar): ");
            numero = sc.nextInt();
            if (numero != 0) contador++;
        } while (numero != 0);
        System.out.println("Quantidade digitada: " + contador);
        sc.close();
    }
}