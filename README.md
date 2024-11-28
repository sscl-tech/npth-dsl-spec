# NPTH DSL spec
The simplest NPTH script that can be written may look like this

```
MyRect : create Rectangle
```

This draws a **rectangle**. The rectangle is drawn on a canvas. The canvas is an area where drawings are drawn.

> **_NOTE:_** We have not specified anything about the size of the canvas, nor about where the rectangle will be drawn in the canvas or what shape, color the rectangle will take. This are all defaults that comes from a default Theme.

Back to the simplest code above. NPTH is a simple language where each line is interpreted individually and in the order they appear.

Each line may take only one of a few defined forms. In this case the form is

> *object_name* : `action` `object_type`

You can see *MyRect* is the name of the object we are creating. You can think *MyRect* as a variable. `create` is an action, this is a keyword and there are several (verb) keywords like this. `Rectangle` is another type of keyword, in this case it is a object type and there are several keywords like `Rectangle` like `Circle`, `Ellipse`, `Square`, `Diamond` etc.

You can guess that object type keywords always start with a capital letter and action keywords are always in small letters.
