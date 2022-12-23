import java.util.Scanner;

public class RomanNumbers {
    public static void main(String[] args) {
        // Criamos um objeto Scanner para ler a entrada do usuário
        Scanner input = new Scanner(System.in);

        // Pedimos para o usuário digitar um número inteiro
        System.out.print("Digite um número inteiro: ");
        int number = input.nextInt();

        // Convertemos o número para Romanos
        String roman = "";
        while (number >= 1000) {
            roman += "M";
            number -= 1000;
        }
        while (number >= 900) {
            roman += "CM";
            number -= 900;
        }
        while (number >= 500) {
            roman += "D";
            number -= 500;
        }
        while (number >= 400) {
            roman += "CD";
            number -= 400;
        }
        while (number >= 100) {
            roman += "C";
            number -= 100;
        }
        while (number >= 90) {
            roman += "XC";
            number -= 90;
        }
        while (number >= 50) {
            roman += "L";
            number -= 50;
        }
        while (number >= 40) {
            roman += "XL";
            number -= 40;
        }
        while (number >= 10) {
            roman += "X";
            number -= 10;
        }
        while (number >= 9) {
            roman += "IX";
            number -= 9;
        }
        while (number >= 5) {
            roman += "V";
            number -= 5;
        }
        while (number >= 4) {
            roman += "IV";
            number -= 4;
        }
        while (number >= 1) {
            roman += "I";
            number -= 1;
        }

        // Imprimimos o número em Romanos
        System.out.println("O número em Romanos é: " + roman);
    }
}
