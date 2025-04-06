package While;
import java.util.Scanner;

public class Atv42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();

        int i = texto.length() - 1;
        do {
            System.out.print(texto.charAt(i));
            i--;
        } while (i >= 0);

        sc.close();
    }
}