package While;

import java.util.Scanner;

public class Atv39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = sc.nextInt();
            if (numero >= 0) {
                System.out.println("Positivo: " + numero);
            }
        } while (numero >= 0);
        sc.close();
    }
}