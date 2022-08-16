public class SumOfDigits {
    public static void main(String[] args) {
        int numero = 381543, resto, soma = 0;

        while (numero!=0){
            resto = numero % 10;
            soma = soma + resto;
            numero = numero / 10;
        }
        System.out.println("Sum of Digits: "+soma);
    }
}
