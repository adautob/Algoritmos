
class Exercicio{
    public static void main(String[] args) {
        String str= "cat and*dogs-are-animals";

        String[] array = str.split(" |\\*|-");

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
            System.out.println(fraseCompleta);


    }


}