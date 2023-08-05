#include <iostream>

int main() {
    int number;

    // Ask the user to enter a number
    std::cout << "Enter a number: ";
    std::cin >> number;

    // Check if the number is even or odd
    if (number % 2 == 0) {
        std::cout << "Number is even." << std::endl;
    } else {
        std::cout << "Number is odd." << std::endl;
    }

    return 0;
}
