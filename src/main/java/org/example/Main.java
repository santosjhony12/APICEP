package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        APICEP api = new APICEP();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o CEP: ");
        String cep = scanner.next();
        api.setUrl(cep);
        System.out.println(api.buscarEndereco());
    }
}