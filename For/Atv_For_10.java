import java.util.Scanner;

public class Atv_For_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Exiba os primeiros 10 múltiplos de 5. ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * 5);


            sc.close();
        }
    }
}

