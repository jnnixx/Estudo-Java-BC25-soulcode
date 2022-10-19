package Aulas.poo;

import java.util.ArrayList;

public class Pessoa {
    // Propriedades / atributos de uma Pessoa

    //molde
    //propriedades
    String nome;
    String sobrenome;
    int idade;
    double peso;
    double altura;


    ArrayList<Pessoa> conhecidos = new ArrayList<>();

    Pessoa() { //construtor da classe com valores definidos
        this.nome = "Misato"; //this -> representa o objeto DENTRO da classe
        this.sobrenome = "Katsuragi";
        this.idade = 29;
        this.peso = 50.0;
        this.altura = 1.60;
    }

    //contrutor manual
    Pessoa(String nome, String sobrenome, int idade, double altura, double peso){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;

    }
    //contrutor mesclado
    Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.altura = 0.5;
        this.peso = 2.0;

    }

    //acões de uma pessoa (métodos)


    // <tipo_retorno> nomeDoMetodo(PARÂMENTROS){}
    void dizOla(Pessoa pessoa){ //métodos (VOID) não retorna nada (somente mostra o print)
        System.out.println("Olá, tudo bem? meu nome é " + this.nome);
    }

    void mostrarIMC(){ //somente mostra o resultado
        double imc = this.peso / (this.altura * this.altura);
        System.out.printf("O meu IMC é %.2f", imc);
    }

    double calcularIMC(){ //com return deve retornar o valor para ser utiliozado fora ou dentro da function
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }


    void cumprimentar(Pessoa pessoa){
        this.dizOla(pessoa);
        pessoa.conhecePessoa(this);

        if(!this.conhecePessoa(pessoa)){
            this.addPessoaNova(pessoa);
            pessoa.addPessoaNova(this);
        }
    }
    void comer(String comida){ //não é necessario this porque ele vem de dentro do parametro
        System.out.println("Estou comendo " + comida);

    }

    void addPessoaNova(Pessoa pessoa){//faz o objeto conhecer
        System.out.println(this.nome + " conheceu " + pessoa.nome + "!!!");
        this.conhecidos.add(pessoa);
    }
    boolean conhecePessoa(Pessoa pessoa){
        //se true, a pessoa (this) conhece a outra pessoa
        //se false, nao conhece
        return this.conhecidos.contains(pessoa);
    }
}
