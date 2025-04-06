import java.util.Scanner;

public class Atv_For_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exiba os números pares de 2 a 20");
        for (int i = 2; i <= 20; i+=2) {
            System.out.println(i);
            sc.close();
        }
    }
}
