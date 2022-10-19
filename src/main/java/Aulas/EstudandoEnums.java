package Aulas;

import java.sql.SQLOutput;

public class EstudandoEnums {
    public static void main(String[] args) {
        //Enums -> são estruturas com constantes definidas
        //Dia da semana, meses do ano, turnos do dia, estações
        //niveis (Junior,pleno,senior), feriados nacionais, NAIPES


        enum DiaDaSemana {
            SEGUNDA,
            TERCA,
            QUARTA,
            QUINTA,
            SEXTA,
            SABADO,
            DOMINGO
        }

        DiaDaSemana hoje = DiaDaSemana.QUINTA; //enum.constante
        System.out.println(hoje);


        enum NivelDev {
            JUNIOR,
            PLENO,
            SENIOR
        }
        NivelDev nivel = NivelDev.JUNIOR;
        NivelDev nivel2 = NivelDev.valueOf("JUNIOR"); //O VALOR DE NAME PRECISAR SER JUNIOR, PLENO SENIRO

        switch (nivel){ //switch classico
            case JUNIOR:
                System.out.println("Seu nivel é JUNIOR");
                break;
            case PLENO:
                System.out.println("Seu nivel é PLENO");
                break;
            case SENIOR:
                System.out.println("Seu nivel é SENIOR");
                break;
        }


        //VERSÃO ENCHANCED

        switch (nivel){
            case JUNIOR ->{
                System.out.println("Seu nivel é JUNIOR");
            }
            case SENIOR -> {
                System.out.println("Seu nivel é SENIOR");
            }
            case PLENO -> {
                System.out.println("Seu nivel é SENIOR");
            }
            default -> {
                System.out.println("Nunca executa");
            }


        }



    }
}
