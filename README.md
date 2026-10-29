# 📚 Sistema de Gerenciamento de Biblioteca

Projeto de estudo em Java, em estágio inicial, voltado à prática de orientação a objetos e à modelagem de entidades de uma biblioteca.

## Estado atual

O código contém classes de domínio. **Ainda não é um sistema de gerenciamento funcional:** a classe `Main` apenas imprime `Hello, World!`.

### Implementado

- `Pessoa`: dados pessoais, construtor e métodos de acesso.
- `Autor`: herda de `Pessoa` e mantém uma lista de livros.
- `Cliente`: herda de `Pessoa` e possui identificador.
- `Livro`: ISBN, título, autor e categoria.
- Relações entre objetos e uso de `ArrayList`.

### Ainda não implementado

- Menu e entrada de dados pelo usuário.
- Cadastro, pesquisa e remoção de livros em um catálogo.
- Fluxo de empréstimos e devoluções.
- Persistência em arquivos ou banco de dados.
- Validações e testes automatizados.

O arquivo [Instruçoes.txt](Instru%C3%A7oes.txt) registra ideias de planejamento; não é uma lista de funcionalidades concluídas.

## Como compilar e executar

Requisitos: JDK 8 ou superior, com `javac` e `java` disponíveis no terminal.

Na raiz do repositório:

```sh
javac -encoding UTF-8 -d out main/src/*.java
java -cp out Main
```

Saída atual esperada:

```text
Hello, World!
```

A execução ainda não demonstra as classes de domínio em uso.

## Organização

| Caminho | Conteúdo |
| --- | --- |
| `main/src/` | Classes Java |
| `main/.vscode/` | Configuração do projeto no VS Code |
| `Instruçoes.txt` | Planejamento inicial |
| `LICENSE` | Licença do projeto |

## Objetivo de aprendizado

Praticar classes, encapsulamento, herança, associação entre objetos e coleções, evoluindo gradualmente a partir da estrutura existente.
