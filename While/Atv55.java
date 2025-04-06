package While;

public class Atv55 {
    public static void main(String[] args) {
        int linha = 1;

        do {
            int coluna = 1;
            do {
                System.out.print(coluna + " ");
                coluna++;
            } while (coluna <= linha);
            System.out.println();
            linha++;
        } while (linha <= 5);
    }
}