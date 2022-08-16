public class Exercicio {
    public static void main(String[] args) {
        int x =2;
        int y = 3;

        System.out.println((x + y / 4)==0 || (9/y*2) ==1);
        System.out.println((x - y * 0)==0 && (y+2%3) ==3);
        System.out.println((3.1415 * y-3) > (y*x-7));




        int numero = 1;
        int soma = 0;

        while (numero < 5){
        soma = soma + numero;
            numero = numero + 1;
        }
        System.out.println(soma);

    }

}
