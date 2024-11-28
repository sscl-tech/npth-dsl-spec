grammar GraphicsDSL;

// Lexer Rules
CANVAS: 'canvas';
RECTANGLE: 'rectangle';
CIRCLE: 'circle';
LINE: 'line';
COLOR: 'color';
EQUAL: '=';
NUMBER: [0-9]+;                     // Matches integers
STRING: '"' .*? '"';                // Matches strings enclosed in quotes
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
WS: [ \t\r\n]+ -> skip;             // Whitespace is ignored

// Parser Rules
prog: canvas;

canvas: CANVAS LPAREN NUMBER COMMA NUMBER RPAREN LBRACE shapes RBRACE;

shapes: shape*;

shape: rectangle | circle | line;

rectangle: RECTANGLE LPAREN 
           'x' EQUAL NUMBER COMMA 
           'y' EQUAL NUMBER COMMA 
           'width' EQUAL NUMBER COMMA 
           'height' EQUAL NUMBER COMMA 
           COLOR EQUAL STRING RPAREN;

circle: CIRCLE LPAREN 
        'cx' EQUAL NUMBER COMMA 
        'cy' EQUAL NUMBER COMMA 
        'r' EQUAL NUMBER COMMA 
        COLOR EQUAL STRING RPAREN;

line: LINE LPAREN 
      'x1' EQUAL NUMBER COMMA 
      'y1' EQUAL NUMBER COMMA 
      'x2' EQUAL NUMBER COMMA 
      'y2' EQUAL NUMBER COMMA 
      COLOR EQUAL STRING RPAREN;

