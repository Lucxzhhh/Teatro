import java.util.Scanner;
public class ex14 {
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n = ler.nextInt();
        
        System.out.println("Informe um numero: ");
        int n1 = ler.nextInt();

        System.out.println("Informe um numero: ");
        int n2 = ler.nextInt();

        String resultado = (n > n1 && n > n2) ? "O maior numero é o primerio" : (n1 > n && n1 > n2) ? "O maior numero é o segundo" : (n2 > n && n2 > n1) ? "O maior numero é o terceiro" : "empate";

        System.out.println(resultado);
    }
}
