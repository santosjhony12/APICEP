package org.example;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class APICEP {
    private String cep;
    private String url;

    public APICEP() throws IOException, InterruptedException {
    }

    public void setCep(String cep){
        this.cep = cep;
    }
    public String getCep(){
        return this.cep;
    }
    public void setUrl(String cep){
        this.url = "https://viacep.com.br/ws/"+cep+"/json/";
    }
    public String getUrl(){
        return this.url;
    }

    public String buscarEndereco() throws IOException, InterruptedException {
        HttpClient client =  HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(this.url)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        return response.body();
    }



}
