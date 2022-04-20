#include <iostream>
#include <sstream>
#include <vector>
#include <algorithm>

using namespace std;
using matriz = vector<string>;

struct Pos{
    int l, c;
    Pos(int l, int c): l(l), c(c){}

};

vector<Pos> olharVizinhos(Pos p){
        auto [l, c] = p;
        return {{l, c - 1}, {l - 1, c}, {l, c + 1}, {l + 1, c}};
}

vector<Pos> shuffle(vector<Pos> vet){ //função inplace, ou seja, não retorna, porém nesse exemplo retorna a cópia do vetor original embaralhado.
    random_shuffle(begin(vet), end(vet));
    return vet;
}

bool podeFurar(matriz& mat, Pos p){
    int nl = mat.size();
    int nc = mat[0].size();
    int cont = { 0 };
    for (auto viz : olharVizinhos(p)){
        auto [l, c] = viz;
         if (nl < 0 || nl >= l || nc < 0 || nc >= c){
             continue;
        }
        if(mat[viz.l][viz.c] = '#'){
            cont =+ 1;
        }
        return (cont >= 3);
    }
}

void perfurar(matriz& mat, Pos p){
    int nl = mat.size();
    int nc = mat[0].size();

    auto [l, c] = p;

    if (nl < 0 || nl >= l || nc < 0 || nc >= c){
        return; // Verifica se as linhas e colunas estão dentro dos limites da matriz.
    }
    if (mat [l] [c] != '#'){
        return; // Verifica se alguma parede já foi furada.
    }
    if (!podeFurar(mat, p)){
        return;
    }
    mat [l] [c] = '.';
    mostrar(mat);
    for( auto vizinho : shuffle(olharVizinhos(p))){
        perfurar(mat, vizinho); // chama a função perfurar para cada vizinho.
    }

}

void mostrar(matriz& mat){
    for(auto line : mat){
        cout << line << '\n';
        getchar();
    }
}

int main(int argc, char * argv[]){
    if (argc != 3){
        cout << "argumentos Invalidos";

        exit(1);
    }


    int nl { 0 }, nc { 0 };

    stringstream (argv[1]) >> nl;
    stringstream (argv[2]) >> nc;

    vector<string> mat(nl, string(nc, '#'));

    for(auto line : mat){
        cout << line << '\n';
    }

    perfurar(mat, Pos(1, 1));

}