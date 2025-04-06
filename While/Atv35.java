package While;

import java.util.Scanner;

public class Atv35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, i = 1;
        System.out.print("Digite um número para ver a tabuada: ");
        numero = sc.nextInt();
        do {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        } while (i <= 10);
        sc.close();
    }
}