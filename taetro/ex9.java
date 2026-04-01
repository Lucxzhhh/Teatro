import java.util.Scanner;
public class ex9{
   public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe o numro da semana");
        int dia = ler.nextInt();

        switch (dia) {
            case 1: 
            System.out.println("Segunda-feira");
            break;

            case 2: 
            System.out.println("terça-feira");
            break;

            case 3: 
            System.out.println("quarta-feira");
            break;

            case 4: 
            System.out.println("quinta-feira");
            break;

            case 5: 
            System.out.println("Sexta-feira");
            break;

            case 6: 
            System.out.println("Sábado");
            break;

            case 7: 
            System.out.println("Domingo");
            break;
        }
    }
}