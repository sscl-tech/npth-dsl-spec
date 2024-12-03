# DSL Grammar Documentation

## Table of Contents
1. [Introduction](#introduction)
2. [Requirements](#requirements)
3. [Grammar Design](#grammar-design)
4. [Implementation](#implementation)
5. [Challenges and Solutions](#challenges-and-solutions)
6. [Results](#results)
7. [Future Work](#future-work)
   

## Introduction
### Purpose
The DSL is designed for graphical usage. The main idea is to generate flowcharts by writing basic codes. The current version can render just rectangle on the canvas.

### Scope
This DSL enables users to generate shapes just by writing codes. There is no need to drag and drop the shapes to the canvas. 


## Requirements
In order to develop the DSL from scratch, ANTLR is needed for generating the lexer and parser. Here IntelliJ IDE has been used to view the parse tree. ANTLR has been plugged in to accelerate the workflow. With the help of antlr-13.1.2 jar, many JAVA file hs been generated.


## Grammar Design
### Core Concepts
- **Keywords**: `create`, `move`
- **Operators**: `:`,
- **Syntex**: `ObjectName : action Shape`

### Example Grammar Rules
```
grammar DSL;

// Lexer rules

COLON       : ':';                        // Colon separator
NAME        : [A-Z][a-zA-Z]*;             // Matches object names like MyRect, MyCircle
ACTION      : 'create' ;                // Matches the 'create' action keyword
SHAPE       : 'Rectangle' | 'Circle';  // Matches shapes
WS          : [ \t\r\n]+ -> skip;        // Skip spaces, tabs, and newlines

// Parser rules

program     : statements ;              // The program consists of zero or more statements

statements : statement* ;

statement   : NAME COLON  ACTION  SHAPE  ;
```

## Implementation
### Parser Generator Tool selection
Among the numerous parsers , ANTLR has been chosen because the target language is somwthing that is compatible with JavaScript. As the idea is rendering shapes on the websites.
flex,bison is generally used where the target language is C/C++.  PLY is used for the python. Hence, other options like PEG.js can be considered as parser. Because it is used in Web DSLs, JSON-like language parsing.

### Grammar
The Grammar is of EBNF type.

### Parser and Lexer generation
After formating the grammar rules, it is needed to generate lexer and parser. In order to do that, in the CLI the piece of coded needed to run
```
antlr grammarName.g4
```
This line of code will generate Lexer.java, Parser.java, Visitor.java, Listener.java , BaseVisitor.java, BaseListener.java, Interpreter.java. Then these java files needed to be compiled. In order to do that
```
javac grammarName*.java
```
This line of code will compile all the java files. To run the lexer and parser, it is needed to make a class named "DSLRunner.java". 

### Testing
In this phase, it is needed to make a LexerTest and ParserTest class in Java.

### AST to JSON
In this step, a java class ASTtoJSON is made.This class generated a "output.json" file.

### JSON manipulation
The JSON file is manipulated by JavaScript and an HTML file is made to show the shape on the browser.


## Challenges and  Solutions
It is a challenege to know whether the grammar has been written correctly or not. ANTLR plugin in IntelliJ makes the process very easy. Anyone can view the parse tree in the ANTLR preview of IntelliJ

## Results
The parse tree looks like 

![parseTree](https://github.com/user-attachments/assets/c5e807e5-72c1-47ce-9e6a-42dd1e43f522)


## Future Work
### Shape Introduction
There will be more shape. Diamond, Circle, Arrow.

### Text 
The shape will contain texts

### Canvas, Log, Code box 
The whole output will be shown on the canves in the left side of the website. Log section will be on the right side. The code section will go beneath where the main code will be written.

### Pixel,Color
Pixel and color of each shape and the gap between them will be also integrated



