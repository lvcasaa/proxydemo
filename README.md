# ProxyDemo

Este projeto demonstra a implementação do padrão de projeto **Proxy** em Java.

O Proxy é usado para controlar o acesso a um objeto real, adicionando lógica extra como **lazy loading** (instanciação tardia), controle de acesso, cache, etc.

---

## 🧠 Padrão Utilizado

**Proxy** – Cria um substituto (proxy) que controla o acesso a outro objeto.  
Neste exemplo, usamos um **Proxy Virtual**, que cria o objeto real apenas quando necessário.

---

## 📁 Estrutura dos Arquivos
src/

└── main/

└── java/

└── com/

└── seu_usuario/

└── proxydemo/

├── Servico.java # Interface comum

├── ServicoReal.java # Implementação real

├── ServicoProxy.java # Proxy que controla o acesso

└── Main.java # Classe de teste principal


---

## 🚀 Como Executar

1. Compile os arquivos:
   ```bash
    javac -d bin src/main/java/com/seu_usuario/proxydemo/*.java
   ```
2. Rode a aplicação:
```bash
    java -cp bin com.seu_usuario.proxydemo.Main
```

## ✅ O que você verá no console
Criando instância do serviço real (lazy)...

Acessando via proxy...

Executando serviço real...


A primeira chamada instancia o objeto real.
Chamadas posteriores apenas acessam via proxy.
