# GraphicsDSL version-02
The simplest NPTH script that can be written may look like this

```
canvas(800, 600) {
    rectangle(x=50, y=50, width=200, height=100, color="blue")
    circle(cx=300, cy=150, r=50, color="red")
}ect : create Rectangle
```

The Lexer Rule is :
```
CANVAS: 'canvas';
RECTANGLE: 'rectangle';
CIRCLE: 'circle';
LINE: 'line';
COLOR: 'color';
EQUAL: '=';
NUMBER: [0-9]+;                     
STRING: '"' .*? '"';                
LPAREN: '(';
RPAREN: ')';
COMMA: ',';
LBRACE: '{';
RBRACE: '}';
WS: [ \t\r\n]+ -> skip; 
```

> The lexer rule will tokenize the DSL. Then the token will go to the paarser and generate a parse tree.

The parse rules are :

```
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
```

> The startRuleName of the grammar is prog. The lexer 'CANVAS' will tokenize canvas (which is a keyword of the DSL), and in this way "LPAREN" "NUMBER" "COMMA" "NUMBER" "RPAREN" "LBRACE"  "RBRACE" will tokenize their respective keywords that are described in the lexer rules. They are also called production rules.

> The lexer rules will tokenize the DSL and generate a stream of tokens. The token stream will go to the parser, and they will match the grammar that are defined in the parse rules and make a parse tree if all the syntax are correct.
