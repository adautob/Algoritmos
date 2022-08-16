public class ReverseNumber {
    public static void main(String[] args) {
        int reverso = 0;

        int numero = 1958445;
        while (numero != 0){
            int resto = numero % 10;
            reverso = (reverso * 10) + resto;
            numero = numero / 10;
        }
        System.out.println("Reverse Number: "+reverso);
    }
}
