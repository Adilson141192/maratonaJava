package academy.devdojo.maratonaJava.introducao;

public class Aula06EstruturaDeRepeticao03 {
    public static void main(String[] args) {
        //imprima os primeiros 25 numeros de um dado valor, por exemplo 50
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
