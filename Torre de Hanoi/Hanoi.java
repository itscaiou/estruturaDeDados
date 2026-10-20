public class Hanoi {

    private int cont = 0;

    public void estadoInicial(int discos, char origem, char aux, char destino){
        int discoAtual = discos;

        System.out.print("Estado Inicial: " + origem + " = ");

        while(discoAtual>0){
            System.out.print(discoAtual + " ");
            discoAtual--;
        }

        System.out.println();
        System.out.println(aux + " = Vazia");
        System.out.println(destino + " = Vazia");
    }

    public void hanoiRecursiva(int discos, char origem, char aux, char destino){

        if (discos > 0){
            hanoiRecursiva(discos-1, origem, destino, aux);
            System.out.println("Move de " +origem+ " para " +destino);
            cont ++;
            hanoiRecursiva(discos-1, aux, origem, destino);
        }
    }

    public void estadoFinal(int discos, char origem, char aux, char destino){
        int discoAtual = discos;

        System.out.print("Estado Final: " + destino + " = ");
        
        while (discoAtual > 0){
            System.out.print(discoAtual + " ");
            discoAtual--;
        }
        System.out.println();
        System.out.println(origem + " = Vazia");
        System.out.println(aux + " = Vazia");
    }

    public int exibirCont(){
        System.out.println("A quantidade de movimentos é: " +cont);
        return cont;
    }
}