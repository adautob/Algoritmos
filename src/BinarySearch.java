import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println("teste");

        int numeros[] = {10, 23, 56, 3, 9, 0, -20, -34, 98};

        Arrays.sort(numeros); // ordena o array

        int idx = Arrays.binarySearch(numeros, 10); // faz a busca binária

        // imprime o index do numero encontrado
        System.out.println(idx);

        // imprime a posicao 5 do array
        System.out.println(numeros[5]);
    }

}
