package While;

import java.util.Scanner;

public class Atv47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int i = 2;
        boolean primo = true;

        if (numero <= 1) primo = false;

        do {
            if (numero % i == 0) {
                primo = false;
            }
            i++;
        } while (i <= Math.sqrt(numero) && primo);

        System.out.println(numero + (primo ? " é primo" : " não é primo"));
        sc.close();
    }
}