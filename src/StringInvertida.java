import java.util.Scanner;

public class StringInvertida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Digite uma palavra ou frase: ");
        str = sc.nextLine();
        System.out.println("Palavra ou frase invertida: ");
        StringBuilder sb = new StringBuilder(str);
        System.out.println(sb.reverse());
    }
}

