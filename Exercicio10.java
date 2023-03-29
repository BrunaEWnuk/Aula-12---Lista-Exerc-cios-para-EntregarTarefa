import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double areaTotal = 0;

        do {
            System.out.println("Digite o nome do cômodo:");
            String nome = scanner.nextLine();

            System.out.println("Digite a largura do cômodo em metros:");
            double largura = scanner.nextDouble();

            System.out.println("Digite o comprimento do cômodo em metros:");
            double comprimento = scanner.nextDouble();

            double area = largura * comprimento;
            System.out.printf("Área do %s: %.2f m²\n", nome, area);
            areaTotal += area;

            System.out.println("Deseja continuar calculando? (SIM/NÃO)");
        } while (scanner.next().equalsIgnoreCase("SIM"));

        System.out.printf("Área total da residência: %.2f m²", areaTotal);
        scanner.close();
    }
}