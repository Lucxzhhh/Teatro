import java.util.Scanner;
public class ex12 {
   public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua nota: ");
        int n = ler.nextInt();

        String resultado = (n > 9 && n <10) ? "A" : (n > 7 && n < 8) ? "B" : (n > 5 && n < 6) ? "C" : "D";

        System.out.println("Sua nota foi de "+resultado);
    }
}
