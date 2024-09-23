# CPUTestFile CPU class models a CPU with attributes for CPUname, model, year, and price. It includes methods to display information, start the CPU, and upgrade its features.

Features
Attributes:
CPUname: Name of the CPU (String).
model: Model of the CPU (String).
year: Year of manufacture (int).
price: Price of the CPU (double).

Methods:
CPU(): Default constructor.
CPU(String CPUname, String model, int year, double price): Parameterized constructor.
displayInfo(): Prints CPU details.
start(): Simulates starting the CPU.
upgradeCPU(String feature, double additionalCost): Updates price with new feature.
