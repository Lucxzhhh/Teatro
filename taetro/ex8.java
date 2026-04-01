import java.util.Scanner;
public class ex8 {
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe sua aultura: ");
        double altura = ler.nextDouble();

        System.out.println("Informe seu peso: ");
        double peso = ler.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        }else if (imc > 18.5 && imc <= 25){
            System.out.println("Peso normal");
        }else if(imc > 25 && imc <= 30){
            System.out.println("Sobrepeso");
        }else if(imc > 30){
            System.out.println("Obesidade");
        }
    }
}
