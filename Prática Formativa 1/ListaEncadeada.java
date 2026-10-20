public class ListaEncadeada {
    private No inicio;
    
    public ListaEncadeada(){
        this.inicio = null;
    }

    public boolean estaVazia(){
        return inicio == null;
    }

    public void inserirInicio(Aluno aluno){
        No novoNo = new No(aluno);

        novoNo.setProximo(inicio);
        inicio = novoNo;
    }

    public void inserirFim(Aluno aluno){
        No novoNo = new No(aluno);

        if (estaVazia()){
            inicio = novoNo;
            return;
        }

        No atual = inicio;

        while (atual.getProximo() != null){
            atual = atual.getProximo();
        }

        atual.setProximo(novoNo);
    }

    public void removerInicio() {
        if (estaVazia()) {
            System.out.println("Não foi possível remover: lista vazia.");
            return;
        }

        inicio = inicio.getProximo();

        System.out.println("Primeiro aluno removido.");
    }

    public void removerFim() {
        if (estaVazia()) {
            System.out.println("Não foi possível remover: lista vazia.");
            return;
        }

        if (inicio.getProximo() == null) {
            inicio = null;

            System.out.println("Último aluno removido.");
            return;
        }

        No atual = inicio;

        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }

        atual.setProximo(null);

        System.out.println("Último aluno removido.");
    }

    public void remover(int matricula) {
        if (estaVazia()) {
            System.out.println("Não foi possível remover: lista vazia.");
            return;
        }

        if (inicio.getAluno().getMatricula() == matricula) {
            inicio = inicio.getProximo();

            System.out.println("Aluno removido.");
            return;
        }

        No anterior = inicio;
        No atual = inicio.getProximo();

        while (atual != null) {
            if (atual.getAluno().getMatricula() == matricula) {
                anterior.setProximo(atual.getProximo());

                System.out.println("Aluno removido.");
                return;
            }

            anterior = atual;
            atual = atual.getProximo();
        }

        System.out.println("Matrícula não encontrada.");
    }

    public Aluno buscar(int matricula){
        No atual = inicio;

        while (atual != null) {
            Aluno alunoAtual = atual.getAluno();

            if (alunoAtual.getMatricula() == matricula){
                return alunoAtual;
            }

            atual = atual.getProximo();
        }

        return null;
    }

    public void exibir(){
        if (estaVazia()){
            System.out.println("A lista está vazia.");
            return;
        }

        No atual = inicio;

        while(atual != null){
            Aluno aluno = atual.getAluno();

            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("-------");

            atual = atual.getProximo();
        }
    }

    public int tamanho(){
        int quantidade = 0;
        No atual = inicio;

        while (atual != null){
            quantidade++;
            atual = atual.getProximo();
        }

        return quantidade;
    }
}
