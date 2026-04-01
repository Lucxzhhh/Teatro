import java.util.Scanner;
public class ex16 {
   public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Infrome um numero: ");
        int n = ler.nextInt();

        String resultado = (n % 3 == 0 && n % 5 == 0) ? "seu numero é multiplico de 3 e 5" : (n % 3 == 0 && n % 5 != 0) ? "seu numero é multiplico de 3" : (n % 3 != 0 && n % 5 == 0) ? "Seu numero é multiplico de 5" : "Seu numero não é multiplico de 5 e nem 3";

        System.out.println(resultado);
    }
}
