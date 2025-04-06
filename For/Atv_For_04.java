import java.util.Scanner;

public class Atv_For_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Exiba os números ímpares de 1 a 19");
        for (int i = 1; i <= 19; i+=2) {
            System.out.println(i);
            sc.close();
        }
    }
}
