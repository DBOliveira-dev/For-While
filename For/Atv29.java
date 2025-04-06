package For;

public class Atv29 {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 5, 6};
        for (int i = 0; i < numeros.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[j] < numeros[minIndex]) {
                    minIndex = j;
                }
            }
            // Troca de posição
            int temp = numeros[i];
            numeros[i] = numeros[minIndex];
            numeros[minIndex] = temp;
        }
        System.out.println("Vetor ordenado:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}