package academy.devdojo.maratonaJava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizado = idade >= 18;
        // !
        if(isAutorizado) {
            System.out.println("Autorizado a compra bebida alcoólica");
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
