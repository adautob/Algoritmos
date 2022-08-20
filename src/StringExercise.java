import static java.lang.String.valueOf;

// intercalando String

public class StringExercise {
    public static void main(String[] args) {
        String str1 = "casa";
        String str2 = "gato";
        String maior = "";
        String menor = "";

        if (str1.length() >= str2.length()){
            maior = str1;
            menor = str2;
        } else {
            maior = str2;
            menor = str1;
        }

        String result = "";
        for (int i = 0; i < maior.length(); i++){
            if (i < menor.length())
                result += valueOf(maior.charAt(i))+valueOf(menor.charAt(i));
            else
                result += valueOf(maior.charAt(i));

        }

        System.out.println(result);
    }
}
