class Exercicio{
    public static void main(String[] args) {
        String str= "cat and*dogs-are-animals";

        String[] array = str.split(" |\\*|-");
        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        for (int i = 0; i < array.length; i++){
            String primeiraLetra = array[i].substring(0, 1).toUpperCase();
            String demaisLetras = array[i].substring(1).toLowerCase();
            String palavraConcatenada = primeiraLetra + demaisLetras;

            array[i] = palavraConcatenada;
            System.out.println(array[i]);
        }


    }


}