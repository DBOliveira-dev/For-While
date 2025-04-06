package While;

import java.util.Random;

public class Atv49 {
    public static void main(String[] args) {
        Random rand = new Random();
        String senha = "";
        int i = 0;

        do {
            char c = (char) (rand.nextInt(26) + 'a');
            senha += c;
            i++;
        } while (i < 6);

        System.out.println("Senha gerada: " + senha);
    }
}