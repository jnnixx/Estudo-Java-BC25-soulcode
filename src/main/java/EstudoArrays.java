import java.util.Scanner;

public class EstudoArrays {
    public static void main (String [] args){
        int [] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length); //retorna o tamanho do array
        System.out.println(numeros[3]); //retorna a posição do array
        numeros[3] = 1000; //é possivel mudar o valor da posição de um array
        for(int i =0; i < numeros.length;i++){
            System.out.println("A posição " + i + " com valor de " + numeros[i]);
        }

        int [] numeros2 = new int[50];
        numeros2[0] = 500;
        numeros2[1] = 500;
        // .....
        //se ultrapassar do limite excedido ele começa a dar erro
        numeros2 [49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"Jose Almir", "Renato Pereira", "Victor Icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];



        //exemplo
        System.out.println("Digite o total de notas: ");
        int  totalNotas = entrada.nextInt();
        double[] notasProvas = new double[totalNotas];

        for ( int i = 0; i < totalNotas; i++){
            System.out.println(("Digite o valor da " + (i+1) +"º nota: " ));
            notasProvas[i] = entrada.nextDouble();
        }
        double  soma = 0.0;
        for (double nota : notasProvas) {  // para cada valor de notasProvas
            soma += nota;
        }

        double media = soma / notasProvas.length;

        String mensagem = (media < 7)? "Voce está reprovado" : "Voce está aprovado";
        System.out.println(mensagem);

        // default values
        int numero; // padrão = 0
        double nota2; // padrão = 0.0
        long populacao; //padrão = 0
        boolean teste; // padrão = false
        String nome; //null -> ausência de objeto na variavel (não é uma variavel primitiva)
        //
        // Wrapper classes ->
        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;





    }
}
