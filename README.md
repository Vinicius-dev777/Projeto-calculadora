# Projeto Calculadora — FinançApp

> Projeto acadêmico desenvolvido com foco em Qualidade de Software, Testes, Refatoração, Documentação e Versionamento.

Esta é a branch `main`, com a versão original do projeto. A versão refatorada, com JavaDoc, está na branch `Refatoracao`.

---

## 1. Identificação do Projeto

**Projeto:** Projeto Calculadora  
**Contexto:** FinançApp  
**Aluno:** Vinicius Teixeira Melo  
**RA:** 251136  
**Curso:** Análise e Desenvolvimento de Sistemas (ADS)  
**Disciplina:** UX/UI e Testes de Software  
**Professor:** Daniel Ohata  
**Semestre:** 2026.2

---

## 2. Visão Geral

O projeto consiste no desenvolvimento de um módulo de cálculos matemáticos básicos em Java para a startup fictícia **FinançApp**, a ser utilizado em funcionalidades de controle financeiro, como:

- orçamento mensal;
- divisão de despesas;
- projeções financeiras;
- cálculos auxiliares.

Além do funcionamento correto das operações, o projeto aplica testes, tratamento de erros, refatoração, documentação e versionamento.

---

## 3. Problema

Durante o desenvolvimento do FinançApp, foi identificada a necessidade de um módulo matemático reutilizável, com código legível, testes, tratamento de falhas, documentação técnica, controle de versões e facilidade de manutenção.

---

## 4. Objetivo

### 4.1 Objetivo Geral

Desenvolver uma calculadora em Java aplicando práticas de qualidade, testes, documentação, refatoração e versionamento.

### 4.2 Objetivos Técnicos

- implementar operações matemáticas básicas;
- tratar entradas inválidas;
- impedir divisão por zero;
- desenvolver testes com entradas, resultado esperado e resultado obtido;
- refatorar o código sem alterar seu comportamento;
- documentar classes e métodos com JavaDoc;
- gerar documentação HTML;
- utilizar Git e GitHub;
- organizar commits e branches.

---

## 5. Escopo Funcional

O método `calc(int a, int b, String op)` recebe dois números inteiros e o operador:

| ID   | Funcionalidade       | Descrição                                     | Status |
| ---- | -------------------- | --------------------------------------------- | ------ |
| RF01 | Soma (`+`)           | Soma dois números inteiros                    | ✅ |
| RF02 | Subtração (`-`)      | Subtrai dois números inteiros                 | ✅ |
| RF03 | Multiplicação (`*`)  | Multiplica dois números inteiros              | ✅ |
| RF04 | Divisão (`/`)        | Divide dois números inteiros                  | ✅ |
| RF05 | Validação de divisão | Impede divisão por zero, com mensagem de erro | ✅ |
| RF06 | Operação inválida    | Trata operadores não suportados, com mensagem | ✅ |

---

## 6. Requisitos Não Funcionais

| ID    | Categoria      | Requisito                                                  |
| ----- | -------------- | ---------------------------------------------------------- |
| RNF01 | Qualidade      | O código deve possuir organização e legibilidade           |
| RNF02 | Testabilidade  | As operações devem possuir testes                          |
| RNF03 | Manutenção     | O código deve permitir refatoração sem alteração funcional |
| RNF04 | Documentação   | Classes e métodos devem possuir JavaDoc                    |
| RNF05 | Versionamento  | O projeto deve utilizar Git e GitHub                       |
| RNF06 | Confiabilidade | Erros não devem interromper a execução                     |

---

## 7. Tecnologias Utilizadas

| Tecnologia | Versão       | Utilização                  |
| ---------- | ------------ | --------------------------- |
| Java       | 17.0.12 LTS  | Desenvolvimento             |
| JDK        | 17.0.12      | Compilação                  |
| Git        | 2.56.0       | Controle de versão          |
| GitHub     |Plataforma web| Repositório remoto        |
| JavaDoc    | 17.0.12      | Documentação                |
| VS Code    | 1.143.1      | Ambiente de desenvolvimento |

---

## 8. Estrutura do Projeto

```
Projeto_Calculadora/
├── src/
│   └── calculadora/
│       ├── Calculadora.java
│       └── TesteCalculadora.java
├── images/
│   └── testes/
├── README.md
└── .gitignore
```

---

## 9. Testes

A classe `TesteCalculadora` cobre soma, subtração, multiplicação, divisão, divisão por zero e operação inválida, exibindo a entrada utilizada, o resultado esperado e o resultado obtido.

![Execução dos testes na main](images/testes/teste_main.png)

---

## 10. Documentação JavaDoc

A documentação JavaDoc (pasta `docs/`, com `index.html`) e os prints dela estão na branch `Refatoracao`.

---

## 11. Branches

- `main`: versão original, sem refatoração.
- `Refatoracao`: versão refatorada, com comentários, JavaDoc e documentação HTML.

---

## 12. Link do Repositório

https://github.com/Vinicius-dev777/Projeto-calculadora