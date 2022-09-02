import java.util.List;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Exercicio{
    public static void main(String[] args) {
        String str= "cat and*dogs-are-animals";

        //String[] array = str.split(" |\\*|-");
        List<String> list = Arrays.asList(str.split(" |\\*|-"));
/*
        String fraseCompleta = "";

        for (int i = 0; i < array.length; i++){
            String primeiraLetra = array[i].substring(0, 1).toUpperCase();
            String demaisLetras = array[i].substring(1).toLowerCase();
            String palavraConcatenada = primeiraLetra + demaisLetras;

            array[i] = palavraConcatenada;

            if ( i == 0)
                fraseCompleta = array[i].toLowerCase();
            else
                fraseCompleta += array[i];

        }
*/
        String b = list.stream()
                .map(s1  -> s1.substring(0, 1).toUpperCase().concat(s1.substring(1).toLowerCase()))
                .collect(Collectors.joining());
        b = b.substring(0, 1).toLowerCase()+b.substring(1);
        System.out.println(b);

            //System.out.println(fraseCompleta);

    }


}