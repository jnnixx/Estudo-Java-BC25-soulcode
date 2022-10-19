package Aulas;

import java.util.ArrayList;

public class EstudoLista {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(); // cria um novo array list vazio que guarda Interge (ele não guarda a tipo primitivo)
        System.out.println(numeros);

        // Adicionando elementos no Array
        numeros.add(10); // equivale ao push no JS
        numeros.add(20);
        numeros.add(1000);

        System.out.println(numeros);
        System.out.println(numeros.get(2)); // equivale ao numeros[2]
        numeros.set(0, 500); //metodo set substitui valor no indice desejado
        System.out.println(numeros);

        // Remove o elemento no indice que deseja (ele diminui o tamanho do array list)
        numeros.remove(0);
        System.out.println(numeros);
        numeros.add(1,200);

        numeros.add(3,200); // adiciona o valor na posição desejada, o valor proximo é deslocado para a direita


        //tamanho do array
        System.out.println(numeros.size()); //equivale ao array.length

        for(int i = 0; i < numeros.size();i++){
            System.out.println(numeros.get(i));
        }

        System.out.println("-----------------");
        for(int numero : numeros){ //para cada valor dentro do array ele executa o codigo
            System.out.println(numero);
        }
        // procurar um valor dentro do array
        System.out.println(numeros.contains(500)); //true = encontrou o valor e false = não encontoru o valor
        System.out.println(numeros.indexOf(1000)); // para saber a posição do valor dentro do array (qual é  aposição do 100 na lista?)
        System.out.println(numeros.indexOf(500)); // -1 significa que não encontrou o elemento dentro do array
        System.out.println(numeros.indexOf(200)); //mostra o primeira posição do valor repetido que foi encontrado
        System.out.println(numeros.lastIndexOf(200)); //mostra o ultimo encontrado

    }
}
