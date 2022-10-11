public class Variaveis {
    // Execução do nosso programa JAVA
    public static void main (String[] args){
        System.out.println("Hello, World!"); // equivale ao console.log()

        // Variáveis no JAVA
        // fortemente tipada e estaticamente tipado
        int idade = 20; //inteiro (2 b)
        double salario = 4500.99; // dupla precisão
        float nota = 7.5f; // sufixo para float (f)
        long populacaoTerra = 7_900_000_000l; //usamos o prefixo l para representar o long
        boolean tarefaConcluida = false; // (true ou false)
        int i = 1, j = 0, k= 1000; //multiplas variaveis (do mesmo tipo)
        String nomeCompleto = "Jenni Rosa"; //sempre aspas duplas

        int teste = 10;
        teste = 9; //reatribuição de variáveis

        final int teste2 = 200; //impossivel mudar o valor definido inicialmente
        //teste2 = 1000;


        ///////////////////////////////////////////////////////////////////////////////////


        //Operadores

        int a = 10;
        int b = 5;

        int soma = a + b; //15
        int subtracao = a - b; //5
        int multiplicacao = a * b; // 50
        int divisao = a / b; //2

        System.out.println("O resultado da soma é " + soma); //"O resultado da soma é 15"
        // A DIVISÃO ENTRE DOIS INTEIROS RESULTA EM INTEIRO
        int sete = 7;
        int dois = 2;
        double dois2 = 2.0;

        System.out.println(sete / dois);
        System.out.println(sete / dois2);

        //Math

        double x = Math.sqrt(144); //12
        double y = Math.pow(5, 2); //25
        System.out.println(Math.PI);

        //casting converte o valor e não a variavel
        int pi2 = (int)Math.PI;
        System.out.println(pi2);

        double resultado3 = sete / (double) dois;

        //Operadores incremento e decremento
        int valor = 5;
        valor++;
        valor--;
        valor += 10;


        //operadores relacionais
        boolean teste1 = 5 > 1; //true
        boolean teste3 = 5 < 1; //false
        boolean teste4 = 5== 5; //true
        boolean teste5 = 5 != 1;//true
        boolean teste6 = 6 >= 6; //true
        boolean teste7 = 5 <= 9; //true

        //operadores logicos
        boolean teste8 = true && false; //false basta uma ser falsa que tudo é false
        boolean teste9 = true || false; // basta um ser true para ser todos true
        boolean teste10 = (5 > 10) && (10 <  5); //false
        boolean teste11 = (10 <= 0) || (1 < 5); //true

        boolean teste12 = (5 > 1); //true
        boolean teste13 = !teste12; //false


    }
}
