import java.util.Arrays;

public class VarArgMetodos {
    public static void methodOne(int... x){ // recebe os  argumentos como se fosse um array
        double media = Math.round(Arrays.stream(x).average().getAsDouble());
        int soma = Arrays.stream(x).sum();
        System.out.println("Média arredondada na variavel: "+media);

        System.out.println("Média arredondada diretamente aqui: "+Math.round(Arrays.stream(x).average().getAsDouble()));

        System.out.println("Soma: "+soma);

    }

    public static void methodOne(int x){
        System.out.println("Outro médodo mesmo nome, argumentos diferentes: "+x);
    }

    public static void main(String[] args) {
        methodOne(new int[]{8,13,3,5,7,35}); // passando um array
        methodOne(5,3,4,8); // passando sem array
        methodOne(5);
    }
}
