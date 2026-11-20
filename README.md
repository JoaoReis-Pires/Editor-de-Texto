# Editor de Texto com Padrão de Projeto Memento

## Sobre o projeto

Este projeto foi desenvolvido para a disciplina de **Análise e Projeto Orientado a Objetos (APOO)** do Instituto Federal de São Paulo (IFSP) – Campus São Carlos.

O objetivo é demonstrar, por meio de uma aplicação simples em Java, o funcionamento do **padrão de projeto Memento**, um padrão comportamental que permite salvar e restaurar estados anteriores de um objeto sem comprometer seu encapsulamento.

A aplicação simula um editor de texto que possibilita realizar alterações, criar backups e recuperar versões anteriores do conteúdo.

## Funcionalidades

- Escrever e modificar o conteúdo de um texto.
- Salvar o estado atual do editor.
- Armazenar diferentes versões do texto.
- Restaurar estados anteriores.
- Gerenciar o histórico de alterações utilizando uma pilha.

## Padrão Memento

O padrão Memento permite armazenar o estado interno de um objeto para que ele possa ser restaurado posteriormente.

A implementação utiliza os seguintes componentes:

| Componente | Classe | Responsabilidade |
|---|---|---|
| Originator | `Editor` | Gerencia o texto e cria ou restaura estados. |
| Memento | `Memento` | Interface que define as informações acessíveis sobre os backups. |
| ConcreteMemento | `ConcreteMemento` | Armazena o estado salvo do editor. |
| Caretaker | `Caretaker` | Gerencia os backups sem manipular diretamente seus dados internos. |
| Client | `Main` | Executa a aplicação e demonstra seu funcionamento. |

### Funcionamento

1. O usuário modifica o conteúdo do editor.
2. O `Caretaker` solicita ao `Editor` que salve seu estado.
3. O `Editor` cria um `ConcreteMemento` contendo o texto atual.
4. O `Caretaker` armazena o Memento em uma pilha.
5. O usuário realiza novas alterações.
6. Ao solicitar a restauração, o último Memento é recuperado.
7. O `Editor` restaura o conteúdo armazenado nesse Memento.

Dessa forma, o histórico gerencia os backups sem precisar conhecer os detalhes internos do editor.

## Tecnologias utilizadas

- **Java:** linguagem de programação.
- **Programação Orientada a Objetos:** organização das classes e responsabilidades.
- **Padrão Memento:** gerenciamento e restauração de estados.
- **Java Collections Framework:** utilização de `Deque` e `ArrayDeque` para armazenar os backups.

## Estrutura de arquivos

```text
EditorTextoMemento/
│
├── Editor.java
├── Memento.java
├── ConcreteMemento.java
├── Caretaker.java
├── Main.java
└── README.md
```

## Como executar

**Pré-requisito:** possuir o JDK instalado.

1. Clone o repositório ou baixe os arquivos do projeto.
2. Abra um terminal na pasta que contém os arquivos `.java`.
3. Compile o projeto:

```bash
javac *.java
```

4. Execute a aplicação:

```bash
java Main
```

## Exemplo de execução

Inicialmente, o editor recebe o texto:

```text
Olá
```

Depois de salvar um backup, o conteúdo é modificado para:

```text
Olá, mundo!
```

Um novo backup é criado e o texto é alterado novamente:

```text
Olá, mundo! Estou estudando Memento.
```

Ao restaurar o último estado salvo, o conteúdo volta para:

```text
Olá, mundo!
```

Realizando outra restauração, o editor retorna para:

```text
Olá
```

Esse comportamento demonstra como o Memento permite recuperar diferentes estados anteriores de um objeto.

## Vantagens e limitações

**Vantagens:**
- Preserva o encapsulamento dos objetos.
- Facilita a implementação de funcionalidades de desfazer.
- Separa o gerenciamento do histórico da manipulação do estado.
- Permite restaurar versões anteriores de maneira organizada.

**Limitações:**
- O armazenamento de muitos estados pode aumentar o consumo de memória.
- Estados complexos podem exigir mecanismos adicionais de cópia.
- O histórico precisa ser gerenciado adequadamente para evitar armazenamento desnecessário.

## Possíveis melhorias

- Implementar a funcionalidade de refazer (`redo`).
- Criar uma interface gráfica para o editor.
- Permitir salvar e carregar documentos.
- Limitar a quantidade de backups armazenados.
- Registrar automaticamente os estados antes de cada alteração.

## Objetivo acadêmico

Este projeto possui finalidade didática e busca demonstrar a aplicação prática do padrão Memento, destacando conceitos de orientação a objetos, como **encapsulamento, abstração, separação de responsabilidades e reutilização de código**.

**Disciplina:** Análise e Projeto Orientado a Objetos (APOO)  
**Professor:** Prof. Dr. Lucas Oliveira  
**Instituição:** Instituto Federal de São Paulo (IFSP) – Campus São Carlos

## Referências

- GAMMA, Erich et al. *Design Patterns: Elements of Reusable Object-Oriented Software*. Addison-Wesley, 1994.
- REFACTORING.GURU. *Memento*. Disponível em: https://refactoring.guru/pt-br/design-patterns/memento
