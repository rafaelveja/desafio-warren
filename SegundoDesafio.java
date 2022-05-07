import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SegundoDesafio {
    public static void main(String[] args) {
        List<Integer> qntAtrasados = new LinkedList<>();
        List<Integer>tempoChegada = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o limite de alunos atrasados. O valor deve ser numérico");
        Integer limite = scanner.nextInt();

        System.out.println("Insira o tempo de atraso dos alunos. Ao digitar algo que não seja numérico, o programar parará de contar mais alunos. Espaços vazios são desconsiderados.");
        while (scanner.hasNextInt()) {
            tempoChegada.add(scanner.nextInt());
        }

        tempoChegada.forEach((tempo)->{
            if(tempo > 0) {
                qntAtrasados.add(tempo);
            }
        });
        if(qntAtrasados.size() >= limite) {
            System.out.println("Não haverá aula");
        } else {
            System.out.println("Haverá aula");
        }
    }
}
