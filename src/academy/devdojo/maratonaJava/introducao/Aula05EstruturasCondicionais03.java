package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        //doar salario se > 5000
        double salario = 3000.00;
        // (condição) ? verdadeiro : falso;

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo." : "Ainda não tenho condições, mas terei!";

        System.out.println(resultado);
    }
}
