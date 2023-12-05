package Final_Version;

public class Display {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    public Display() {

    }

    public void printMenu() {
        System.out.println("Batalha Naval está iniciando ....................");
        System.out.println("                                     # #  ( )\n" +
                "                                  ___#_#___|__\n" +
                "                              _  |____________|  _\n" +
                "                       _=====| | |            | | |==== _\n" +
                "                 =====| |.---------------------------. | |====\n" +
                "   <--------------------'   .  .  .  .  .  .  .  .   '--------------/\n" +
                "     \\                                                             /\n" +
                "      \\___________________________________________________________/\n" +
                "  wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww\n" +
                "   wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwww ");

        System.out.println("\n" +
                "██████╗  █████╗ ████████╗ █████╗ ██╗     ██╗  ██╗ █████╗     ███╗   ██╗ █████╗ ██╗   ██╗ █████╗ ██╗     \n" +
                "██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██║     ██║  ██║██╔══██╗    ████╗  ██║██╔══██╗██║   ██║██╔══██╗██║     \n" +
                "██████╔╝███████║   ██║   ███████║██║     ███████║███████║    ██╔██╗ ██║███████║██║   ██║███████║██║     \n" +
                "██╔══██╗██╔══██║   ██║   ██╔══██║██║     ██╔══██║██╔══██║    ██║╚██╗██║██╔══██║╚██╗ ██╔╝██╔══██║██║     \n" +
                "██████╔╝██║  ██║   ██║   ██║  ██║███████╗██║  ██║██║  ██║    ██║ ╚████║██║  ██║ ╚████╔╝ ██║  ██║███████╗\n" +
                "╚═════╝ ╚═╝  ╚═╝   ╚═╝   ╚═╝  ╚═╝╚══════╝╚═╝  ╚═╝╚═╝  ╚═╝    ╚═╝  ╚═══╝╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝╚══════╝\n" +
                "                                                                                                        \n");
    }

    public void printMensagens(String mensagem) {
        System.out.println(mensagem);
    }

    public void printOpcoesMenuPrincipal() {
        System.out.println("Pressione: \n" +
                "\t 1 - Jogar \n" +
                "\t 2 - Ver as regras do jogo \n" +
                "\t 3 - Sair do jogo");
    }

    public void printMensagemSair() {
        System.out.println("Obrigado por jogar Batalha Naval!");
    }

    public void printRegrasDoJogo() {
        System.out.println("Cada navio deve ser posicionado horizontalmente ou verticalmente nos espaços do tabuleiro - " +
                "não diagonalmente - e os navios não podem ficar pendurados para fora do tabuleiro. \n" +
                "Os navios podem se tocar, mas eles não podem ocupar o mesmo espaço no tabuleiro. \n" +
                "Você não pode mudar a posição dos navios depois que o jogo iniciar. \n");
    }

    public void printTabuleiro(Tabuleiro tabuleiro) {
        System.out.print("    ");
        for (int i = 0; i < tabuleiro.getSizeX(); i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        for (int row = 0; row < tabuleiro.getSizeX(); row++) {
            if (row < 10) {
                System.out.print(row + "   ");
            } else {
                System.out.print(row);
            }
            for (int col = 0; col < tabuleiro.getSizeY(); col++) {
                switch (tabuleiro.getQuadrado(row, col).getCaracter()) {
                    case 'O':
                        System.out.print(ANSI_BLUE_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'A':
                        System.out.print(ANSI_RED_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'N':
                        System.out.print(ANSI_YELLOW_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'E':
                        System.out.print(ANSI_BLACK_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                    case 'V':
                        System.out.print(ANSI_CYAN_BACKGROUND + "  " + ANSI_RESET + " ");
                        break;
                }
            }
            System.out.println();
        }
    }
}
