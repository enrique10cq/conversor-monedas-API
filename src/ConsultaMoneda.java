import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {
    public Moneda convertirMoneda(String monedaBase, String monedaObjetivo, double monto){

        URI direccion = URI.create("https://v6.exchangerate-api.com/YOUR-API-KEY/pair/"+monedaBase+"/"+monedaObjetivo +"/"+monto);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            // Parsear la respuesta JSON manualmente y crear un objeto Moneda
            String json = response.body();
            Gson gson = new Gson();
            Moneda moneda = gson.fromJson(json, Moneda.class);
            return moneda;
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

