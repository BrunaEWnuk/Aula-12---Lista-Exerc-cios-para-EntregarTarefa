import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int valor, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        /*A variável "valor" é inicializada sem um valor específico. 
        Enquanto as variáveis "maior" e "menor" recebem, respectivamente, 
        o valor mínimo e máximo que um número inteiro pode assumir. */

        do {
            System.out.print("Digite um valor positivo (ou negativo para sair): ");
            valor = scanner.nextInt();
            
            if (valor >= 0) {
                if (valor > maior) {
                    maior = valor;
                }
                if (valor < menor) {
                    menor = valor;
                }
            }
        } while (valor >= 0);

        System.out.println("O maior valor é: " + maior);
        System.out.println("O menor valor é: " + menor);

    scanner.close();
    }
}
