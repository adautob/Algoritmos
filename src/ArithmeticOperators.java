public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println(-50.0/0); // -Infinity
        System.out.println(50.0/0);  // Infinity
        System.out.println(0.0/0);   // NaN
        try {
            System.out.println(0/0); // ArithmeticException (não é double nem float)
        } catch (ArithmeticException e){
            System.out.println("Houve um erro: "+e.getMessage());
        }
        System.out.println(10 != Float.NaN);
        System.out.println(10 == Float.NaN);
    }
}
