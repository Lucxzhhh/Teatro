import java.util.Scanner;
public class ex6{
    public static void executar(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Infrome o ano: ");
        int n = ler.nextInt();

        String resultado = (n % 4 == 0 && n % 400 ==0 || n % 100 != 0) ? "O ano é bissexto" : "O ano não é bissexto";

        System.out.println(resultado);

    }
}