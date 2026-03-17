# 🚗 Sistema de Veículos em Java

Projeto simples desenvolvido para praticar **Programação Orientada a Objetos (POO)** em Java.

O sistema simula diferentes tipos de veículos utilizando **herança**, onde cada veículo possui comportamentos específicos.

---

## 📚 Conceitos de POO utilizados

Este projeto aplica alguns dos principais conceitos da Programação Orientada a Objetos:

* 🔹 **Herança** (`extends`)
* 🔹 **Encapsulamento**
* 🔹 **Sobrescrita de métodos** (`@Override`)
* 🔹 **Uso de `super`**
* 🔹 **Interação com usuário usando `Scanner`**
* 🔹 **Estruturas condicionais (`switch`)**

---

## 🧩 Estrutura do Projeto

A estrutura de classes segue o modelo abaixo:

```
Veiculo
│
├── Carro
├── Moto
└── Caminhao
```

### 📦 Classes

**Veiculo**

* Classe base do sistema
* Contém informações comuns a todos os veículos:

  * marca
  * modelo
  * ano
  * método para ligar o veículo

**Carro**

* Herda de `Veiculo`
* Possui:

  * número de portas
  * método para abrir o porta-malas

**Moto**

* Herda de `Veiculo`
* Possui:

  * cilindradas
  * método para empinar a moto

**Caminhao**

* Herda de `Veiculo`
* Possui:

  * capacidade de carga
  * método para transportar carga

**VeiculosMain**

* Classe responsável por executar o programa
* Realiza interação com o usuário através do `Scanner`

---

## ▶️ Exemplo de funcionamento

O programa permite ao usuário:

* visualizar os dados dos veículos
* ligar ou não os veículos
* abrir o porta-malas do carro
* empinar a moto
* informar carga transportada pelo caminhão

Exemplo de interação no terminal:

```
Deseja abrir o porta malas? (s/n)
s
O porta malas foi aberto

Deseja ligar o veículo? (s/n)
s
O veículo foi ligado
```

---

## 🛠️ Tecnologias utilizadas

* **Java**
* **Programação Orientada a Objetos**
* **Scanner (entrada de dados)**

---

## 🎯 Objetivo do projeto

Este projeto foi criado com o objetivo de **praticar conceitos fundamentais de POO em Java**, especialmente **herança e organização de classes**.

---

## 👨‍💻 Autor

**Jonathan Leão de Oliveira Júnior**

Projeto desenvolvido para estudos de **Programação Orientada a Objetos em Java**.

