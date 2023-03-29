public class Exercicio04 {
    public static void main(String[] args){
       
        int base = 3;
        int potencia = 1;

        for (int i = 0; i < 16; i++) {

            System.out.println(potencia);

            potencia *= base; //Mesma coisa que potencia = potencia * valor
        }
    }
}
