import java.math.BigInteger;
public class Exercicio07 {
    public static void main(String[] args) {

        BigInteger somatoria = BigInteger.ZERO;
        BigInteger graos = BigInteger.ONE;
        
        for (int i = 1; i <= 64; i++) {
            somatoria = somatoria.add(graos);
            graos = graos.multiply(BigInteger.TWO);
        }
        
        System.out.println("A soma total de grãos de trigo é: " + somatoria);
    }
}
