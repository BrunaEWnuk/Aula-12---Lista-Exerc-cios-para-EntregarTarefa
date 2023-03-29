import java.util.Scanner;

public class Exercicio08 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

            int valor;
            int soma = 0;
            int qtdValores = 0;
    
        System.out.println("Digite valores positivos para calcular a soma, média e total: ");
    
            do {
                valor = scanner.nextInt();
    
                if (valor >= 0) {
                    soma += valor;
                    qtdValores++;
                }
            } while (valor >= 0);
    
            double media = (double) soma / qtdValores;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Total de valores lidos: " + qtdValores);

        scanner.close();
        }
    }
    

    

