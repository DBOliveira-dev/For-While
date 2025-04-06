package ListaFor;

import java.util.Scanner;

public class Atv_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String str = sc.nextLine();

        String reversedStr = new StringBuilder(str).reverse().toString();
        System.out.println(reversedStr);
    }
}
