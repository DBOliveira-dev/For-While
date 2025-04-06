package While;

import java.util.Scanner;

public class Atv31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número (negativo para sair): ");
            numero = sc.nextInt();
        } while (numero >= 0);
        System.out.println("Número negativo informado. Fim!");
        sc.close();
    }
}