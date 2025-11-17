---

# 💱 Conversor de Moeda

## 📘 Sobre

O **Conversor de Moeda** é um projeto para converter valores entre diferentes moedas (por exemplo, Real, Dólar, Euro, etc.). Ele realiza a conversão com base em taxas de câmbio (podendo ser estáticas ou obtidas de uma API externa) e trata validações de entrada (como garantir que o valor informado seja um número válido).

---

## 📑 Sumário

1. [Sobre](#-sobre)
2. [Objetivos do projeto](#-objetivos-do-projeto)
3. [Tecnologias utilizadas](#-tecnologias-utilizadas)
4. [Como usar](#-como-usar)
5. [Funcionalidades](#-funcionalidades)
6. [Estrutura do projeto](#-estrutura-do-projeto)
7. [Exemplo de uso](#-exemplo-de-uso)
8. [Contribuindo](#-contribuindo)
9. [Contato](#-contato)

---

## 🎯 Objetivos do projeto

* Criar uma ferramenta simples para converter valores entre diferentes moedas.
* Entender o funcionamento de requisições a APIs (caso use taxas em tempo real).
* Tratar entradas do usuário para evitar erros ou valores inválidos.
* Exibir o resultado da conversão de forma clara.

---

## 🧰 Tecnologias utilizadas

* **Linguagem:** Java
* **Requisições HTTP:** `HttpClient`
* **Processamento de JSON:** GSON
* **Formatação de números:** `DecimalFormat` ou classes de formatação nativas do Java

---

## 🚀 Como usar

1. Clone este repositório:

   ```bash
   git clone https://github.com/CalebeLouGer/conversor-de-moeda.git
   ```
2. Entre no diretório do projeto:

   ```bash
   cd conversor-de-moeda
   ```
3. Compile o projeto:

   ```bash
   mvn clean package    # ou `gradle build` conforme sua configuração
   ```
4. Execute a aplicação:

   ```bash
   java -jar target/conversor-de-moeda-<versão>.jar
   ```
5. Insira o valor que deseja converter, escolha a moeda de origem e destino, e visualize o resultado.

---

## ⚙️ Funcionalidades

* Conversão de valores entre diferentes moedas.
* Entrada de valor pelo usuário.
* Validação de entrada para garantir números válidos.
* Uso de taxas de câmbio estáticas ou dinâmicas (via API).
* Exibição clara do resultado da conversão.
  
---

## 🗂️ Estrutura do projeto

```
public/
 └─ src/
     ├─ br/com/classe
         └─ aplicacao/
         │    ├─ ConversorDeMoedas.java      # Classe principal
         └─ servico/
              ├─ ConversorApi.java           # Api
```

---

## 💡 Exemplo de uso

```
Digite o valor: 100  
Moeda de origem (ex: BRL, USD): BRL  
Moeda de destino (ex: EUR, USD): USD  

Resultado:
100,00 BRL = 18,70 USD   # (valor fictício, dependerá da taxa usada)
```

---

## 🤝 Contribuindo

Contribuições são muito bem-vindas! Você pode:

1. Fazer um **fork** do repositório.
2. Criar uma branch para sua funcionalidade:

   ```bash
   git checkout -b feature/minha-nova-moeda
   ```
3. Fazer commit das alterações:

   ```bash
   git commit -m "Adiciona suporte para peso argentino"
   ```
4. Enviar para seu fork:

   ```bash
   git push origin feature/minha-nova-moeda
   ```
5. Abrir um Pull Request explicando o que foi implementado.

---

## 📬 Contato

**👤 Calebe Lourenço**
📧 [calebelourenco581@gmail.com](mailto:calebelourenco581@gmail.com)
💼 [LinkedIn](https://www.linkedin.com/in/calebelouger)
💻 [GitHub](https://github.com/CalebeLouGer)

---
