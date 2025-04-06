package While;

public class Atv51 {
    public static void main(String[] args) {
        int num = 2, contador = 0;

        do {
            int soma = 1;
            int i = 2;

            while (i <= num / 2) {
                if (num % i == 0) soma += i;
                i++;
            }

            if (soma == num) {
                System.out.println(num);
                contador++;
            }
            num++;
        } while (contador < 10);
    }
}
