import java.util.Scanner;

public class Atv_For_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exiba os números de 10 a 1");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            sc.close();
        }
    }
}
