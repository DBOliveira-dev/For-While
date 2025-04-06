package While;

public class Atv52 {
    public static void main(String[] args) {
        int numero = 2, contador = 0;

        do {
            boolean primo = true;
            int i = 2;

            do {
                if (numero % i == 0) {
                    primo = false;
                }
                i++;
            } while (i < numero && primo);

            if (primo) {
                System.out.println(numero);
                contador++;
            }
            numero++;
        } while (contador < 10);
    }
}