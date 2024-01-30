package br.com.nogueira;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        TodoClient todoClient = new TodoClient();
        System.out.println(todoClient.findAll());
    }
}