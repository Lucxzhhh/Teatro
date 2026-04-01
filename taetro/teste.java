import java.util.Scanner;

public class teste {

    static int rlivre = 0;
    static int rOcupado = 0;
    static int rReserva = 0;

    static void calcularCadeiras(char[][] sala) {
        rlivre = rReserva = rOcupado = 0;

        for (int quantidade = 0; quantidade < 12; quantidade++) {
            for (int quantidade2 = 0; quantidade2 < 12; quantidade2++) {

                if (sala[quantidade][quantidade2] == ' ') {
                    rlivre++;
                } else if (sala[quantidade][quantidade2] == 'R') {
                    rReserva++;
                } else if (sala[quantidade][quantidade2] == 'X') {
                    rOcupado++;
                }

            }
        }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char[][] SalaBeethoven = new char[12][12];
        char[][] SalaHamlet = new char[12][12];
        char[][] SalaEsperandoGodot = new char[12][12];

        char[][] salaAtual = SalaBeethoven;
        char[][] sala2 = SalaHamlet;
        char[][] sala3 = SalaEsperandoGodot;

        Double ingreso = 49.99;
        Double MetadeIngreso = 24.99;

        int contadorCancelamento = 0;

        double arrecadado = 0;
        double ArrecadadoReserva = 0;
        double ArrecadadoOcupado = 0;

        char[][][] salas = { SalaBeethoven, SalaHamlet, SalaEsperandoGodot };

        for (int s = 0; s < salas.length; s++) {
            for (int l = 0; l < 12; l++) {
                for (int c = 0; c < 12; c++) {
                    salas[s][l][c] = ' ';
                }
            }
        }

        String[] titulos = new String[20];
        String[] enunciados = new String[20];

        titulos[0] = "Par ou Ímpar";
        titulos[1] = "Maior de Dois Números";
        titulos[2] = "Aprovação Escolar";
        titulos[3] = "Classificação de Temperatura";
        titulos[4] = "Calculadora Simples";
        titulos[5] = "Ano Bissexto";
        titulos[6] = "Triângulo Válido";
        titulos[7] = "IMC";
        titulos[8] = "Dia da Semana";
        titulos[9] = "Positivo, Negativo ou Zero";
        titulos[10] = "Ingresso de Cinema";
        titulos[11] = "Nota por Conceito";
        titulos[12] = "Estação do Ano";
        titulos[13] = "Maior de Três Números";
        titulos[14] = "Login";
        titulos[15] = "Múltiplo de 3 e 5";
        titulos[16] = "Desconto";
        titulos[17] = "Número Romano";
        titulos[18] = "Velocidade e Multa";
        titulos[19] = "Pedra Papel Tesoura";

        for (int i = 0; i < 20; i++) {
            enunciados[i] = "Exercício " + (i + 1) + " - " + titulos[i];
        }

        int opcao = 0;
        do {

            System.out.println("Informe as opções que vc quer");
            System.out.println("1 - Ver mapa do teatro");
            System.out.println("2 - Escolher sala do teatro");
            System.out.println("3 - Reserva Cadeira");
            System.out.println("4 - Comprar Cadeira");
            System.out.println("5 - Cancelar Reserva");
            System.out.println("6 - Ver Relatório Financeiro");
            System.out.println("7 - Ver os exercícios");
            System.out.println("0 - fechar programa");

            opcao = ler.nextInt();

            switch (opcao) {

                case 1:

                    for (int numero = 0; numero < 12; numero++) {
                        System.out.print("    " + (numero + 1) + "  ");
                    }
                    for (int l = 0; l < 12; l++) {
                        char letra = (char) ('A' + l);
                        System.out.print("\n" + letra + " ");

                        for (int c = 0; c < 12; c++) {
                            System.out.print(" [ " + salaAtual[l][c] + " ] ");
                        }

                        System.out.println();
                    }
                    calcularCadeiras(salaAtual);
                    System.out.print(" Livre [ ]");

                    System.out.print(" Reservado [R]");

                    System.out.print(" Ocupado [X]");

                    System.out.println("\nTotal de assentos :");
                    System.out.println("1 - Livre " + rlivre);
                    System.out.println("2 - Reservados " + rReserva);
                    System.out.println("3 - Ocupados " + rOcupado);

                    if (salaAtual == SalaBeethoven) {
                        System.out.println("Sala Beethoven \n");
                        System.out.println("espetáculo Romeu e Julieta ");
                    } else if (salaAtual == SalaHamlet) {
                        System.out.println("Sala Hamlet \n");
                        System.out.println("espetáculo O Crisol");
                    } else {
                        System.out.println("Sala Esperando Godot \n");
                        System.out.println("espetáculo Cercas");
                    }

                    break;
                case 2:

                    System.out.println("Salas do Teatro devisate:");
                    System.out.println("1 - Sala Beethoven");
                    System.out.println("2 - Sala Hamlet");
                    System.out.println("3 - Sala Esperando Godot");

                    System.out.println("Informe que sala que você quer ver o espetaculo:");
                    int sala = ler.nextInt();

                    if (sala == 1) {
                        if (salaAtual == SalaBeethoven) {
                            System.out.print("Você já está nessa sala");
                        } else {
                            System.out.print("Seja-bem vindo a sala Beethoven");
                            System.out.println("Espetaculo: Romeu e Julieta");
                            salaAtual = SalaBeethoven;
                        }
                    } else if (sala == 2) {
                        if (salaAtual == SalaHamlet) {
                            System.out.print("Você já está nessa sala");
                        } else {
                            System.out.print("Seja-bem vindo a sala Hamlet");
                            System.out.println("Espetaculo: O Crisol");
                            salaAtual = SalaHamlet;
                        }
                    } else if (sala == 3) {
                        if (salaAtual == SalaEsperandoGodot) {
                            System.out.print("Você já está nessa sala");
                        } else {
                            System.out.print("Seja-bem vindo a Sala Esperando Godot");
                            System.out.println("Espetaculo: Cercas");
                            salaAtual = SalaEsperandoGodot;
                        }
                    } else {
                        System.out.println("Número da sala Incorreto");
                    }

                    break;

                case 3:

                    System.out.println("Informe a linha de A a L:");
                    char linha = ler.next().charAt(0);
                    linha = Character.toUpperCase(linha);

                    System.out.println("Informe a coluna de 1 a 12");
                    int coluna = ler.nextInt();

                    int valorLinha = linha - 'A';
                    int valorColuna = coluna - 1;

                    if (valorLinha < 0 || valorLinha >= 12 || valorColuna < 0 || valorColuna >= 12) {
                        System.out.println("posição Incorreta");
                    } else if (salaAtual[valorLinha][valorColuna] == ' ') {
                        salaAtual[valorLinha][valorColuna] = 'R';
                        System.out.println("Reserva feita ");
                    } else if (salaAtual[valorLinha][valorColuna] == 'X') {
                        System.out.println("Não tem como reserva um cadeira ocupada");
                    }

                    break;

                case 4:

                    System.out.println("Informe a linha de A a L:");
                    char linhacompra = ler.next().charAt(0);
                    linhacompra = Character.toUpperCase(linhacompra);

                    System.out.println("Informe a coluna de 1 a 12");
                    int colunacompra = ler.nextInt();

                    int compraLinha = linhacompra - 'A';
                    int compraColuna = colunacompra - 1;

                    if (compraLinha < 0 || compraLinha >= 12 || compraColuna < 0 || compraColuna >= 12) {
                        System.out.println("Posição inválida!");
                        break;
                    } else if (salaAtual[compraLinha][compraColuna] == ' ') {
                        salaAtual[compraLinha][compraColuna] = 'X';
                        arrecadado += ingreso;
                        ArrecadadoOcupado += ingreso;
                    } else if (salaAtual[compraLinha][compraColuna] == 'R') {
                        salaAtual[compraLinha][compraColuna] = 'X';
                        arrecadado += MetadeIngreso;
                    } else {
                        System.out.println("Cadeira já ocupada");
                    }

                    break;

                case 5:

                    System.out.println("Informe a linha de A a L:");
                    char linhacancelar = ler.next().charAt(0);
                    linhacancelar = Character.toUpperCase(linhacancelar);

                    System.out.println("Informe a coluna de 1 a 12");
                    int colunacancelar = ler.nextInt();

                    int Linhacancelar = linhacancelar - 'A';
                    int Colunacancelar = colunacancelar - 1;

                    if (Linhacancelar < 0 || Linhacancelar >= 12 || Colunacancelar < 0 || Colunacancelar >= 12) {
                        System.out.println("Possição da cadeira invalida");
                    } else if (salaAtual[Linhacancelar][Colunacancelar] == 'R') {
                        salaAtual[Linhacancelar][Colunacancelar] = ' ';
                        contadorCancelamento++;
                        arrecadado -= MetadeIngreso;
                        rReserva--;
                    } else {
                        System.out.println("Cadeira já esta sem reserva ou compra ");
                    }

                    break;

                case 6:
                    calcularCadeiras(salaAtual);

                    double totalInteiros = rOcupado * ingreso;
                    double totalReservas = rReserva * MetadeIngreso;

                    double receitaPotencial = totalInteiros + (rReserva * ingreso);

                    System.out.println("Relatorio Finaceiro");
                    System.out.println("Cadeiras livres: " + rlivre);
                    System.out.println("Cadeiras reservadas: " + rReserva);
                    System.out.println("Cadeiras ocupadas: " + rOcupado);
                    System.out.println("\nTotal arrecadado (ocupadas): R$ " + totalInteiros);
                    System.out.println("Total em reservas: R$ " + totalReservas);
                    System.out.println("\nReceita potencial (reservas virando compra): R$ " + receitaPotencial);
                    System.out.println("Receita máxima (todas vendidas): R$ " + (144 * ingreso));
                    break;

              case 7:
    int paginaAtual = 0;
    int itensPorPagina = 7;
    int totalExercicios = 20;
    int totalPaginas = (int) Math.ceil((double) totalExercicios / itensPorPagina);

    String subOpcao = "";
    do {
        int inicio = paginaAtual * itensPorPagina;
        int fim = Math.min(inicio + itensPorPagina, totalExercicios);

        System.out.println("\n Lista de Exercícios — Página " + (paginaAtual + 1) + " de " + totalPaginas + " ===");


        for (int i = inicio; i < fim; i++) {
            System.out.println((i + 1) + " - " + titulos[i]);
        }

        System.out.println();
        System.out.println(paginaAtual > 0 ? "A - Página anterior" : "");
        System.out.println(paginaAtual < totalPaginas - 1 ? "P - Próxima página" : "");
        System.out.println("V - Voltar ao menu principal");
        System.out.println("Ou digite o número do exercício (1-20):");

        subOpcao = ler.next().toUpperCase();

        if (subOpcao.equals("A")) {
            if (paginaAtual > 0) {
                paginaAtual--;
            } else {
                System.out.println("Você já está na primeira página.");
            }
        } else if (subOpcao.equals("P")) {
            if (paginaAtual < totalPaginas - 1) {
                paginaAtual++;
            } else {
                System.out.println("Você já está na última página.");
            }
        } else if (subOpcao.equals("V")) {
            System.out.println("Voltando ao menu principal...");
        } else {
            
            switch (subOpcao) {
                case "1" -> ex1.executar();
                case "2" -> ex2.executar();
                case "3" -> ex3.executar();
                case "4" -> ex4.executar();
                case "5" -> ex5.executar();
                case "6" -> ex6.executar();
                case "7" -> ex7.executar();
                case "8" -> ex8.executar();
                case "9" -> ex9.executar();
                case "10" -> ex10.executar();
                case "11" -> ex11.executar();
                case "12" -> ex12.executar();
                case "13" -> ex13.executar();
                case "14" -> ex14.executar();
                case "15" -> ex15.executar();
                case "16" -> ex16.executar();
                case "17" -> ex17.executar();
                case "18" -> ex18.executar();
                case "19" -> ex19.executar();
                case "20" -> ex20.executar();
                default -> {
                    ;
                    System.out.println("Opção inválida. Use P, A, V ou um número de 1 a 20.");
                }
            }
        }

    } while (!subOpcao.equals("V"));
    break;
            
                 }
                 ler.close();
                } while (opcao != 0);
        }
    }
