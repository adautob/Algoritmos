public class TesteMain {
    public static void main(String[] args) {
        boolean Boolean = true;
        System.out.println(Boolean);

        byte b = 127;  // valor maximo de byte
        System.out.println("Byte = "+b);

        short s = 32767; // valor máximo de short
        System.out.println("Short = "+s);

        int i = 2147483647; // valor maximo de int
        System.out.println("Int = "+i);

        float numero = 10f;
        System.out.println("Float = "+numero);

        double numero2 = 89.89332;
        System.out.println("Double = "+numero2);

        char ch1 = 65;
        System.out.println("Char = "+ch1);

        char ch2 = 0xB6;
        String str = String.valueOf(ch2);
        System.out.println("Char2 = "+ch2);
        System.out.println("Str = "+str+str);

        int x = 017;
        System.out.println("Int literal octal = "+x);

        double media = Math.round(7.1254);
        System.out.println("Média = "+media); // arredondamento


         // ARRAYS

        Integer[] a = new Integer[0];
        Integer []b1;
        Integer c[];

        Integer []v1[] = new Integer[2][];
        v1[0] = new Integer[5];
        v1[1] = new Integer[10];
        System.out.println(v1.length);
        System.out.println(v1[0].length);
        System.out.println(v1[1].length);
        System.out.println(v1[0][0]);

        System.out.println(soma(new int[]{7,12,5,22}));

    }

    public static int soma(int[] x){
        int total = 0;
        for (int x1:x) {
            total += x1;
        }
        return total;
    }
}
