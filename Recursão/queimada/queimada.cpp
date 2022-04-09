#include <iostream>
#include <vector>
#include <fstream>

using namespace std;

void mostrar(vector<string> mapa){
    for(auto line : mapa){
        cout << line << '\n';
        getchar();
    }
}

void queimada(vector<string>& mapa, int linhaPos, int colunaPos){
    int nl = mapa.size();
    int nc = mapa[0].size();
    if (linhaPos < 0 || linhaPos >= nl || colunaPos < 0 || colunaPos >= nc)
        return;
    
    if (mapa [linhaPos] [colunaPos] != '#')
        return;

    mapa [linhaPos] [colunaPos] = 'x';
    mostrar(mapa);
    
    queimada(mapa, linhaPos, colunaPos - 1);
    queimada(mapa, linhaPos - 1, colunaPos);
    queimada(mapa, linhaPos, colunaPos + 1);
    queimada(mapa, linhaPos + 1, colunaPos);

    mapa [linhaPos] [colunaPos] = '*';
    mostrar(mapa);
}

int main(){
    vector<string> mapa;
    ifstream arquivo("imput.txt");
    int nl { }, nc { }, lInicial { }, cInicial{ };
    arquivo >> nl >> nc >> lInicial >> cInicial;

    for(int i = 0; i < nl; i++){
        string line;
        arquivo >> line;
        mapa.push_back(line);
    }

    mostrar(mapa);
    queimada(mapa, lInicial, cInicial);

}