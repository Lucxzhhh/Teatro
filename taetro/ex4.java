import java.util.Scanner;
public class ex4{
   public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe a temperatura em Celsius: ");
        int t = ler.nextInt();

        if (t < 15) {
            System.out.println("Frio");
        }else if(t > 15 && t < 25){
            System.out.println("Agradável");
        }else if(t > 25){
            System.out.println("Quente");
        }
    }
}