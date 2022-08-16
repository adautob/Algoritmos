public class NumberOfDigits {
    public static void main(String[] args) {
        long n = 32378954633451112l;
        int c = 0;

        while (n!=0){
            n = n/10; // cada vez que divide por 10, retira o último dígito
            c++;
        }
        System.out.println("Number of Digits: "+c);
    }

}
