import java.util.Scanner;

public class ex1{
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = ler.nextInt();

        if(numero % 2 == 0){
            System.out.println("Seu numero é par");
        }else if(numero % 2 != 0){
            System.out.println("Seu numero é impar");
        }else{
            System.out.println("Numero invalido");
        }
    }
}