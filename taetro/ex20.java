import java.util.Scanner;
import java.util.Random;
public class ex20 {
    public static void executar() {
        Scanner ler = new Scanner(System.in);
        Random sorte = new Random();

        String[] jogo = {"Pedra, Papel, Tesoura"};
         String sorteada = jogo[sorte.nextInt(jogo.length)];

         System.out.println("Pedra, Papel ou Tesoura? ");
         String j1 = ler.nextLine();

         
         if (j1.equals(jogo)) {
            System.out.println("Empate");
         }else if(j1.equals("Tesoura") && jogo.equals("Papel")){
            System.out.println("Parabénsss vc ganhou");
         }else if(j1.equals("Papel" )&& jogo.equals("Pedra")){
            System.out.println("Você ganhou!!!!");
         }else{
            System.out.println("A maquina ganhou :(");
         }
    }
}