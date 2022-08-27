/*

Desenvolva um programa para receber uma série de números inteiros. O programa deverá receber N
números, porém deverá armazenar em memória somente os X últimos números inseridos, sendo X determinado por um
campo a ser informado pelo usuário na tela. Ao processar, o programa deverá exibir os X números
inseridos em ordem crescente e mostrar quais deles são números perfeitos.
Na matemática, um número perfeito é um número inteiro para o qual a soma de todos os seus divisores positivos
próprios (excluindo ele mesmo) é igual ao próprio número. Por exemplo o número 6 é perfeito, pois 1+2+3 é igual a 6.
Exemplo: Se o usuário determinar que serão inseridos 5 números, e informar os números: 5; 20; 30; 50; 100; 28 e 6, ao
processar, o resultado exibido em tela deverá ser o seguinte:
6: É perfeito
28: É perfeito
30: Não é perfeito
50: Não é perfeito
100: Não é perfeito
 */

import java.util.ArrayList;
import java.util.List;

public class NumeroPerfeito {
    public static void main(String[] args) {
        int x = 5;
        List<Integer> numeros = new ArrayList();
        numeros.add(5);
        numeros.add(20);
        numeros.add(30);
        numeros.add(50);
        numeros.add(100);
        numeros.add(28);
        numeros.add(6);

        numeros.stream()
                .filter(num -> numeros.indexOf(num)>numeros.size()-x-1)
                .sorted()
                .forEach(num -> {
                    if (ePerfeito(num))
                        System.out.println(num + ": É perfeito");
                    else
                        System.out.println(num + ": Não é perfeito");
                });
    }

    static boolean ePerfeito(int n){
        int soma = 0;
        for (int i = 1; i < n; i++){
            if (n % i == 0)
                soma += i;
        }
        if (soma == n) return true;
        else
            return false;
    }

}
