import java.util.Scanner;
public class ex3{
   public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int n1 = ler.nextInt();

        System.out.println("Informe um numero: ");
        int n2 = ler.nextInt();

        System.out.println("Informe um numero: ");
        int n3 = ler.nextInt();

        System.out.println("Informe um numero: ");
        int n4 = ler.nextInt();

        int media = (n1 + n2 + n3 + n4) / 4;

        if (media >= 7) {
            System.out.println("Aprovado");
        }else if(media >=5 && media <= 7){
            System.out.println("Recuperação");
        }else if (media < 5){
            System.out.println("Reprovada");
        }
    }
}