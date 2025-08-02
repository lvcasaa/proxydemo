package com.proxydemo;

public class ServicoProxy implements Servico {
    private ServicoReal servicoReal;

    @Override
    public void executar() {
        if (servicoReal == null) {
            System.out.println("Criando instância do serviço real (lazy)...");
            servicoReal = new ServicoReal();
        }
        System.out.println("Acessando via proxy...");
        servicoReal.executar();
    }
}
