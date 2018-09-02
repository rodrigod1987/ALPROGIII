import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;

//Top common divisor
public class TCD {

    public static void main(String[] args){

        TCD tcd = new TCD();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int number = scanner.nextInt();
        System.out.print("Digite o divisor: ");
        int divisor = scanner.nextInt();
        int value = tcd.run(number, divisor);
        System.out.print("O MDC é: "+value);

    }

    public int run(int number, int divisor){
        if (number % divisor == 0) return divisor;
        else return run(divisor, (number % divisor));
    }

}
