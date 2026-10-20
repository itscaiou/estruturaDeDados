public class Main {

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();

        System.out.println("A lista está vazia? " + lista.estaVazia());
        System.out.println("Tamanho: " + lista.tamanho());

        Aluno aluno1 = new Aluno(101, "Ana", 8.5);
        Aluno aluno2 = new Aluno(102, "Bruno", 7.0);
        Aluno aluno3 = new Aluno(103, "Carla", 9.5);
        Aluno aluno4 = new Aluno(104, "Diego", 6.5);


        System.out.println("INSERINDO ALUNOS NO INICIO");
        lista.inserirInicio(aluno2);
        lista.inserirInicio(aluno1);
        

        System.out.println("\nSTATUS ATUAL:");
        lista.exibir();
        System.out.println("Tamanho atual: " + lista.tamanho());
        System.out.println("A lista está vazia? " + lista.estaVazia());

        System.out.println("\n///////////");

        System.out.println("INSERINDO ALUNOS NO FINAL");
        lista.inserirFim(aluno3);
        lista.inserirFim(aluno4);

        System.out.println("\nSTATUS ATUAL: ");
        lista.exibir();
        System.out.println("Tamanho atual: " + lista.tamanho());
        System.out.println("A lista está vazia? " + lista.estaVazia());

        System.out.println("\n//////////////");

        System.out.println("STATUS ATUAL: ");
        System.out.println("Tamanho atual: " + lista.tamanho());
        System.out.println("A lista está vazia? " + lista.estaVazia());

        System.out.println("BUSCA:");
        System.out.println(lista.buscar(103));

        System.out.println("\n/////////");

        System.out.println("REMOVENDO DO INICIO");
        lista.removerInicio();
        System.out.println("\nSTATUS ATUAL:");
        lista.exibir();
        System.out.println("Tamanho atual: " + lista.tamanho());
        System.out.println("Está vazia? " + lista.estaVazia());

        System.out.println("\n///////////");
        
        System.out.println("REMOVENDO DO FIM: ");
        lista.removerFim();

        System.out.println("\nSTATUS ATUAL:");
        lista.exibir();

        System.out.println("REMOVENDO MATRICULA ESPECÍFICA: 103");
        lista.remover(103);


        System.out.println("\nSTATUS FINAL: ");
        lista.exibir();
        System.out.println("A lista está vazia? " + lista.estaVazia());
        System.out.println("Tamanho da lista: " + lista.tamanho());
    }
}