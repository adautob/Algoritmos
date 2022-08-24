/*
Desenvolva um programa em Java para coletar um número e executar o cálculo abaixo.
Supondo que o número informado seja 38, o cálculo será:

X = ((38x37)/1) + ((37x36)/2) - ((36x35)/3) + ((35x34)/4) - ((34x33)/5) + ... - ((2x1)/37) = 1822,9994

Observe que o sinal se intercala, o primeiro soma, o segundo subtrai, e assim por diante até a menor expressão
possível

*/


public class Calculo {
    public static void main(String[] args) {
        double numero = 38d;
        double aux = numero;
        double x = 0d;

        for (int i = 0; i < aux-1; i++){
            if (i == 0) {
                x += (numero * (numero - 1)) / (i + 1);
                numero--;
            } else if (i % 2 == 0) {
                x -= (numero * (numero - 1)) / (i + 1);
                numero--;
            } else {
                x += (numero * (numero - 1)) / (i + 1);
                numero--;
            }

        }
        System.out.println(x);
    }
}
