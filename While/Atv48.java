package While;

import java.util.Scanner;

public class Atv48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (0 para sair): ");
            numero = sc.nextInt();

            if (numero != 0) {
                System.out.println((numero % 2 == 0) ? "Par" : "Ímpar");
            }
        } while (numero != 0);

        sc.close();
    }
}