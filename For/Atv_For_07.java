import java.util.Scanner;

public class Atv_For_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calcule a soma dos números ímpares de 1 a 100");
        int soma = 0;

        for (int i = 1; i <= 100; i+=1) {
            soma += i;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

