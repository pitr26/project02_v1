package sazby_dph;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.io.DataInput;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        HttpClient httpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_2)  // this is the default
                .build();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://euvatrates.com/rates.json"))
                .GET()   // this is the default
                .header("accept", "application/json")
                .build();

        HttpResponse response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper objectMapper = new ObjectMapper();
        //List<CountryWrap> countryWrap = objectMapper.readValue(response.body().toString(), new TypeReference<List<CountryWrap>>(){});
        //countryWrap.forEach(System.out::println);

    }


}
