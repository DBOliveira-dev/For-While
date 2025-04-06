package For;

public class Atv28 {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        double media = (double) soma / numeros.length;
        System.out.println("Média: " + media);
    }
}