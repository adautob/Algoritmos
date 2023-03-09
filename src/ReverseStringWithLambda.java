import java.util.Arrays;

public class ReverseStringWithLambda {
    public static void main(String[] args) {
        String str = "String a ser invertida";
        String reversed = Arrays.stream(str.split("")).reduce("", (x, y) -> y + x);
        System.out.println(reversed);
    }

}
