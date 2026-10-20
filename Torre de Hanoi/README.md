# Torre de Hanói em Java

Projeto acadêmico desenvolvido para a disciplina de **Estrutura de Dados**, com foco na resolução do problema da Torre de Hanói por meio de **recursividade**.

A aplicação funciona no terminal e apresenta o estado inicial das torres, a sequência de movimentos, o estado final esperado e a quantidade de movimentos realizados.

## O problema

A Torre de Hanói é um quebra-cabeça formado por três torres e discos de tamanhos diferentes. Inicialmente, todos os discos estão na torre de origem, organizados do maior, na base, para o menor, no topo.

O objetivo é transferir todos os discos para a torre de destino, utilizando uma torre auxiliar e respeitando três regras:

1. Mover apenas um disco por vez.
2. Retirar somente o disco que está no topo de uma torre.
3. Nunca colocar um disco maior sobre um menor.

## Funcionalidades

- Exibição da distribuição inicial dos discos.
- Geração recursiva dos movimentos entre as torres.
- Impressão da origem e do destino de cada movimento.
- Exibição da distribuição final esperada.
- Contagem e apresentação do total de movimentos.

Na configuração inicial do projeto, são utilizados **3 discos**, com a torre **A** como origem, **B** como auxiliar e **C** como destino.

## Como o algoritmo funciona

Para transferir `n` discos da origem para o destino, o método `hanoiRecursiva` divide o problema em três etapas:

1. Transferir `n - 1` discos da origem para a torre auxiliar, utilizando o destino como apoio.
2. Mover o maior disco restante da origem para o destino.
3. Transferir os `n - 1` discos da torre auxiliar para o destino, utilizando a origem como apoio.

As chamadas recursivas trocam os papéis das torres em cada etapa. Quando a quantidade de discos chega a zero, a condição `discos > 0` deixa de ser atendida e a chamada termina sem realizar movimentos.

Para uma quantidade positiva de discos, a solução produz o número mínimo de movimentos:

```text
M(n) = 2^n - 1
```

Com 3 discos, são necessários **7 movimentos**.

## Conceitos aplicados

- **Recursividade:** redução do problema até o caso base.
- **Pilha de chamadas:** controle das chamadas recursivas pelo ambiente de execução do Java.
- **Orientação a objetos:** separação entre a classe responsável pelo algoritmo e a classe que inicia o programa.
- **Estruturas de repetição:** utilização de `while` para exibir os discos nos estados inicial e final.
- **Encapsulamento:** contador de movimentos armazenado em um atributo privado.
- **Análise de complexidade:** tempo `O(2^n)` e espaço auxiliar `O(n)`, considerando a pilha de chamadas recursivas.

## Organização do projeto

| Arquivo | Responsabilidade |
| --- | --- |
| `Main.java` | Define a quantidade de discos e os nomes das torres, instancia `Hanoi` e organiza a execução. |
| `Hanoi.java` | Implementa o algoritmo recursivo, a exibição dos estados e a contagem dos movimentos. |

Os principais métodos da classe `Hanoi` são:

| Método | Função |
| --- | --- |
| `estadoInicial` | Imprime os discos na origem e informa que as outras torres estão vazias. |
| `hanoiRecursiva` | Gera e imprime os movimentos, incrementando o contador a cada movimentação. |
| `estadoFinal` | Imprime a configuração final esperada, com todos os discos no destino. |
| `exibirCont` | Exibe e retorna a quantidade de movimentos contabilizados. |

## Tecnologias

- Java.
- Entrada da configuração pelo código e saída pelo terminal.
- Sem bibliotecas externas.

## Como executar

É necessário ter um **JDK instalado**, com os comandos `javac` e `java` disponíveis no terminal.

Na pasta que contém `Main.java` e `Hanoi.java`, compile os arquivos:

```bash
javac -encoding UTF-8 Main.java Hanoi.java
```

Execute o programa:

```bash
java Main
```

### Exemplo de saída

Com os 3 discos definidos em `Main.java`:

```text
Estado Inicial: A = 3 2 1
B = Vazia
C = Vazia
Move de A para C
Move de A para B
Move de C para B
Move de A para C
Move de B para A
Move de B para C
Move de A para C
Estado Final: C = 3 2 1
A = Vazia
B = Vazia
A quantidade de movimentos é: 7
```

### Alterando a quantidade de discos

Edite a variável `discos` no método `main` de `Main.java`:

```java
int discos = 3;
```

Utilize um número inteiro positivo e compile novamente após a alteração. A quantidade de movimentos cresce exponencialmente conforme novos discos são adicionados.

## Escopo da implementação

- A solução gera uma **simulação textual** dos movimentos. As torres não são armazenadas em pilhas ou outras estruturas de dados explícitas; a pilha utilizada na recursão é a pilha de chamadas do Java.
- Os métodos de exibição imprimem os estados a partir dos parâmetros recebidos, sem consultar ou validar uma representação interna das torres.
- A quantidade de discos é definida no código, sem leitura pelo teclado ou validação de valores inválidos.
- O contador pertence à instância de `Hanoi` e acumula movimentos entre chamadas. Para uma nova resolução com contagem independente, deve ser criada uma nova instância.

## Possíveis melhorias

- Permitir que o usuário informe a quantidade de discos pelo terminal.
- Validar a entrada para aceitar apenas números inteiros positivos.
- Disponibilizar uma operação para reiniciar o contador.
- Representar cada torre com uma pilha e mostrar sua configuração após cada movimento.

## Autor

Desenvolvido por **Caio Victor** como atividade acadêmica de Estrutura de Dados.
