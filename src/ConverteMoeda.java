import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConverteMoeda{

    public static void conversor(String moedaOrigem, String moedaAlvo, ConsultaMoeda consulta, Scanner leitura){

        double quantidade;
        double quantidadeConvertida;
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
        String dataFormatada = hoje.format(formatador);
        Scanner scanner = new Scanner(System.in);

        Moeda moeda = consulta.buscaMoeda(moedaOrigem, moedaAlvo);
        System.out.println("Digite o valor que deseja converter (123.45): ");
        quantidade = Double.parseDouble(leitura.nextLine());
        quantidadeConvertida = quantidade * moeda.conversion_rate();
        String numeroFormatado = String.format("%.2f", quantidadeConvertida);
        String quantidadeFormatada = String.format("%.2f", quantidade);
        System.out.println("A taxa de conversão da moeda " + moedaAlvo + " para " + moedaOrigem + " na data de " +
                dataFormatada + " é " + moeda.conversion_rate());
        System.out.println("O valor de " + quantidadeFormatada + " " + moedaOrigem + " vale " + numeroFormatado + " " + moedaAlvo);


    }
}
