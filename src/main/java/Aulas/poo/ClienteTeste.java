package Aulas.poo;

import java.time.LocalDate;
//encapsulamento ->
//Public é o padrão do JAVA
//Private -> Os métodos/atributos são visiveis somente nas classes
//terceiro passo é criar o encapsulamento criar o main teste incluindo os parametros
public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente(1,"Felipe","Jose",LocalDate.of(1993,5,25),1.85,95.0);



        //getter -> vai possbilitar a leitura do nome exemplo abaixo
        //o certo quando privamos um parametro -> get"nome" / errado -> client1.nome
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.nomeCompleto());
        cliente1.setAltura(50);
        cliente1.setAltura(1.5);
        cliente1.setPeso(650.0);



    }
}
