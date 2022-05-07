import java.util.Scanner;

public class PrimeiroDesafio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o valor máximo para o qual o programa deve checar a soma de ímpares de n + reverso(n). O valor deve ser numérico");
        Integer limite = scanner.nextInt();

        for (Integer n=1; true; n++) {
            String reverseNumber = new StringBuilder(n.toString()).reverse().toString();
            if(reverseNumber.charAt(0) == '0') {
                continue;
            }

            int soma = n + Integer.parseInt(reverseNumber);
            if (ehImpar(soma)) {
                if(n>=limite) {
                    break;
                }
                if(soma<=limite) {
                    System.out.println(soma + " - {valor1: "+n+", valor2: "+reverseNumber+"}");
                }
            }
        }

    }

    private static boolean ehImpar(Integer numero) {
       return numero%2 == 1;
    }
}
