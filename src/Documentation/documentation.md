# Road Accidents Java Application Documentation

## Table of Contents

- [1. Introduction](#1-introduction)
- [2. System Overview](#2-system-overview)
- [3. Solution Class Documentation](#3-solution-class-documentation)
- [4. IRoadAccidents Interface Documentation](#4-iroadaccidents-interface-documentation)
- [5. RoadAccidents Abstract Class Documentation](#5-roadaccidents-abstract-class-documentation)
- [6. RoadAccidentReport Class Documentation](#6-roadaccidentreport-class-documentation)
- [7. Application Workflow](#7-application-workflow)
- [8. Usage Guide](#8-usage-guide)
- [9. Error Handling](#9-error-handling)
- [10. Best Practices Implemented](#10-best-practices-implemented)
- [11. Version History](#11-version-history)

## 1. Introduction

This documentation provides comprehensive information about the Road Accidents Java 
Application, a console-based system designed to record and display vehicle accident 
data. The application was developed as part of the PROG6112 Programming 1B Test 
and demonstrates object-oriented programming principles including abstraction, inheritance, 
and interface implementation.

### 1.1 Purpose

The application enables users to input accident data for different vehicle types across 
various cities and generates formatted reports displaying the recorded information.

### 1.2 Target Audience

This documentation is intended for:
- Developers maintaining or extending the application
- Quality assurance testers
- Technical reviewers and assessors
- Students learning Java programming concepts

## 2. System Overview

### 2.1 Architecture

The application follows a layered object-oriented architecture with four main components:

| Component | Type | Responsibility |
|-----------|------|----------------|
| IRoadAccidents | Interface | Defines contract for accident data access |
| RoadAccidents | Abstract Class | Implements interface and stores base accident data |
| RoadAccidentReport | Concrete Class | Extends abstract class and generates reports |
| Solution | Main Class | Handles user interaction and application flow |

### 2.2 Key Features

- User input collection for accident data
- Data encapsulation through getter methods
- Formatted report generation
- Object-oriented design with inheritance hierarchy
- Interface-based contract enforcement

## 3. Solution Class Documentation

### 3.1 Class Overview

The `Solution` class serves as the entry point for the Road Accidents application. 
It manages user interaction through the console, collects input data, and orchestrates 
the report generation process.

### 3.2 Package Declaration

```
package Solution;
```

### 3.3 Imports

```
import java.util.Scanner;
```

### 3.4 Class Structure

#### 3.4.1 Main Method

**Signature:** `public static void main(String[] args)`

**Purpose:** Entry point of the application that executes the program flow.

**Parameters:**
- `String[] args`: Command-line arguments (not used in this application)

**Return Value:** None (void)

#### 3.4.2 Variables

| Variable Name | Data Type | Purpose |
|---------------|-----------|---------|
| input | Scanner | Reads user input from the console |
| vehicleType | String | Stores the type of vehicle involved in accidents |
| city | String | Stores the city name where accidents occurred |
| accidentTotal | int | Stores the total number of accidents |
| report | RoadAccidentReport | Object containing the accident report data |

### 3.5 Method Details

#### 3.5.1 Input Collection Process

The application sequentially prompts users for three pieces of information:

1. **Vehicle Type**
   - Prompt: "Enter the accident vehicle type: "
   - Storage: vehicleType variable

2. **City Name**
   - Prompt: "Enter the city for the vehicle accidents: "
   - Storage: city variable

3. **Accident Total**
   - Prompt: "Enter the total [vehicleType] accidents for [city]: "
   - Storage: accidentTotal variable

#### 3.5.2 Report Generation

After collecting all required data, the application:
1. Instantiates a `RoadAccidentReport` object with the collected data
2. Calls the `printAccidentReport()` method to display formatted output
3. Closes the Scanner resource to prevent memory leaks

### 3.6 Resource Management

The Scanner object is properly closed using `input.close()` after all input 
operations are complete, following Java best practices for resource management.

## 4. IRoadAccidents Interface Documentation

### 4.1 Interface Overview

The `IRoadAccidents` interface defines the contract that all road accident classes 
must fulfill. It establishes a standard set of methods for accessing accident-related 
data, ensuring consistency across different implementations.

### 4.2 Package Declaration

```
package Solution;
```

### 4.3 Interface Definition

```java
public interface IRoadAccidents
```

### 4.4 Method Specifications

#### 4.4.1 getAccidentVehicleType

**Signature:** `String getAccidentVehicleType()`

**Purpose:** Retrieves the type of vehicle involved in the recorded accidents.

**Returns:**
- `String`: The vehicle type (e.g., "Car", "Motor Bike", "Truck")

**Usage Example:**
```java
String vehicleType = accidentData.getAccidentVehicleType();
```

#### 4.4.2 getCity

**Signature:** `String getCity()`

**Purpose:** Retrieves the name of the city where the accidents occurred.

**Returns:**
- `String`: The city name (e.g., "Cape Town", "Johannesburg")

**Usage Example:**
```java
String cityName = accidentData.getCity();
```

#### 4.4.3 getAccidentTotal

**Signature:** `int getAccidentTotal()`

**Purpose:** Retrieves the total number of accidents recorded.

**Returns:**
- `int`: The total accident count as an integer value

**Usage Example:**
```java
int totalAccidents = accidentData.getAccidentTotal();
```

### 4.5 Design Rationale

The interface follows the Interface Segregation Principle by defining only the essential 
methods needed to access accident data. This design allows for:

- Multiple implementations while maintaining a consistent API
- Easy testing through mock implementations
- Flexibility to extend functionality without breaking existing code

## 5. RoadAccidents Abstract Class Documentation

### 5.1 Class Overview

The `RoadAccidents` abstract class provides a foundational implementation of the `IRoadAccidents` 
interface. It stores the core accident data and implements the required getter methods, serving 
as a base class for more specialized accident report classes.

### 5.2 Package Declaration

```
package Solution;
```

### 5.3 Class Definition

```java
public abstract class RoadAccidents implements IRoadAccidents
```

### 5.4 Class Variables

| Variable | Access Modifier | Data Type | Description |
|----------|----------------|-----------|-------------|
| vehicleType | protected | String | Stores the type of vehicle involved in accidents |
| city | protected | String | Stores the city name where accidents occurred |
| accidentTotal | protected | int | Stores the total number of recorded accidents |

**Note:** Protected access modifiers allow direct access to these variables by subclasses while maintaining encapsulation from external classes.

### 5.5 Constructor

#### RoadAccidents(String vehicleType, String city, int accidentTotal)

**Purpose:** Initializes a new RoadAccidents object with the provided accident data.

**Parameters:**
- `vehicleType`: The type of vehicle involved in the accidents
- `city`: The city where the accidents occurred
- `accidentTotal`: The total number of accidents recorded

**Example:**
```java
RoadAccidents accidents = new RoadAccidentReport("Car", "Cape Town", 155);
```

### 5.6 Method Implementations

#### 5.6.1 getAccidentVehicleType

**Implementation:**
```java
@Override
public String getAccidentVehicleType()
{
    return vehicleType;
}
```

**Description:** Returns the vehicle type stored in the object. This method overrides the interface method and provides the actual implementation.

#### 5.6.2 getCity

**Implementation:**
```java
@Override
public String getCity()
{
    return city;
}
```

**Description:** Returns the city name stored in the object. The `@Override` annotation indicates this method fulfills the interface contract.

#### 5.6.3 getAccidentTotal

**Implementation:**
```java
@Override
public int getAccidentTotal()
{
    return accidentTotal;
}
```

**Description:** Returns the total accident count stored in the object.

### 5.7 Design Considerations

1. **Abstract Class Choice**: The class is declared abstract because it is not meant to be instantiated directly. It provides common functionality while allowing subclasses to add specific behavior.

2. **Protected Variables**: Variables are protected to:
   - Allow direct access by subclasses for performance
   - Maintain encapsulation from external classes
   - Support inheritance hierarchies

3. **Interface Implementation**: The class fully implements the IRoadAccidents interface, ensuring all implementing subclasses automatically satisfy the interface contract.

## 6. RoadAccidentReport Class Documentation

### 6.1 Class Overview

The `RoadAccidentReport` class extends the abstract `RoadAccidents` class and provides concrete functionality for generating formatted accident reports. This class represents the specialized implementation that produces user-friendly output.

### 6.2 Package Declaration

```
package Solution;
```

### 6.3 Class Definition

```java
public class RoadAccidentReport extends RoadAccidents
```

### 6.4 Constructor

#### RoadAccidentReport(String vehicleType, String city, int accidentTotal)

**Purpose:** Creates a new RoadAccidentReport instance by passing the provided data to the parent class constructor.

**Parameters:**
- `vehicleType`: The type of vehicle involved in the accidents
- `city`: The city where the accidents occurred
- `accidentTotal`: The total number of accidents recorded

**Implementation:**
```java
public RoadAccidentReport(String vehicleType, String city, int accidentTotal)
{
    super(vehicleType, city, accidentTotal);
}
```

**Explanation:** The constructor uses the `super()` keyword to invoke the parent class constructor, ensuring the inherited variables are properly initialized.

### 6.5 Methods

#### printAccidentReport()

**Signature:** `public void printAccidentReport()`

**Purpose:** Generates and displays a formatted accident report to the console.

**Return Value:** None (void)

**Output Format:**
The method produces output in the following format:

```
VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: [vehicle type]
CITY: [city name]
ACCIDENT TOTAL: [accident count]
****************************
```

**Implementation Details:**

The method performs the following steps:
1. Prints a blank line for visual separation
2. Displays the report header
3. Prints a separator line using asterisks
4. Retrieves and displays the vehicle type using the inherited getter
5. Retrieves and displays the city name using the inherited getter
6. Retrieves and displays the accident total using the inherited getter
7. Prints a closing separator line

**Example Output:**
```
VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: Car
CITY: Cape Town
ACCIDENT TOTAL: 155
****************************
```

### 6.6 Inheritance Hierarchy

```
IRoadAccidents (Interface)
        ↑
        implements
        ↑
RoadAccidents (Abstract Class)
        ↑
        extends
        ↑
RoadAccidentReport (Concrete Class)
```

### 6.7 Key Features

1. **Constructor Chaining**: Uses parent class constructor for initialization
2. **Method Reuse**: Leverages inherited getter methods from parent class
3. **Formatted Output**: Provides consistent, readable report formatting
4. **Single Responsibility**: Focuses solely on report generation functionality

---

## 7. Application Workflow

### 7.1 Execution Flow Diagram

```
Start Application
        ↓
Initialize Scanner
        ↓
Prompt: Enter vehicle type
        ↓
Store vehicle type
        ↓
Prompt: Enter city name
        ↓
Store city name
        ↓
Prompt: Enter accident total
        ↓
Store accident total
        ↓
Create RoadAccidentReport object
        ↓
Call printAccidentReport()
        ↓
Display formatted report
        ↓
Close Scanner
        ↓
End Application
```

### 7.2 Data Flow

| Step | Action | Data Movement |
|------|--------|---------------|
| 1 | User input | Console → Scanner → local variables |
| 2 | Object creation | Local variables → RoadAccidentReport constructor |
| 3 | Constructor chaining | RoadAccidentReport → RoadAccidents constructor |
| 4 | Data storage | Constructor parameters → protected variables |
| 5 | Report generation | protected variables → formatted output |
| 6 | Display | formatted output → console |

## 8. Usage Guide

### 8.1 Prerequisites

| Requirement | Version/Specification |
|-------------|----------------------|
| Java Development Kit (JDK) | 8 or higher |
| Operating System | Windows, macOS, or Linux |
| Command Line Access | Terminal or Command Prompt |
| Memory | Minimum 128 MB RAM |
| Disk Space | Minimum 10 MB free space |

### 8.2 Installation

#### 8.2.1 Clone from GitHub

```bash
git clone https://github.com/HChristopherNaoyuki/road-accidents-java.git
cd road-accidents-java
```

#### 8.2.2 Directory Structure

After cloning, the application directory should contain:

```
road-accidents-java/
│
├── Solution/
│   ├── Solution.java
│   ├── IRoadAccidents.java
│   ├── RoadAccidents.java
│   └── RoadAccidentReport.java
└── Documentation/
    ├── disclaimer.md
    └── documentation.md
```

### 8.3 Compilation

Navigate to the parent directory containing the `Solution` folder and compile all Java files:

**Windows:**
```bash
javac Solution\*.java
```

**macOS/Linux:**
```bash
javac Solution/*.java
```

### 8.4 Execution

Run the application from the parent directory:

**Windows:**
```bash
java Solution.Solution
```

**macOS/Linux:**
```bash
java Solution.Solution
```

### 8.5 Interactive Session Example

```
Enter the accident vehicle type: Car
Enter the city for the vehicle accidents: Cape Town
Enter the total Car accidents for Cape Town: 155

VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: Car
CITY: Cape Town
ACCIDENT TOTAL: 155
****************************
```

### 8.6 Multiple Data Entry

To record multiple accident reports, the application must be run multiple times. Each execution handles one complete data entry cycle.

**Example Session 1:**
```
Enter the accident vehicle type: Motor Bike
Enter the city for the vehicle accidents: Johannesburg
Enter the total Motor Bike accidents for Johannesburg: 145

VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: Motor Bike
CITY: Johannesburg
ACCIDENT TOTAL: 145
****************************
```

**Example Session 2:**
```
Enter the accident vehicle type: Car
Enter the city for the vehicle accidents: Port Elizabeth
Enter the total Car accidents for Port Elizabeth: 112

VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: Car
CITY: Port Elizabeth
ACCIDENT TOTAL: 112
****************************
```

---

## 9. Error Handling

### 9.1 Input Validation Considerations

The current implementation assumes valid user input. The following potential error scenarios 
should be considered for future enhancements:

#### 9.1.1 Data Type Mismatch

**Scenario:** User enters non-numeric value for accident total

**Current Behavior:** The program will throw an `InputMismatchException` and terminate

**Recommended Enhancement:**
```java
System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
while (!input.hasNextInt()) {
    System.out.println("Error: Please enter a valid number.");
    input.next(); // Clear invalid input
    System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
}
accidentTotal = input.nextInt();
```

#### 9.1.2 Empty Input

**Scenario:** User presses Enter without providing input

**Current Behavior:** Empty strings will be stored for vehicle type and city

**Recommended Enhancement:**
```java
System.out.print("Enter the accident vehicle type: ");
vehicleType = input.nextLine();
while (vehicleType.trim().isEmpty()) {
    System.out.println("Error: Vehicle type cannot be empty.");
    System.out.print("Enter the accident vehicle type: ");
    vehicleType = input.nextLine();
}
```

#### 9.1.3 Negative Numbers

**Scenario:** User enters a negative number for accident total

**Current Behavior:** Negative values will be accepted and stored

**Recommended Enhancement:**
```java
System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
accidentTotal = input.nextInt();
while (accidentTotal < 0) {
    System.out.println("Error: Accident total cannot be negative.");
    System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
    accidentTotal = input.nextInt();
}
```

### 9.2 Resource Management

#### 9.2.1 Scanner Closure

The application properly closes the Scanner resource using `input.close()` at the end of execution. This prevents resource leaks and follows Java best practices.

#### 9.2.2 Exception Handling

The current implementation does not include try-catch blocks. For production use, consider:

```java
try {
    // Application code
} catch (InputMismatchException e) {
    System.err.println("Error: Invalid input format. Please restart the application.");
} catch (Exception e) {
    System.err.println("An unexpected error occurred: " + e.getMessage());
} finally {
    if (input != null) {
        input.close();
    }
}
```

## 10. Best Practices Implemented

### 10.1 Object-Oriented Design Principles

| Principle | Implementation |
|-----------|---------------|
| Encapsulation | Data hidden behind getter methods; protected variables controlled access |
| Inheritance | RoadAccidentReport extends RoadAccidents |
| Polymorphism | Methods overridden to provide specific implementations |
| Abstraction | RoadAccidents class abstract; IRoadAccidents interface defines contract |
| Interface Segregation | Interface contains only essential methods |

### 10.2 Java Naming Conventions

| Element | Convention Used | Example |
|---------|----------------|---------|
| Classes | PascalCase | RoadAccidentReport |
| Interfaces | PascalCase with 'I' prefix | IRoadAccidents |
| Methods | camelCase | getAccidentTotal() |
| Variables | camelCase | vehicleType |
| Packages | lowercase | Solution |

### 10.3 Code Documentation

- **Class-level comments**: Describe purpose and responsibility
- **Method-level comments**: Explain functionality and parameters
- **Inline comments**: Clarify complex logic or important steps
- **Javadoc style**: Used for all public methods and classes

### 10.4 Resource Management

- Scanner properly closed after use
- No static variables that could cause memory issues
- Minimal scope for variables

### 10.5 Code Organization

- Each class in its own file
- Logical package structure
- Consistent indentation (4 spaces)
- Clear separation of concerns

### 10.6 Readability Enhancements

- Descriptive variable names
- Blank lines to separate logical blocks
- Consistent formatting
- Meaningful method names

## 11. Version History

### Version 1.0.0 (Current Release)

**Release Date:** 2024

**Changes:**
- Initial release of Road Accidents Java Application
- Implemented core functionality for single accident report entry
- Created complete class hierarchy with interface, abstract class, and concrete implementation
- Added formatted console output
- Established proper resource management

**Features:**
- Single accident data entry per execution
- Formatted report generation
- Object-oriented architecture
- Interface-based design

**Known Limitations:**
- No input validation
- Single data entry per run
- No data persistence
- Limited to console interface

## Appendix A: Complete Code Listings

### A.1 Solution.java
```java
package Solution;

import java.util.Scanner;

/*
    Main application class.

    Responsible for collecting user input
    and generating the accident report.
*/
public class Solution
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        /*
            Variables to store user input.
        */
        String vehicleType;
        String city;
        int accidentTotal;

        /*
            Prompt user for accident vehicle type.
        */
        System.out.print("Enter the accident vehicle type: ");
        vehicleType = input.nextLine();

        /*
            Prompt user for the city where the accident occurred.
        */
        System.out.print("Enter the city for the vehicle accidents: ");
        city = input.nextLine();

        /*
            Prompt user for the number of accidents.
        */
        System.out.print("Enter the total " + vehicleType + " accidents for " + city + ": ");
        accidentTotal = input.nextInt();

        /*
            Create report object using user input.
        */
        RoadAccidentReport report =
                new RoadAccidentReport(vehicleType, city, accidentTotal);

        /*
            Print the accident report.
        */
        report.printAccidentReport();

        input.close();
    }
}
```

### A.2 IRoadAccidents.java
```java
package Solution;

/*
    Interface defining required getter methods
    for retrieving road accident information.
*/
public interface IRoadAccidents
{
    /*
        Returns the vehicle type involved in the accident.
    */
    String getAccidentVehicleType();

    /*
        Returns the city where the accident occurred.
    */
    String getCity();

    /*
        Returns the total number of accidents recorded.
    */
    int getAccidentTotal();
}
```

### A.3 RoadAccidents.java
```java
package Solution;

/*
    Abstract class that stores accident data.

    This class implements the IRoadAccidents interface
    and provides the required getter methods.
*/
public abstract class RoadAccidents implements IRoadAccidents
{
    /*
        Variables to store accident information.
    */
    protected String vehicleType;
    protected String city;
    protected int accidentTotal;

    /*
        Constructor used to initialise accident data.
    */
    public RoadAccidents(String vehicleType, String city, int accidentTotal)
    {
        this.vehicleType = vehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    /*
        Returns the accident vehicle type.
    */
    @Override
    public String getAccidentVehicleType()
    {
        return vehicleType;
    }

    /*
        Returns the city where the accident occurred.
    */
    @Override
    public String getCity()
    {
        return city;
    }

    /*
        Returns the total number of accidents.
    */
    @Override
    public int getAccidentTotal()
    {
        return accidentTotal;
    }
}
```

### A.4 RoadAccidentReport.java
```java
package Solution;

/*
    Concrete subclass used to generate
    the accident report.
*/
public class RoadAccidentReport extends RoadAccidents
{
    /*
        Constructor that passes parameters
        to the superclass constructor.
    */
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal)
    {
        super(vehicleType, city, accidentTotal);
    }

    /*
        Prints the formatted accident report
        according to the required sample layout.
    */
    public void printAccidentReport()
    {
        System.out.println();
        System.out.println("VEHICLE ACCIDENT REPORT");
        System.out.println("****************************");

        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());

        System.out.println("****************************");
    }
}
```

---