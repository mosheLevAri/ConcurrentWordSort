# SortWords

SortWords is a Java application that demonstrates the sorting and processing of words from multiple text files. It utilizes interfaces, adheres to SOLID principles, and follows object-oriented programming (OOP) concepts, making it a robust and maintainable solution.

## Overview

SortWords provides a flexible and extensible framework for sorting words. It consists of several modules that handle specific functionalities, including file reading, word sorting, frequent word finding, and overall word processing. These modules are designed to be highly cohesive and loosely coupled, promoting code reusability and maintainability.

The project emphasizes the following key principles and concepts:

- **SOLID Principles:** The SortWords project adheres to SOLID principles, including the Single Responsibility Principle (SRP), Open-Closed Principle (OCP), Liskov Substitution Principle (LSP), Interface Segregation Principle (ISP), and Dependency Inversion Principle (DIP). These principles guide the design and implementation of each module, ensuring modularity, extensibility, and easy maintainability.

- **Object-Oriented Programming (OOP):** The project leverages core OOP concepts such as encapsulation, inheritance, and abstraction. Each module encapsulates its specific functionality and utilizes inheritance to implement interfaces and extend behavior. Abstraction is achieved through the use of interfaces, enabling polymorphism and modular design.

- **Concurrency:** The SortWords application utilizes concurrency to improve performance and efficiency. It employs multiple threads for parallel file reading and processing, making use of thread pooling for effective thread management and resource utilization.

## Modules

### 1. FileOperations

The `FileOperations` module handles the reading of input files. It implements the `FileReader` interface and provides methods to read the files, split the lines based on options (split-s, split-c, split-n), and retrieve the words.

### 2. WordSorting

The `WordSorting` module is responsible for sorting the words. It implements the `WordSorter` interface and provides methods to sort the words in ascending or descending order.

### 3. MostFrequentWordFinder

The `MostFrequentWordFinder` module determines the most frequent word among all the files. It implements the `FrequentWordFinder` interface and provides methods to find the most frequent word and get its count.

### 4. SortWords

The `SortWords` module brings together the functionality of the other modules and orchestrates the sorting and processing of words from multiple files. It implements the `WordProcessor` interface and provides the `run()` method to execute the sorting and processing logic.

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- IntelliJ IDEA or any Java IDE

## Getting Started

1. Clone the repository or download the project ZIP file.

2. Open the project in your Java IDE.

3. Build the project to ensure all dependencies are resolved.

## Usage

1. Update the `run()` method in the `SortWords` class to specify the file paths of the input files, the sort option, and the split option.

2. Run the `SortWords` class.

3. The program will read the specified input files, extract the words, remove duplicates, sort them based on the specified option, and write them to an output file. It will also determine the most frequent word among all the files.

4. After the program finishes, you will see the output in the console, displaying the most frequent word and its count.

## Customization

- To change the output file name, update the `output_file` variable in the `SortWords` class.

- To modify the split options, update the `splitOption` parameter in the `run()` method of the `SortWords` class.

- To change the sorting order, update the `ascendingSort` parameter in the `run()` method of the `SortWords` class.

## License

This project is licensed under the [MIT License](LICENSE).
