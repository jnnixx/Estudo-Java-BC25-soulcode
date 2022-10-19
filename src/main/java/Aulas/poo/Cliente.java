package Aulas.poo;

import java.time.LocalDate;

 class Cliente {
    //primeiro passo é criar as propriedades
    public int id;

     private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private double altura;
    private double peso;

    //segundo passo é criar o coontrutor
    Cliente(int id, String nome, String sobrenome, LocalDate dataNascimento, double altura, double peso){
        this.id = id;
        this.nome =nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
        this.altura = altura;
        this.peso = peso;
    }

      //getter -> possibilita a leitura dos atributos (apenas leitura)
     // estrutura do getter /sintaxe (sempre vai ter um retorno

     public String getNome(){
        return this.nome;
     }
     public String getSobrenome(){
        return this.sobrenome;
     }
     public String nomeCompleto(){
        return this.nome + "" + this.sobrenome; //é possivel "concatenar eles"
     }
     public LocalDate DataNascimento(){
        return this.dataNascimento;
     }
     public double altura(){
        return this.altura;
     }
     public  double peso(){
        return this.peso;
     }

     //Setter -> Serve para alterar o valor ele não retorna nada (quase sempre não é necessario retornar um valor)
     //Ele controla o valor ta,bém, validando se o valor novo é coerente.
     public void setAltura(double altura){
        if(altura > 0 && altura < 2.51){
            this.altura = altura;
        }else{
            System.out.println("Digite uma altura menor: ");
        }


     }
     public void  setPeso(double peso){
         if(altura > 0 && altura < 547.0){
             this.altura = altura;
         }else{
             System.out.println("Digite um peso valido: ");
         }
     }

}
