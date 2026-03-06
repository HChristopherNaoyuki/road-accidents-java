# Road Accidents Java Application

## Table of Contents

- [1. Project Overview](#1-project-overview)
- [2. Features](#2-features)
- [3. Technology Stack](#3-technology-stack)
- [4. System Requirements](#4-system-requirements)
- [5. Installation Guide](#5-installation-guide)
- [6. Usage Instructions](#6-usage-instructions)
- [7. Application Structure](#7-application-structure)
- [8. Class Documentation](#8-class-documentation)
- [9. Sample Output](#9-sample-output)

## 1. Project Overview

The Road Accidents Java Application is a console-based program developed for the PROG6112 Programming 1B module. 
The application enables users to record and display road accident data for different vehicle types across various cities. 
It demonstrates fundamental object-oriented programming concepts including abstraction, inheritance, polymorphism, and interface implementation.

This project serves as an educational tool for understanding Java programming principles while providing practical functionality for accident data management.

### 1.1 Purpose

To create a robust application that:
- Collects road accident data through user input
- Stores accident information using object-oriented data structures
- Generates formatted reports displaying recorded accidents
- Demonstrates proper implementation of Java interfaces and abstract classes

## 2. Features

### 2.1 Core Functionality

| Feature | Description |
|---------|-------------|
| Data Collection | Interactive console prompts for vehicle type, city, and accident count |
| Report Generation | Formatted output displaying all recorded accident information |
| Object-Oriented Design | Implements interfaces, abstract classes, and inheritance |
| Resource Management | Proper handling of input streams and system resources |

### 2.2 Technical Features

- **Interface Implementation**: IRoadAccidents interface defines standard data access methods
- **Abstract Class**: RoadAccidents provides base functionality for all accident classes
- **Inheritance**: RoadAccidentReport extends the abstract class with specific functionality
- **Encapsulation**: Data protected through getter methods and access modifiers
- **Formatted Output**: Consistent report formatting with visual separators

## 3. Technology Stack

### 3.1 Programming Language

| Component | Specification |
|-----------|--------------|
| Language | Java |
| Version | JDK 8 or higher |
| Paradigm | Object-Oriented Programming |

### 3.2 Development Tools

| Tool | Purpose |
|------|---------|
| Java Compiler (javac) | Compilation of source code |
| Java Virtual Machine (JVM) | Execution of compiled bytecode |
| Text Editor/IDE | Code development (any Java-compatible editor) |
| Git | Version control and repository management |

## 4. System Requirements

### 4.1 Hardware Requirements

| Component | Minimum Requirement |
|-----------|---------------------|
| Processor | 1 GHz or faster |
| RAM | 128 MB |
| Disk Space | 10 MB free space |
| Display | Any console-capable display |

### 4.2 Software Requirements

| Software | Version | Purpose |
|----------|---------|---------|
| Java Runtime Environment (JRE) | 8 or higher | Running the application |
| Java Development Kit (JDK) | 8 or higher | Compiling the source code |
| Operating System | Windows, macOS, or Linux | Platform support |
| Git (optional) | 2.x or higher | Cloning the repository |

### 4.3 Supported Platforms

- Windows 7, 8, 10, 11
- macOS 10.12 or later
- Linux (any distribution with Java support)
- Unix-based systems

## 5. Installation Guide

### 5.1 Method 1: Clone from GitHub Repository

#### Step 1: Clone the Repository

Open a terminal or command prompt and execute:

```bash
git clone https://github.com/HChristopherNaoyuki/road-accidents-java.git
```

#### Step 2: Navigate to Project Directory

```bash
cd road-accidents-java
```

#### Step 3: Verify Directory Structure

After cloning, ensure the following structure exists:

```
road-accidents-java/
│
├── Solution/
│   ├── Solution.java
│   ├── IRoadAccidents.java
│   ├── RoadAccidents.java
│   └── RoadAccidentReport.java
│
├── Documentation/
│   └── documentation.md
│
└── README.md
```

### 5.2 Method 2: Manual Download

1. Visit the GitHub repository: https://github.com/HChristopherNaoyuki/road-accidents-java
2. Click the "Code" button
3. Select "Download ZIP"
4. Extract the ZIP file to your desired location
5. Open a terminal and navigate to the extracted folder

### 5.3 Compilation Instructions

#### Navigate to the Parent Directory

Ensure you are in the directory that contains the `Solution` folder:

```bash
# Windows
cd path\to\road-accidents-java

# macOS/Linux
cd /path/to/road-accidents-java
```

#### Compile All Java Files

**Windows:**
```bash
javac Solution\*.java
```

**macOS/Linux:**
```bash
javac Solution/*.java
```

#### Verify Compilation

After successful compilation, `.class` files will be generated in the Solution directory:
- Solution.class
- IRoadAccidents.class
- RoadAccidents.class
- RoadAccidentReport.class

## 6. Usage Instructions

### 6.1 Running the Application

#### Execute the Program

From the parent directory containing the `Solution` folder:

**Windows:**
```bash
java Solution.Solution
```

**macOS/Linux:**
```bash
java Solution.Solution
```

### 6.2 Interactive Session Guide

#### Step-by-Step Input Process

| Prompt | Expected Input | Example |
|--------|---------------|---------|
| Enter the accident vehicle type: | Text describing vehicle type | Car, Motor Bike, Truck |
| Enter the city for the vehicle accidents: | City name | Cape Town, Johannesburg |
| Enter the total [type] accidents for [city]: | Numeric value | 155, 121, 178 |

#### Complete Session Example

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

### 6.3 Multiple Data Entry

To record multiple accident reports, run the application multiple times. Each execution handles one complete data entry cycle.

**Session 1 - Motor Bike in Johannesburg:**
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

**Session 2 - Car in Port Elizabeth:**
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

## 7. Application Structure

### 7.1 Architecture Overview

```
┌─────────────────────────────────────────────────────────────┐
│                      Solution (Main Class)                  │
│                      - User Interface                       │
│                      - Input Collection                     │
│                      - Report Orchestration                 │
└─────────────────────────┬───────────────────────────────────┘
                          │
                          │ instantiates
                          ▼
┌─────────────────────────────────────────────────────────────┐
│                  RoadAccidentReport                         │
│                      - Report Generation                    │
│                      - Formatted Output                     │
└─────────────────────────┬───────────────────────────────────┘
                          │
                          │ extends
                          ▼
┌─────────────────────────────────────────────────────────────┐
│                    RoadAccidents (Abstract)                 │
│                      - Data Storage                         │
│                      - Getter Methods                       │
└─────────────────────────┬───────────────────────────────────┘
                          │
                          │ implements
                          ▼
┌─────────────────────────────────────────────────────────────┐
│                     IRoadAccidents (Interface)              │
│                      - Method Contracts                     │
└─────────────────────────────────────────────────────────────┘
```

### 7.2 File Structure

| File Name | Package | Description |
|-----------|---------|-------------|
| Solution.java | Solution | Main application class with user interaction logic |
| IRoadAccidents.java | Solution | Interface defining accident data access methods |
| RoadAccidents.java | Solution | Abstract class implementing the interface |
| RoadAccidentReport.java | Solution | Concrete class for report generation |

### 7.3 Class Relationships

| Class/Interface | Type | Parent/Implements | Responsibility |
|-----------------|------|-------------------|----------------|
| IRoadAccidents | Interface | N/A | Defines method signatures for accident data |
| RoadAccidents | Abstract Class | Implements IRoadAccidents | Provides base implementation and data storage |
| RoadAccidentReport | Concrete Class | Extends RoadAccidents | Adds report generation functionality |
| Solution | Concrete Class | N/A | Orchestrates application flow |

## 8. Class Documentation

### 8.1 Solution Class

**Purpose:** Main entry point for the application. Handles user input and coordinates report generation.

**Key Methods:**
- `main(String[] args)`: Application entry point, manages the complete program flow

**Variables:**
- `Scanner input`: Reads user input from console
- `String vehicleType`: Stores vehicle type
- `String city`: Stores city name
- `int accidentTotal`: Stores accident count
- `RoadAccidentReport report`: Stores report object

### 8.2 IRoadAccidents Interface

**Purpose:** Defines the contract for all road accident classes.

**Methods:**
- `String getAccidentVehicleType()`: Returns vehicle type
- `String getCity()`: Returns city name
- `int getAccidentTotal()`: Returns accident count

### 8.3 RoadAccidents Abstract Class

**Purpose:** Provides base implementation for storing and accessing accident data.

**Variables:**
- `protected String vehicleType`: Vehicle type
- `protected String city`: City name
- `protected int accidentTotal`: Accident count

**Constructor:**
- `RoadAccidents(String vehicleType, String city, int accidentTotal)`: Initializes object with data

**Methods:**
- `getAccidentVehicleType()`: Implementation of interface method
- `getCity()`: Implementation of interface method
- `getAccidentTotal()`: Implementation of interface method

### 8.4 RoadAccidentReport Class

**Purpose:** Generates formatted accident reports.

**Constructor:**
- `RoadAccidentReport(String vehicleType, String city, int accidentTotal)`: Calls parent constructor

**Methods:**
- `printAccidentReport()`: Displays formatted report to console

## 9. Sample Output

### 9.1 Standard Report Format

```
VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: [vehicle type]
CITY: [city name]
ACCIDENT TOTAL: [accident count]
****************************
```

### 9.2 Complete Session Examples

#### Example 1: Car Accident in Cape Town
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

#### Example 2: Motor Bike Accident in Johannesburg
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

#### Example 3: Car Accident in Port Elizabeth
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

### 9.3 Test Data Reference

| City | Vehicle Type | Accident Count |
|------|--------------|----------------|
| Cape Town | Car | 155 |
| Cape Town | Motor Bike | 121 |
| Johannesburg | Car | 178 |
| Johannesburg | Motor Bike | 145 |
| Port Elizabeth | Car | 112 |
| Port Elizabeth | Motor Bike | 89 |

---
