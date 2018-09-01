import java.util.Scanner;

public class Program {

    public static void main(String[] args){

        Hanoi hanoi = new Hanoi();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o numero de discos do jogo: ");
        int numberOfDisks = scanner.nextInt();
        hanoi.executar(numberOfDisks, "torre A", "torre B", "torre C");

    }

}
