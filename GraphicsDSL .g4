grammar GraphicsDSL;

// Lexer rules

COLON       : ':';                        // Colon separator
NAME        : [A-Z][a-z]*[A-Z][a-z]*;             // Matches object names like MyRect, MyCircle
ACTION      : 'create' |'delete' | 'move';                // Matches the 'create' action keyword
SHAPE       : 'Rectangle' | 'Circle' | 'Square' | 'Elipse' | 'Diamond';  // Matches shapes
WS          : [ \t\r\n]+ -> skip;        // Skip spaces, tabs, and newlines

// Parser rules

program     : statements ;// The program consists of zero or more statements

statements : statement* ;

statement   : NAME COLON  ACTION  SHAPE  ;   // A statement consists of an object name, a colon, an action, and a shape
