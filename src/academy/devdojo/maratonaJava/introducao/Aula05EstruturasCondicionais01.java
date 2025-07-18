package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizado = idade >= 18;
        // !
        if(isAutorizado != false) {
            System.out.println("Autorizado a compra bebida alcoólica");
        } else {
            System.out.println("Não autorizado a compra bebida defeito");
        }

        if(!isAutorizado) {
            System.out.println("Não autorizado a compra bebida defeito");
        }

        boolean c = false;
        if (c = true) {
            System.out.println("Nunca deve ser feito");
        }
    }
}
