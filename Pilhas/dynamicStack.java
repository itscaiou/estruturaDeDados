public class dynamicStack {

    private static class No {
        int key;
        No prox;

        No(int key) {
            this.key = key;
            this.prox = null;
        }
    }

    private No top;
    private int tamanho;

    public dynamicStack() {
        criar();
    }

    public void criar() {
        top = null;
        tamanho = 0;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int x) {
        No novo = new No(x);

        novo.prox = top;
        top = novo;

        tamanho++;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Pilha vazia!");
        }

        int valorRemovido = top.key;
        top = top.prox;

        tamanho--;
        return valorRemovido;
    }

    public int tamanho() {
        return tamanho;
    }

    public static void main(String[] args) {
        dynamicStack pilha = new dynamicStack();

        System.out.println("A pilha está vazia? " + pilha.isEmpty());
        System.out.println("Tamanho da pilha: " + pilha.tamanho());

        System.out.println("Inserindo elementos: 10, 20, 30, 50, 80...");
        pilha.push(10);
        pilha.push(20);
        pilha.push(30);
        pilha.push(50);
        pilha.push(80);
        

        System.out.println("Tamanho: " + pilha.tamanho());
        System.out.println("Retirado: " + pilha.pop());   
        System.out.println("Retirado: " + pilha.pop());   
        System.out.println("Vazia? " + pilha.isEmpty());  
        System.out.println("Retirado: " + pilha.pop());   
        System.out.println("Vazia? " + pilha.isEmpty());  
        System.out.println("Tamanho: " + pilha.tamanho());
    }
}