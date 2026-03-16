# Data Structures and Algorithms

A collection of common data structures and algorithms implemented in Java. This repository contains solutions to various programming problems, including those from LeetCode and other competitive programming platforms.

## Table of Contents
- [Overview](#overview)
- [Requirements](#requirements)
- [Setup and Run](#setup-and-run)
- [Project Structure](#project-structure)
- [Implemented Problems](#implemented-problems)
- [Scripts](#scripts)
- [Environment Variables](#environment-variables)
- [Tests](#tests)
- [License](#license)

## Overview
This project serves as a practice repository for fundamental computer science concepts. It is structured as a Maven project, with each problem organized into its own package.

- **Language:** Java 17
- **Framework/Build Tool:** Maven 4.0.0
- **Main Package:** `cl.datastructuresandalgorithms`

## Requirements
- **Java Development Kit (JDK):** Version 17 or higher
- **Maven:** For dependency management and building the project

## Setup and Run
### Clone the Repository
```bash
git clone <repository-url>
cd datastructures-and-algorithms
```

### Build the Project
Use Maven to compile the source code:
```bash
mvn compile
```

### Run the Main Entry Point
The `Main.java` file contains commented-out calls to various implemented algorithms. You can uncomment the ones you want to test and run the application:
```bash
mvn exec:java -Dexec.mainClass="cl.datastructuresandalgorithms.Main" -pl app
```

## Project Structure
```text
.
├── README.md
├── app
│   ├── pom.xml
│   └── src
│       └── main
│           └── java
│               └── cl
│                   └── datastructuresandalgorithms
│                       ├── Main.java (Entry point)
│                       ├── addbinary
│                       ├── anagramgroup
│                       ├── containsduplicate
│                       ├── extras (Additional problems)
│                       ├── lengthoflastword
│                       ├── longestcommonprefix
│                       ├── movezeroes
│                       ├── plusone
│                       ├── removeduplicates
│                       ├── romantointeger
│                       ├── searchinsertposition
│                       ├── stringfirstindexocurrenceTODO
│                       ├── twosum
│                       ├── ValidParenthesis
│                       ├── validanagram
│                       └── validpalindrome
└── bin (Compiled classes - optional)
```

## Implemented Problems
Below are some of the algorithms and problems implemented in this repository:
- **String Manipulation:** Longest Common Prefix, Valid Palindrome, Valid Anagram, Roman to Integer, Length of Last Word.
- **Arrays & Hashing:** Two Sum, Contains Duplicate, Anagram Groups, Move Zeroes, Remove Duplicates.
- **Math:** Add Binary, Plus One.
- **Search:** Search Insert Position.
- **Extras:** Reverse Array, First Non-Repeated Character, Array Intersection, Sorted Squared Array, Reverse Vowels.

## Scripts
- `mvn compile`: Compiles the project.
- `mvn exec:java -Dexec.mainClass="cl.datastructuresandalgorithms.Main" -pl app`: Runs the main application.

## Environment Variables
No specific environment variables are currently required for this project.

## Tests
- [TODO] Implement automated unit tests using JUnit 5 or TestNG. Currently, testing is done manually through the `Main.java` entry point.

## License
- [TODO] Add a LICENSE file (e.g., MIT, Apache 2.0).