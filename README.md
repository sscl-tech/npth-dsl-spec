# Version-01 of NPTH Script
The simplest NPTH script that can be written may look like this

```
MyRect : create Rectangle
```

First it need to write the parser rules for the grammar. Here the grammar starts with `program`. Here `program` is the startRuleName.
The parser rule is following bellow:

````
program     : statement* ;
statement   : NAME COLON  ACTION  SHAPE  ; 
````

The statement consists of name of the shape-object, a colon, an action and the shape of the object. So, "NAME" is a lexical keyword which will tokenize the name of the shape-object. "COLON" is for ':', "ACTION" token stands for the action we want to take for the shape-object. It can be create, move, delete.

The lexical rules for the grammar :
````
COLON       : ':';                        
NAME        : [A-Z][a-zA-Z]*;             
ACTION      : 'create' |'delete' | 'move';               
SHAPE       : 'Rectangle' | 'Circle' | 'Square' | 'Elipse' | 'Diamond';  
WS          : [ \t\r\n]+ -> skip; 
````

Lastly, the general syntax will be :

> *object_name* : `action` `object_type`

You can see *MyRect* is the name of the object we are creating. You can think *MyRect* as a variable. `create` is an action, this is a keyword and there are several (verb) keywords like this. `Rectangle` is another type of keyword, in this case it is a object type and there are several keywords like `Rectangle` like `Circle`, `Elipse`, `Square`, `Diamond` etc.

You can guess that object type keywords always start with a capital letter and action keywords are always in small letters.
