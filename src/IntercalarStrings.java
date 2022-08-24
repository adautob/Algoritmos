public class IntercalarStrings {
    public static void main(String[] args) {
        String conjuntoA = "R343rse$qwe@";
        String conjuntoB = "Papagaio10";
        StringBuilder resultado = new StringBuilder();
        StringBuilder sb = new StringBuilder(conjuntoB);
        String reversoB = new String(sb.reverse());

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


        System.out.println(resultado);



    }
}
