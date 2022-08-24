
/*      Desenvolve um programa para receber 2 conjuntos de caracteres e ao processar, deverá intercalar
        o conjunto A com o inverso do conjunto B, mostrar a quantidade de números e outros caracteres, porém o conjunto A
        não necessariamente terá a mesma quantidade de caracteres do conjunto B

        Exemplo 1:
        Conjunto A: ABCDE*
        Conjunto B: 123$
        Resultado: A$B3C2D1E*
        Quantidade de números: 3
        Quantidade de outros caracteres: 7

        Exemplo 2:
        Conjunto A: A*B8C
        Conjunto B: 12#3456&
        Resultado: A&*6B584C3#21
        Quantidade de números: 7
        Quantidade de outros caracteres: 6

*/

public class IntercalarStrings {
    public static void main(String[] args) {
        String conjuntoA = "A*B8C";
        String conjuntoB = "12#3456&";
        StringBuilder resultado = new StringBuilder();
        StringBuilder sb = new StringBuilder(conjuntoB);
        String reversoB = new String(sb.reverse());
        int qtdeNumeros = 0;
        int qtdeOutrosCaracteres = 0;

        int maior = 0;

        if (conjuntoA.length() >= conjuntoB.length())
            maior = conjuntoA.length();
        else
            maior = conjuntoB.length();


        for (int i = 0; i < maior; i++){
            if (i < conjuntoA.length())
                resultado.append(conjuntoA.charAt(i));
            if (i < reversoB.length())
                resultado.append(reversoB.charAt(i));

        }

        for (int i = 0; i < resultado.length(); i++){
            if (Character.isDigit(resultado.charAt(i)))
                qtdeNumeros++;
            else
                qtdeOutrosCaracteres++;

        }


        System.out.println("Resultado intercalado: "+ resultado);
        System.out.println("Quantidade de números: "+ qtdeNumeros);
        System.out.println("Quantidade de outros caracteres: "+ qtdeOutrosCaracteres);



    }
}
