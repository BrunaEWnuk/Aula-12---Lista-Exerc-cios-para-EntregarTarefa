public class Exercicio05 {
    public static void main(String[] args){

        int atual = 1;
        int anterior = 0;
        int proximo;

        System.out.print(anterior + ", " + atual);

        for (int i = 2; i < 15; i++) {
            proximo = atual + anterior;
            System.out.print(", " + proximo);
            anterior = atual;
            atual = proximo;
        }
    }
}
