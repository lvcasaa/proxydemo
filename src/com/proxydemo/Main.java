package com.proxydemo;

public class Main {
    public static void main(String[] args) {
        Servico servico = new ServicoProxy();
        servico.executar();
    }
}
