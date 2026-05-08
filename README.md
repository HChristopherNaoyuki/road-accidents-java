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

The Road Accidents Java Application is a console-based program designed for
the PROG6112 Programming 1B module. It allows users to record and display
road accident data across different vehicle types and cities. The project
demonstrates essential object-oriented programming concepts, including
abstraction, inheritance, polymorphism, and interface implementation. This
application serves as both an educational tool for learning Java principles
and a practical utility for basic accident data management. The system
collects user input, stores information using structured classes, and
generates formatted reports. It follows a clear separation of concerns
through interfaces and abstract classes, making it an excellent reference
for novice and intermediate Java developers.

### 1.1 Purpose

The primary purposes of this application are to collect road accident data
through interactive user prompts, store this information using object-
oriented data structures, generate formatted reports that display recorded
accidents, and demonstrate proper implementation of Java interfaces and
abstract classes in a real-world context.

## 2. Features

### 2.1 Core Functionality

The application provides interactive console prompts for entering vehicle
type, city name, and accident count. It generates formatted output that
displays all recorded accident information in a clear, readable format.
The design implements a full object-oriented structure with interfaces,
abstract classes, and inheritance. Resource management is handled properly
with efficient input stream processing and system resource allocation.

### 2.2 Technical Features

The system includes interface implementation through IRoadAccidents, which
defines standard data access methods. An abstract class named RoadAccidents
provides the base functionality for all accident classes. Inheritance is
demonstrated as RoadAccidentReport extends the abstract class with specific
reporting functionality. Data encapsulation protects information through
getter methods and access modifiers. The output formatting ensures
consistent report presentation with visual separators.

## 3. Technology Stack

### 3.1 Programming Language

The application is written entirely in Java, requiring JDK version 8 or
higher. It follows the object-oriented programming paradigm to structure
code into logical, reusable components.

### 3.2 Development Tools

Development requires the Java Compiler (javac) for compiling source code
and the Java Virtual Machine (JVM) for executing the compiled bytecode.
Any text editor or integrated development environment compatible with
Java can be used for code development. Git is used for version control
and repository management.

## 4. System Requirements

### 4.1 Hardware Requirements

The minimum hardware requirements include a processor running at 1 GHz
or faster, 128 MB of RAM, 10 MB of free disk space, and any console-
capable display for viewing output.

### 4.2 Software Requirements

The software stack requires Java Runtime Environment (JRE) version 8 or
higher to run the application. The Java Development Kit (JDK) version 8
or higher is needed to compile the source code. The operating system
can be Windows, macOS, or Linux. Git version 2.x or higher is optional
for cloning the repository.

### 4.3 Supported Platforms

The application supports Windows 7, 8, 10, and 11, macOS version 10.12
or later, any Linux distribution with Java support, and Unix-based
systems.

## 5. Installation Guide

### 5.1 Method 1: Clone from GitHub Repository

Step 1: Clone the repository by opening a terminal or command prompt
and executing the following command:

```bash
git clone https://github.com/HChristopherNaoyuki/road-accidents-java.git
```

Step 2: Navigate to the project directory using the command below:

```bash
cd road-accidents-java
```

Step 3: Verify the directory structure. After cloning, the following
structure should exist on your system:

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

Visit the GitHub repository at the provided URL, click the Code button,
and select Download ZIP. Extract the ZIP file to your desired location,
then open a terminal and navigate to the extracted folder.

### 5.3 Compilation Instructions

Navigate to the parent directory that contains the Solution folder.
For Windows, use the command `javac Solution\*.java`. For macOS or
Linux, use the command `javac Solution/*.java`. After successful
compilation, .class files will be generated in the Solution directory.

## 6. Usage Instructions

### 6.1 Running the Application

From the parent directory containing the Solution folder, execute the
program using the command `java Solution.Solution` on all operating
systems.

### 6.2 Interactive Session Guide

