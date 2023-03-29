import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
int i = 1;
int somatoria = 0;
do{
    somatoria+= i;
    i++;
    
} while (i<=100);
    System.out.println("A soma dos cem primeiros números naturais é igual a: " + somatoria);

scanner.close();
}
}