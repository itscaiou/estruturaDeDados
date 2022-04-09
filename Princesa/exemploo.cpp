#include <iostream>

int main(){
    std::cout << "Digite um inteiro e um nome\n";

    int x{};
    std::string nome{};

    std::cin >> x >> nome;
    std::cout << "voce digitou: " << x << " e " << nome << '\n';
}