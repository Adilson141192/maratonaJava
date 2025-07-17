package academy.devdojo.maratonaJava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println(resultado);

        //%
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10;
        boolean isDezDiferenteADez = 10 != 10;

        System.out.println("isDezMaiorQueVinte = " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte = " + isDezMenorQueVinte);
        System.out.println("isDezIgualAVinte = " + isDezIgualAVinte);
        System.out.println("isDezIgualADez = " + isDezIgualADez);
        System.out.println("isDezDiferenteADez = " + isDezDiferenteADez);

        // && (and) || (or) ! (not)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta = " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta = "  + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 5000;

        boolean isPlayStationCincoCompravel =
                valorTotalContaCorrente >  valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("isPlayStationCincoCompravel =  " + isPlayStationCincoCompravel);
    }
}
