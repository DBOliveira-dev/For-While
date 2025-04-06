package Ativ_For;

import java.util.Scanner;

public class Atv_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Exiba os números de 1 a 100");
        int end = 100;

        for (int i = 1; i <= end; i++) {

            if (((i % 5) == 0) && ((i % 7) == 0))
            {
                System.out.println("fizzbuzz");
            } else if ((i % 5) == 0)
            {
                System.out.println("fizz");
            } else if ((i % 7) == 0)
            {
                System.out.println("buzz");
            } else {
                System.out.println(i);
            }
        }

    }
}
