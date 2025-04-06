package For;

public class Atv26 {
    public static void main(String[] args) {

        int base = 5;
        int meio = base / 2 + 1;

        // Parte superior do losango
        for (int i = 1; i <= meio; i++) {
            for (int j = i; j < meio; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        // Parte inferior do losango
        for (int i = meio - 1; i >= 1; i--) {
            for (int j = meio; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}