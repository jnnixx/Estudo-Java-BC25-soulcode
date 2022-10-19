package Aulas.poo;

public class Carro {
    String modelo;
    String marca;
    int ano;
    boolean ehFlexx;
    int qtsPortas;
    double combustivelAtual;

    double consumo;
    boolean estaLigado;


    Carro(String modelo, String marca, int ano, boolean ehflex, int qtsPortas, double consumo){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.ehFlexx = ehflex;
        this.qtsPortas = qtsPortas;
        this.combustivelAtual = 30.0;
        this.consumo = consumo; //quantos km por litro
        this.estaLigado = false;
    }


    //Abastecer
    void abastecer (double total){
        this.combustivelAtual += total;
    }

    //Ligar
    void ligar(){
        this.estaLigado = true;
    }
    //Desligar
    void desligar(){
        this.estaLigado = false;
    }
    //viajar
    boolean viajar(String local, double distancia) {
        if (this.estaLigado) {
            this.ligar();

        }

        double totalLitros = distancia / this.consumo;

        if(this.combustivelAtual - totalLitros > 0){
            this.combustivelAtual -= totalLitros;
            System.out.println("A viagem para " + local + " aconteceu. Sobrou " + this.combustivelAtual + " L");
            return true;
        }else{
            System.out.println("A viagem não aconteceu, reabasteça");
            return false;
        }
    }
    // A main serve pra testar a classe
    public static void main(String[] args) {
        Carro carro1 = new Carro("ZX", "Ferrari", 2012, false, 4, 50);
        Carro carro2 = new Carro("X", "Ford", 2000,false, 2, 50);
        System.out.println(carro1.combustivelAtual);
        carro1.abastecer(5);
        System.out.println(carro1.combustivelAtual);

        System.out.println(carro1.estaLigado);
        carro1.ligar();
        System.out.println(carro1.estaLigado);

        System.out.println(carro1.ano);
        carro1.ano = 2002;
        System.out.println(carro1.ano);

        boolean viajou = carro1.viajar("Fortaleza", 30000);
        System.out.println(viajou);
    }
}
