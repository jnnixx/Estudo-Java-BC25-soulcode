package Aulas;

import java.time.LocalDate;

public class EstudoDatas {
    public static void main(String[] args) {
        // dia - mês - ano
        LocalDate hoje = LocalDate.now(); //LocalDate armazena qualquer data (Dia - Mês - Ano)
        System.out.println(hoje);

        LocalDate natal = LocalDate.of(2022, 12, 25); //data especifica
        System.out.println(natal);

        System.out.println(hoje.isAfter(natal)); //verifica se a data é depois do especificada (valor booleano)
        System.out.println(hoje.isBefore(natal)); //verifica se a data é antes da especificada
        int ano = hoje.getYear(); //o ano da data
        int dia = hoje.getDayOfMonth(); //numero do mês
        int mes = hoje.getMonthValue(); //numero do dia do mês

        //calcular quantos dias falta para tal dia especifico
        int diasParaNatal = natal.getDayOfYear() - hoje.getDayOfYear(); //subtrai o dia do natal pelo dia de hoje
        System.out.println(ano);
        System.out.println(mes);
        System.out.println(dia);

        System.out.println("Faltam " + diasParaNatal + " dias p/ o natal!");

    }
}
