import java.util.Scanner;
public class ex2{
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        int numero = ler.nextInt();

        System.out.println("Informe outro numero: ");
        int numeros = ler.nextInt();

        if (numero > numeros) {
            System.out.println("O primeiro numero é maior "+numero);
        }else if(numeros > numero){
            System.out.println("o segundo numero é maior "+numeros);
        }
    }
}