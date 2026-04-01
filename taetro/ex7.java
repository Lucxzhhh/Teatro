import java.util.Scanner;
public class ex7 {
    public static void executar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Informe um lado do triangulo: ");
        int n1 = ler.nextInt();

        System.out.println("Informe outro lado do triangulo: ");
        int n2 = ler.nextInt();

        System.out.println("Informe outro lado do triangulo: ");
        int n3 = ler.nextInt();

        if ((n1 + n2) > n3 && (n2 + n3) > n1 && (n3 + n1) > n2) {
            System.out.println("Seu trinagulo é valido");
        }else if(n1 == n2 || n2 == n3 || n1 == n3){
            System.out.println("Seu triangulo é isósceles");
        }else if (n1 == n2 && n2 == n3 && n1 == n3){
            System.out.println("Seu triangulo é equilátero");
        }else if(n1 != n2 && n2 != n3 && n1!= n3){
            System.out.println("Seu triangulo é escaleno");
        }

    }
}