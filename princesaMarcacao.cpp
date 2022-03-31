#include <iostream>
#include <vector>

void mostrarVetor(std::vector<int> vet, int espada){
    for (int i = 0; i < (int) vet.size(); i++)
    {
        std::cout << vet[i] << (i == espada? ">  " : "   ");
        std::cout << std::endl;
    }
    
}

int acharElementoVivo(std::vector<int>& v, int pos){
	do{
	    pos = (pos + 1) % v.size();
	} while(v[pos] == false);

	return pos;
}

int main (){
	int size {}, espada {};
	std::cin >> size >> espada;
	std::vector<int> vet(size, true);
	espada -= 1;
	int qtd = vet.size() - 1;

	while(qtd--) {
		mostrarVetor(vet, espada);
		espada = acharElementoVivo(vet, espada);
		vet[espada] = false;
		espada = acharElementoVivo(vet, espada);	
	}
}