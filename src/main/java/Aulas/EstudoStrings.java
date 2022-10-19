package Aulas;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EstudoStrings {
    public static void main(String[] args) {
        //Strings são cadeias de caracteres
        String nome = "Pedro"; //constante literal
        if(nome == "Pedro"){ // compara endereço
            System.out.println("São iguais");
        }

        System.out.println("Digite seu sobrenome: ");
        Scanner entrada = new Scanner(System.in);
        String sobrenome = entrada.nextLine();

        if(sobrenome.equals("Pereira")){ // equals -> compara caractere com caractere, o conteudo das strings
            System.out.println("São iguais");
        }else{
            System.out.println("São diferentes");
        }

        // sobrenome.equalIgnoreCase("Pereira"); -> ele ignora o maíusculo e minusculo

        //outros métodos
        String java = "java";
        String ja = java.substring(1, 4); //começa do 0 e vai até 2 (não incluso)
        String va = java.substring(2); // corta do 2 até o final da string

        System.out.println(ja);
        System.out.println(va);

        String m1 = "Hello, ";
        String m2 = "World!";
        String m3 = m1.concat(m2); //equivale ao m1 + m2
        System.out.println(m3);
        System.out.println(java.length()); // quantos caracteres ela possui
        System.out.println(java.isEmpty()); //verifica se esta vazia -> ""
        System.out.println(java.toUpperCase()); // JAVA em caixa alta (letras maiuscula)
        System.out.println(java.toLowerCase()); // Java em caixa baixa (letras minusculas)

        // exemplo
        System.out.println("Digite um nome: ");
        String seuNome = entrada.nextLine();

        if(seuNome.toUpperCase().equals("JOSE")){
            System.out.println("Seu nome é jose");
        }

        String data = "13/10/2022";
        String[] valores = data.split("/");
        System.out.println(valores[0]);

        String email = "jose.almir@gamil.com";
        String[] valoresEmail = email.split("@"); // ["jose.almir", "gmail.com"]
        System.out.println(Arrays.toString(valoresEmail));

        String nome2 = "Jose Sousa";
        String[] nomeSeparado = nome2.split(" ");
        System.out.println(nomeSeparado[0]);

        String teste = "Amanhã é sexta-feira!";
        String[] teste2 = teste.split("");
        System.out.println(Arrays.toString(teste2));


    }
}
