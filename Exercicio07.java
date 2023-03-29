public class Exercicio07 {
    public static void main(String[] args) {

        int quadros = 64;
        long somatoria = 0;
        long totalGrãos = 1;

        for (int i = 1; i <= quadros; i++) {
            somatoria += totalGrãos;
            totalGrãos *= 2;
        }

        System.out.println("O número total de grãos de trigo é: " + somatoria);
    }
}
    
