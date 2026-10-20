public class Main {
    public static void main(String[] args) {
        int discos = 3;
        Hanoi hanoi = new Hanoi();

        hanoi.estadoInicial(discos, 'A', 'B', 'C');
        hanoi.hanoiRecursiva(discos, 'A', 'B', 'C');
        hanoi.estadoFinal(discos, 'A', 'B', 'C');
        hanoi.exibirCont();
    }
}

