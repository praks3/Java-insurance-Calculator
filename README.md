**README.md**

# Car Insurance Premium Calculator

This is a standalone Java program that calculates the effective insurance premium for cars based on their details and insurance type.

## Problem Statement

Write a standalone Java program that accepts car's details and calculates the effective insurance premium after applying the rules.

### Input

The program accepts the following car details as command line options:

- `-model <Car model>`: The model of the car.
- `-type <Car type>`: The type of the car (Hatchback, Sedan, or SUV).
- `-price <Car cost price>`: The cost price of the car.
- `-insuranceType <Type of Insurance>`: The type of insurance (Basic or Premium).

### Car Type and Insurance Premium Calculation Rules

- **Hatchback**: 5% of the car's cost price.
- **Sedan**: 8% of the car's cost price.
- **SUV**: 10% of the car's cost price.

If the insurance type is **Premium**, the premium value is increased by 20% of the calculated value based on the car type.

### Example

If the car's cost price is ₹1000000 and the car type is Sedan:
The insurance premium will be 8% of ₹1000000 = ₹80000.
If the insurance type is Premium,
the actual premium to be paid will be ₹80000 + 20% of ₹80000 = ₹96000.

### Expected Behavior and Output

- The system provides functionality to add more than one car. After entering the details of the first car, it displays a message: "Do you want to enter details of any other car (y/n):"
- Java's object-oriented capabilities are used for implementing the business logic.

## How to Use

1. Open a terminal.
2. Navigate to the directory containing the Java program files.
3. Compile the Java program.
4. Run the program.
5. Follow the prompts to enter the car details and calculate the insurance premium.

**Note:** For any further assistance or inquiries, please contact Prakhar Srivastava at sprakhar275@gmail.com .
