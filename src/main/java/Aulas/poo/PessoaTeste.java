package Aulas.poo;

//Classe (maior da hierarquia) (gera)> Atributos (geram)> construtores (geram)> objetos (a partir deles aplicam-se)> métodos
// intuito: testar o uso da classe Pessoa
public class PessoaTeste {
    public static void main(String[] args) {
        //new -> contrói um NOVO objeto de Pessoa
        //está estrutura é somente para exemplos o certo é utilizar o contrutor
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Misato"; //obj.atributo = atribui um novo o valor
        pessoa1.sobrenome = "Katsuragi";
        pessoa1.idade = 29;
        pessoa1.peso = 50.0;
        pessoa1.altura = 1.60;

        Pessoa pessoa;


        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");
        System.out.println(recemNascido.altura);
        recemNascido.idade++; //envelhece

        pessoa4.mostrarIMC();
        double imcPessoa4 = pessoa4.calcularIMC();
        System.out.println(imcPessoa4);
        pessoa4.comer("Batata");

        //exemplo pessoa

        Pessoa pedro = new Pessoa("Pedro", "Silva", 29, 1.68, 60.0);


        Pessoa joao = new Pessoa("Joao", "Santos", 30,1.80,74.0);

        pedro.cumprimentar(joao);

    }
}
