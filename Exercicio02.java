import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

       
        int somatoria = 0;
        int i = 1;

        do{
            if (i % 2 == 0) {
                somatoria += i;
            }
            i++;
        
    } while (i <= 500);

    System.out.println("O somatório dos valores pares na faixa de 1 até 500 é de: " + somatoria);
    scanner.close();
}    
}
