import java.util.Scanner;
public class ex11 {
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int i = ler.nextInt();

        String resultado = (i < 12) ? "12 reais" : (i > 12 && i < 60) ? "20 reais" : "10 reias";

        System.out.println("Você pagara "+resultado+" por ingreso");


    }
}
