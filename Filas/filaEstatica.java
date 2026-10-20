// Implementação de Lista Circular Duplamente Encadeada

import javax.management.RuntimeErrorException;

public class filaEstatica {

    public static final int MAX = 100;
    private int[] data = new int[MAX];
    private int inicio;
    private int fim;
    private int n;

    public filaEstatica(){
        inicio = 0;
        fim = 0;
        n = 0;
    }

    public boolean isEmpty(){
        return n == 0;
    }

    public boolean isFull(){
        return n == MAX;
    }

    public void enfileirar(int x){
        if (isFull()){
            throw new RuntimeException("Fila cheia!");
        }
        data[fim] = x;
        fim = fim + 1;
        n = n + 1;
    }

    public int desenfileirar(){
        if (isEmpty()){
            throw new RuntimeException("A fila já está vazia!");
        }
        int x = data[inicio];
        inicio = inicio + 1;
        n = n - 1;
        return x;
    }

    public int frente(){
        if (isEmpty()){
            throw new RuntimeException("A fila está vazia!");
        }

        return data[inicio];
    }

    public int tamanho(){
        return n;
    }

    // Método principal
    public static void main(String[] args) {
        filaEstatica fila = new filaEstatica();

        System.out.println("Iniciando...");
        System.out.println("A fila está vazia? " + fila.isEmpty());


        System.out.println("Inserindo os elementos: 5, 10, 20 e 15");
        fila.enfileirar(5);
        fila.enfileirar(10);
        fila.enfileirar(20);
        fila.enfileirar(15);

        System.out.println("Após inserir: ");
        System.out.println("Tamanho: " + fila.tamanho());
        System.out.println("Está Vazia? " + fila.isEmpty());
        System.out.println("Frente da fila: " + fila.frente());

        System.out.println("Removendo Frente..." + fila.desenfileirar());

        System.out.println("Nova Frente: " + fila.frente());
        System.out.println("Tamanho atual: " + fila.tamanho());

        System.out.println("Inserindo 30...");
        fila.enfileirar(30);

        System.out.println("Tamanho atual: " + fila.tamanho());

        System.out.println("Removendo todos os elementos...");
        System.out.println("Removendo Frente..." + fila.desenfileirar());
        System.out.println("Frente da fila: " + fila.frente());
        System.out.println("Tamanho atual: " + fila.tamanho());
        System.out.println("Está Vazia? " + fila.isEmpty());
        System.out.println("---------------");

        System.out.println("Removendo todos os elementos...");
        System.out.println("Removendo Frente..." + fila.desenfileirar());
        System.out.println("Frente da fila: " + fila.frente());
        System.out.println("Tamanho atual: " + fila.tamanho());
        System.out.println("Está Vazia? " + fila.isEmpty());
        System.out.println("---------------");

        System.out.println("Removendo todos os elementos...");
        System.out.println("Removendo Frente..." + fila.desenfileirar());
        System.out.println("Frente da fila: " + fila.frente());
        System.out.println("Tamanho atual: " + fila.tamanho());
        System.out.println("Está Vazia? " + fila.isEmpty());
        System.out.println("---------------");

        System.out.println("Removendo todos os elementos...");
        System.out.println("Removendo Frente..." + fila.desenfileirar());
        System.out.println("Frente da fila: " + fila.frente());
        System.out.println("Tamanho atual: " + fila.tamanho());
        System.out.println("Está Vazia? " + fila.isEmpty());
        System.out.println("---------------");

    }
}