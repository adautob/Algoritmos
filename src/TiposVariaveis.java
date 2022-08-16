public class TiposVariaveis {
    int i = 12;
    static int k = 9;
    public static void main(String[] args) {

        // variaveis de instancia  ---  acessa depois de instanciar
        TiposVariaveis t = new TiposVariaveis();
        System.out.println("Variáveis de instância");
        System.out.println(t.i);
        t.metodoUm();


        // variaveis static --- acessa diretamente
        System.out.println("Variáveis Static");
        System.out.println(t.k);
        System.out.println(k);
        System.out.println(TiposVariaveis.k);


        // variáveis locais
        System.out.println("Variáveis locaisVA");
        int m = 0, j = 0;
        for (;j<3;j++){
            m=m+j*2;
        }
        System.out.println(m+"----"+j);

    }
    public void metodoUm(){
        System.out.println(i);
    }
}
