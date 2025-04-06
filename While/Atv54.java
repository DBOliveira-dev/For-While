package While;

import java.util.Scanner;

public class Atv54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("Raiz quadrada: " + Math.sqrt(numero));
            }
        } while (numero >= 0);

        sc.close();
    }
}