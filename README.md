# 🧮 Calculadora Java (Swing)

Projeto de uma calculadora desktop desenvolvida em Java, focada na aplicação de **Padrões de Projeto (Design Patterns)** e conceitos modernos da linguagem.

<img width="234" height="317" alt="Image" src="https://github.com/user-attachments/assets/ae2dc4e9-1b39-4af4-96a3-28b3ecc0e692" />

## 🚀 Tecnologias e Conceitos Aplicados

O objetivo principal foi estudar e aplicar arquitetura de software:

* **Java** 
* **Java Swing** (Interface Gráfica)
* **Padrão Observer:** Desacoplamento total entre a lógica (`Memoria`) e a interface (`Display`).
* **Padrão Singleton:** Garante que exista apenas uma instância da memória da calculadora rodando.
* **Enums com Interfaces Funcionais (Lambdas):** Substituição de cadeias complexas de `if/else` por Polimorfismo. Cada operação matemática (`SOMA`, `SUB`, etc.) sabe como se executar.

## 🛠️ Estrutura do Código

O projeto está organizado seguindo o padrão MVC (simplificado):

* `modelo`: Contém a lógica de negócios (`Memoria`, `TipoComando`).
* `visao`: Contém a interface gráfica (`Calculadora`, `Display`, `Teclado`, `Botao`).

## 💻 Como Executar

1.  Clone este repositório:
    ```bash
    git clone [https://github.com/JaneKaryelle/calculadora-java.git](https://github.com/JaneKaryelle/calculadora-java.git)
    ```
2.  Abra o projeto na sua IDE (IntelliJ, Eclipse ou VS Code).
3.  Execute a classe principal:
    `src/br/com/cod3r/calc/visao/Calculadora.java`

## ✨ Funcionalidades

- [x] Operações básicas (Soma, Subtração, Multiplicação, Divisão)
- [x] Tratamento de números decimais (vírgula)
- [x] Botão AC (Clear) para limpar a memória
- [x] Interface responsiva e estilizada

---
Desenvolvido por **[Jane Karyelle](https://github.com/JaneKaryelle)**
