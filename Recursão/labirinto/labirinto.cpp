#include <iostream>
#include <vector>
#include <fstream>
using namespace std;

struct Pos{
    int l;
    int c;
};

void caminho(vector<string> mat, int linhaPos, int colunaPos){
    int nl = mat.size();
    int nc = mat[0].size();

    if (linhaPos < 0 || linhaPos >= nl || colunaPos < 0 || colunaPos >= nc)
        return;

    if (mat [linhaPos] [colunaPos] != '#')
        return;

    mat [linhaPos] [colunaPos] = '.';
    
    caminho(mat, linhaPos, colunaPos - 1);
    caminho(mat, linhaPos - 1, colunaPos);
    caminho(mat, linhaPos, colunaPos + 1);
    caminho(mat, linhaPos + 1, colunaPos);

}

//retorna um vetor com todos os vizinhos da posição p
vector<Pos> get_vizinhos(Pos p){
    return {{p.l, p.c - 1}, {p.l - 1, p.c}, {p.l, p.c + 1}, {p.l + 1, p.c}};
}


int main(){
    int nl = 0, nc = 0;
    cin >> nl >> nc;
    vector<string> mat(nl, ""); //começa com nl strings ""
    getchar();//remove \n after nc
    Pos inicio, fim;
    

    //carregando matriz
    for(int i = 0; i < nl; i++)
        getline(cin, mat[i]);

    //procurando inicio e fim e colocando ' ' nas posições iniciais
    for(int l = 0; l < nl; l++){
        for(int c = 0; c < nc; c++){
            if(mat[l][c] == 'I'){
                mat[l][c] = '_';
                inicio = Pos {l, c};
            }
            if(mat[l][c] == 'F'){
                mat[l][c] = '_';
                fim = Pos {l, c};
            }
        }
    }

    caminho(mat, inicio.l, fim.l);

    for(string line : mat)
        cout << line << endl;
    cout << "       nl=" << nl << " nc=" << nc << "\n";
    cout << "inicio: l=" << inicio.l << " , c=" << inicio.c << endl;
    cout << "   fim: l=" << fim.l << " , c=" << fim.c << endl;
}