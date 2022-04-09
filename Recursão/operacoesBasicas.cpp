#include <iostream>
#include <vector>

using std::cout; using std::cin;
using std::endl; using std::string;
using std::vector;

/*/
void trocaElementos(std::vector<int> vet){
    int size2;
    std::vector<int> vetInv(size2);
    for (int i = 0; i < (int) vet.size(); i++){
        
    }
}
*/
void somaElementos(std::vector<int> vet){
    int soma = 0;
    for (int i = 0; i < (int) vet.size(); i++){
        soma = soma + vet[i];
    }
    std::cout << soma << '\n';
}

void multiElementos(std::vector<int> vet){
    int multi = 1;
    for (int i = 0; i < (int) vet.size(); i++){
        multi = multi * vet[i];
    }
    std::cout << multi << '\n';;
}

void menorElemento(std::vector<int> vet){
    int menor = 0;
    for (int i = 0; i < (int) vet.size(); i++){
        if (menor < vet[i]){
            menor = vet[i];
        }
    }
    std::cout << menor << '\n';;
}

int main(){
    int size {};
	std::cin >> size;
	std::vector<int> vet(size);
    //trocaElementos(vet);
    for (int i = 0; i < (int) vet.size(); i++){
    std::cout << vet[i];
    somaElementos(vet);
    multiElementos(vet);
    menorElemento(vet);
    }
}