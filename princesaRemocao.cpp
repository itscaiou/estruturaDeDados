#include <iostream>
#include <vector>

void mostrarVetor(std::vector<int> vet, int espada){
    for (int i = 0; i < (int) vet.size(); i++)
    {
        std::cout << vet[i] << (i == espada? ">  " : "   ");
        std::cout << std::endl;
    }
    
}

int main (){
	int size {}, espada {};

	std::cin >> size >> espada;
	std::vector<int> vet(size);
	
    for (int i = 0; i < size; i++)
		vet[i] = i + 1;
	espada -= 1;

	int qtd = vet.size() - 1;

	while(qtd--) {
		mostrarVetor(vet, espada);
		espada = (espada + 1) % vet.size();
		vet.erase(vet.begin() + espada); 
		espada = espada % vet.size();	
	}
	
}
