import java.util.Scanner;
public class ex15 {
    public static void executar(){
        int senha = 1234;
        String usuario = "lucas";

        Scanner ler = new Scanner(System.in);

        System.out.println("Iforme o usuario: ");
        String u = ler.nextLine();

        System.out.println("Informe a senha: ");
        int s = ler.nextInt();

        String resultado = (u == usuario & s == senha) ? "Usuario e senha correto" : "Usuario e senha incorreto";

        System.out.println(resultado);
    }
}
