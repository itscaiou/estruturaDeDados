public class filaDinamica {
    private class No{
        int valor;
        No prox;

        No (int valor){
            this.valor = valor;
        }
    }

    private No inicio;
    private No fim; 
    private int tamanho;

    public boolean isEmpty(){
        return tamanho == 0;
    }

    public int tamanho(){
        return tamanho; 
    }

    public void enfileirar(int valor){
        No novo = new No(valor);

        if(isEmpty()){
            inicio = novo;
        } else {
            fim.prox = novo;
        }

        fim = novo;
        tamanho++;
    }

    public int desenfileirar(){
        if (isEmpty()){
            throw new IllegalStateException("Fila Vazia!");
        }

        No aux = inicio;
        int valor = aux.valor;

        inicio = aux.prox;

        if (inicio == null){
            fim = null;
        }

        aux.prox = null;
        tamanho--;
        return valor;
    }

    public void imprimir(){
        No atual = inicio;

        while (atual != null){
            System.out.print(atual.valor + " ");
            atual = atual.prox;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        filaDinamica filaD = new filaDinamica();

        System.out.println("A fila está vazia? " + filaD.isEmpty());
        System.out.println("Inserindo valores: 30, 12, 40, 55, 10");

        filaD.enfileirar(30);
        filaD.enfileirar(12);
        filaD.enfileirar(40);
        filaD.enfileirar(55);
        filaD.enfileirar(10);

        System.out.println("Status Atual: ");
        filaD.imprimir();
        System.out.println("Tamanho: " + filaD.tamanho());

        System.out.println("Desenfileirando");
        filaD.desenfileirar();

        System.out.println("Status Atual: ");
        filaD.imprimir();
        System.out.println("Tamanho: " + filaD.tamanho());
    }
}