The system will prompt you in sequence. First, enter the accident
vehicle type as text describing the vehicle, such as Car, Motor Bike,
or Truck. Second, enter the city for the vehicle accidents, such as
Cape Town or Johannesburg. Third, enter the total accident count for
that vehicle type and city as a numeric value, such as 155 or 121.

### 6.3 Multiple Data Entry

To record multiple accident reports, run the application multiple
times. Each execution handles one complete data entry cycle, which
includes entering vehicle type, city, and accident total, followed
by displaying the corresponding report.

## 7. Application Structure

### 7.1 Architecture Overview

The Solution class serves as the main entry point, managing the user
interface, input collection, and report orchestration. It instantiates
the RoadAccidentReport class, which handles report generation and
formatted output. RoadAccidentReport extends the abstract RoadAccidents
class, which provides data storage and getter methods. RoadAccidents
implements the IRoadAccidents interface, which defines method contracts.

### 7.2 File Structure

The Solution.java file is the main application class with user
interaction logic. IRoadAccidents.java is an interface defining
accident data access methods. RoadAccidents.java is an abstract class
implementing the interface. RoadAccidentReport.java is a concrete
class for report generation.

### 7.3 Class Relationships

IRoadAccidents defines method signatures for accident data. The
RoadAccidents abstract class implements IRoadAccidents and provides
base implementation with data storage. RoadAccidentReport extends
RoadAccidents to add report generation functionality. The Solution
class orchestrates the complete application flow.

## 8. Class Documentation

### 8.1 Solution Class

This is the main entry point for the application. It handles user
input and coordinates report generation. The main method manages the
complete program flow. The class uses a Scanner object named input to
read from the console, String variables for vehicleType and city, an
int variable for accidentTotal, and a RoadAccidentReport object to
store the report.

### 8.2 IRoadAccidents Interface

This interface defines the contract for all road accident classes.
It declares three methods: getAccidentVehicleType() which returns the
vehicle type as a String, getCity() which returns the city name as a
String, and getAccidentTotal() which returns the accident count as
an integer.

### 8.3 RoadAccidents Abstract Class

This class provides the base implementation for storing and accessing
accident data. It contains three protected variables: vehicleType,
city, and accidentTotal. The constructor initializes the object with
the provided data. The class implements all three methods from the
IRoadAccidents interface to return the respective variable values.

### 8.4 RoadAccidentReport Class

This class generates formatted accident reports. Its constructor calls
the parent constructor from RoadAccidents. The printAccidentReport
method displays a formatted report to the console, including a header,
separator line, vehicle type, city name, accident total, and a closing
separator line.

## 9. Sample Output

### 9.1 Standard Report Format

The standard report format displays a header reading VEHICLE ACCIDENT
REPORT, followed by a separator line of asterisks. The next lines show
the VEHICLE TYPE, CITY, and ACCIDENT TOTAL with their corresponding
values. A final separator line of asterisks closes the report.

### 9.2 Complete Session Examples

Example 1 - Car accident in Cape Town with 155 incidents:

Enter the accident vehicle type: Car
Enter the city for the vehicle accidents: Cape Town
Enter the total Car accidents for Cape Town: 155

VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: Car
CITY: Cape Town
ACCIDENT TOTAL: 155
****************************

Example 2 - Motor Bike accident in Johannesburg with 145 incidents:

Enter the accident vehicle type: Motor Bike
Enter the city for the vehicle accidents: Johannesburg
Enter the total Motor Bike accidents for Johannesburg: 145

VEHICLE ACCIDENT REPORT
****************************
VEHICLE TYPE: Motor Bike
CITY: Johannesburg
ACCIDENT TOTAL: 145
****************************

### 9.3 Test Data Reference

For testing purposes, reference data includes Car accidents in Cape
Town totaling 155, Motor Bike accidents in Cape Town totaling 121,
Car accidents in Johannesburg totaling 178, Motor Bike accidents in
Johannesburg totaling 145, Car accidents in Port Elizabeth totaling
112, and Motor Bike accidents in Port Elizabeth totaling 89.

---

End of Document

---
