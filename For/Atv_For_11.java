import java.util.Scanner;

public class Atv_For_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Exiba os quadrados dos números de 1 a 10 ");

        for (int i = 1; i <= 10; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é " + quadrado);
        }
    }
}

