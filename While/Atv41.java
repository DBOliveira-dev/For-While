package While;
import java.util.Scanner;

public class Atv41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String texto = sc.nextLine();

        int i = 0;
        do {
            System.out.println(texto.charAt(i));
            i++;
        } while (i < texto.length());

        sc.close();
    }
}
