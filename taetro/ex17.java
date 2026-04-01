import java.util.Scanner;
public class ex17 {
     public static void executar(){
        Scanner ler = new Scanner(System.in);
     

        System.out.println("Infrome um numero: ");
        double n = ler.nextDouble();

        if (n >= 500) {
            double desconto = n - (20 / 100);
            System.out.println("O desconto foi de 20% o valor final foi de  "+desconto);
        }else if(n < 500 && n >= 200){
            double desconto2 = n - (10/100);
            System.out.println("O desconto foi de 10% o valor final foi de "+desconto2);
        }else{
            System.out.println("Você não recebei desconto");
        }
    }
}
