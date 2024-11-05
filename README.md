# Animal Hierarchy Program

## Overview

This Java program implements a simple class hierarchy for representing animals, specifically focusing on birds and reptiles. The program allows users to input details about a bird and a reptile, including their unique attributes, and then outputs this information.

## Features

- **Class Structure**:
  - **Animal**: The base class containing common properties such as `IDtag` and `species`.
  - **Bird**: A subclass of `Animal` that includes an additional property for feather color.
  - **Reptile**: Another subclass of `Animal` that includes a property for blood temperature.

- **User Input**: The program prompts the user to enter details for both birds and reptiles, validating input where necessary.

- **Output**: After collecting input, the program displays the entered information in a structured format.

## Getting Started

### Prerequisites

- Ensure you have Java Development Kit (JDK) installed on your machine.
- An IDE or text editor for Java development (e.g., IntelliJ IDEA, Eclipse, or Visual Studio Code).

### Running the Program

1. **Clone or Download the Repository**:
   Clone this repository or download the code as a ZIP file.

2. **Compile the Code**:
   Open a terminal or command prompt, navigate to the directory containing the `Solutions.java` file, and compile it using:
   ```bash
   javac Solutions.java
   ```

3. **Run the Program**:
   After compiling, run the program with:
   ```bash
   java Solutions
   ```

4. **Follow the Prompts**:
   Input the required information for the bird and reptile as prompted by the program.

## Example Usage

When you run the program, the output may look like this:

```
Please enter the details for the bird:
Enter ID: 1
Enter species: Sparrow
Enter feather color number: 
1: Gray
2: White 
3: Black
Enter Choice: 2

Please enter the details for the reptile:
Enter ID: 2
Enter species: Snake
Please enter the blood temperature: 37.5

Bird details:
ID: 1
Species: Sparrow
Color: white

Reptile details:
ID: 2
Species: Snake
Blood temperature: 37.5
```

## Error Handling

The program includes basic error handling to manage invalid inputs. If the user enters incorrect data types or out-of-range values, the program will display an error message and prompt the user to try again.

----
