public class IntercalarStrings {
    public static void main(String[] args) {
        String conjuntoA = "R343rse$2we@";
        String conjuntoB = "Pa99999p7gaio10";
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
