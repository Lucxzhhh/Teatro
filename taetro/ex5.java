import java.util.Scanner;
public class ex5{
   public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("1 conta de + ");
        System.out.println("2 conta de - ");
        System.out.println("3 conta de * ");
        System.out.println("4 conta de / ");

        System.out.println("Informa o numera da operação que você quer fazer: ");
        int n = ler.nextInt();

        System.out.println("Informe o primeiro numero: ");
        int n1 = ler.nextInt();

        System.out.println("Informa o segundo numero: ");
        int n2 = ler.nextInt();



        switch (n){
            case 1:
                 System.out.println("O resultado da operação eh: "+(n1 + n2));
            break;

            case 2:
                System.out.println("O resultado da operação eh: "+(n1 - n2));
                break;

                case 3:
                    System.out.println("O resultado da operação eh: "+(n1 * n2));
                break;

                case 4:
                    System.out.println("O resultado da operação eh: "+(n1 / n2));
                break;
                }
        

    }
}