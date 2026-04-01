import java.util.Scanner;
public class ex19 {
   public static void executar(){
        Scanner ler = new Scanner(System.in);
     

        System.out.println("Infrome a velocidade do carro: ");
        double c = ler.nextDouble();

        System.out.println("Infrome o limite da via: ");
        double l = ler.nextDouble();

        if(c <= l && c == l){
            System.out.println("Sem multa");
        }else if (c >= 0.20){
            System.out.println("Multa leve + 20%");
        }else if(c > 0.20 && c <= 0.50){
            System.out.println("Multa grave de 20% a 50%");
        }else if (c > 0.50){
             System.out.println("Multa gravíssima acima de 50%");
        }
    }
}
