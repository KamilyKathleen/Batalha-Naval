package Final_Version;

public class BatalhaNaval {
    private Display display;
    private Jogo jogo = new Jogo();
    private Input input;

    public BatalhaNaval() {
        display = new Display();
    }

    public void start() {
        display.printMenu();
        menuPrincipal();
    }

    public void menuPrincipal() {
        int escolha;
        boolean sair = false;
        input = new Input();

        while (!sair) {
            display.printOpcoesMenuPrincipal();
            System.out.println("Escolha uma opção: ");
            escolha = input.getIntegerOpcaoMenu();
            switch (escolha) {
                case 1:
                    display.printMensagens("Você escolheu jogar o jogo ");
                    jogo.adicionarNavios();
                    break;
                case 2:
                    display.printMensagens("\033[H\033[2J");
                    System.out.flush();
                    display.printRegrasDoJogo();
                    break;
                case 3:
                    display.printMensagens("Você escolheu sair do jogo");
                    sairDoJogo();
                    break;
            }
        }
    }

    public void sairDoJogo() {
        display.printMensagemSair();
        System.exit(0);
    }
}
