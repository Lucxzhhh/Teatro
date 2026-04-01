import java.util.Scanner;
public class ex13 {
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o mes em que estamos: ");
        int n = ler.nextInt();

        String resultado = (n == 1 && n ==2 && n == 12) ? "Verão" : (n == 3 && n == 4 && n == 5) ? "Outono" : (n == 6 && n == 7 && n == 8) ? "Inverno" :  "Primavera";

        System.out.println("Estamos nessa estão do ano "+resultado);
    }
}
