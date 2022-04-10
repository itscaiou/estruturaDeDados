#include <iostream>
#include <vector>
#include <numeric>
#include <fstream>

using namespace std;

using std::cout; using std::cin;
using std::endl; using std::string;
using std::vector;

void printVector(vector<int> &elementos)
{
    for (const auto &item : elementos) {
        cout << item << ", ";
    }
    cout << endl;
}

/*
void invElementos(std::vector<int> elementos){
    for (size_t i = 0; i < elementos.size(); i--)
    {
        putchar(elementos);
    }
}
*/

void somaElementos(std::vector<int> elementos){
    int soma = accumulate(elementos.begin(), elementos.end(), 0);
    cout << "a soma dos elementos do vetor e = " << soma << endl;
}

void multiElementos(std::vector<int> elementos){
    int multi = 1;
    for (int i = 0; i < (int) elementos.size(); i++){
        multi = multi * elementos[i];
    }
    std::cout << "A multiplicacao dos elementos e: " << multi << '\n';;
}

void menorElemento(std::vector<int> elementos){
    int menor = 0;
    for (int i = 0; i < (int) elementos.size(); i++){
        if (menor > elementos[i]){
            menor = elementos[i];
        }
    }
    std::cout << "O menor valor so vetor e: " << menor << '\n';;
}

int main(){
    /*
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
    */

    vector<int> elementos = { 1, 2, 3 };

    printVector(elementos);

    somaElementos(elementos);
    multiElementos(elementos);
    menorElemento(elementos);
}