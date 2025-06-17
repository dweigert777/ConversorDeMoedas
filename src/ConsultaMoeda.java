import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ConsultaMoeda {
    public Moeda buscaMoeda(String moedaOrigem, String moedaAlvo) {
        URI valor = URI.create("https://v6.exchangerate-api.com/v6/d6166bbed2cd4f6ff268ef7a/pair/" + moedaOrigem + "/" + moedaAlvo);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(valor)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moeda.class);
        }
        catch (Exception e) {
            throw new RuntimeException("Moeda inválida.");
        }

    }
}
