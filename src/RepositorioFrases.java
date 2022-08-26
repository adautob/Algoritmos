import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepositorioFrases {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista = new ArrayList();
        String pesquisar = "";
        List<String> resultadoPesquisa = new ArrayList();


        while (true) {
            System.out.println("Digite uma frase para adicionar no repositório: ");
            lista.add(scanner.nextLine());
            if (!continuar()) break;
        }


        System.out.println("Agora digite uma palavra a ser pesquisada na lista: ");
        pesquisar = scanner.next();

        String finalPesquisar = pesquisar;
        resultadoPesquisa = lista.stream().filter(p -> p.contains(finalPesquisar)).collect(Collectors.toList());

        System.out.println("Frases encontradas no repositório: ");
        System.out.println("-----------------------------------");

        resultadoPesquisa.forEach(r -> System.out.println("==> "+r));
        System.out.println("-----------------------------------");
    }

    static boolean continuar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja digitar outra frase? (S/N) ");

        if (sc.next().toUpperCase().charAt(0) == 'N') return false;
        else return true;

    }
}
