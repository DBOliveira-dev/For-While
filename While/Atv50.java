package While;

import java.util.Scanner;

public class Atv50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final String SENHA_CORRETA = "1234";
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = sc.nextLine();
        } while (!senha.equals(SENHA_CORRETA));

        System.out.println("Acesso concedido!");
        sc.close();
    }
}