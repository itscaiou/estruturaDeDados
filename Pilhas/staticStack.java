public class staticStack {
    public static final int MAX = 100;
    private int[] data = new int[MAX];
    private int top;

    public staticStack() {
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == MAX - 1;
    }

    public void push(int x){
        if (isFull()){
            throw new RuntimeException("Estouro de pilha - overflow");
        }

        top = top + 1;
        data[top] = x;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("A pilha ja está vazia.");
        }

        int removido = data[top];
        top = top - 1;
        return removido;
    }

    public static void main(String[] args) {
        staticStack s = new staticStack();

        System.out.println("A pilha está vazia? " + s.isEmpty());

        System.out.println("Inserindo: 6");
        s.push(6);

        System.out.println("A pilha está cheia? " + s.isFull());
        System.out.println("A pilha está vazia? " + s.isEmpty());

    }
}
