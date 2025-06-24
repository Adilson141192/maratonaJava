package academy.devdojo.maratonaJava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        int idade = (int) 100000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87;

        System.out.println("A idade é" + idade + " anos");
        System.out.println(verdadeiro);
        System.out.println("char " + caractere);
        System.out.println(numeroGrande);
    }
}
