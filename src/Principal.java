import java.util.Scanner;

public class Principal {
    public static void main(String[] args)  {
        Scanner leitura = new Scanner(System.in);
        ConsultaMoeda consulta = new ConsultaMoeda();

        int opcao = 0;
        while (opcao != 7){
            System.out.println("---------------------------------------");
            System.out.println("|Seja Bem vindo ao conversor de moedas|");
            System.out.println("|Escolha a opçao desejada:            |");
            System.out.println("|1) Real --> Dólar                    |");
            System.out.println("|2) Dólar -> Real                     |");
            System.out.println("|3) Real --> Euro                     |");
            System.out.println("|4) Euro --> Real                     |");
            System.out.println("|5) Dólar -> Euro                     |");
            System.out.println("|6) Euro --> Dólar                    |");
            System.out.println("|7) Sair                              |");
            System.out.println("---------------------------------------");

        opcao = leitura.nextInt();
        leitura.nextLine();

        switch (opcao) {
            case 1:
                ConverteMoeda.conversor("BRL", "USD", consulta, leitura);
                break;
            case 2:
                ConverteMoeda.conversor("USD", "BRL", consulta, leitura);
                break;
            case 3:
                ConverteMoeda.conversor("BRL", "EUR", consulta, leitura);
                break;
            case 4:
                ConverteMoeda.conversor("EUR", "BRL", consulta, leitura);
                break;
            case 5:
                ConverteMoeda.conversor("USD", "EUR", consulta, leitura);
                break;
            case 6:
                ConverteMoeda.conversor("EUR", "USD", consulta, leitura);
                break;
            case 7:
                System.out.println("Saindo da aplicação.");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }
        }
    }
}