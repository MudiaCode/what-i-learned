For loops are used to write the same statement multiple times.

For loops are usually formatted like so:
```java
datatype[] listVariable = {item1, item2, ...};
    for(datatype itemVariable:listVariable){
        instruction
    }
```

In this example I will demonstrate a for loop that will loop through an array (list) to repeat a single statement with the last part of the statement picked from the array:

```java
String[] placeList = {"World", "Brighton", "London"};
    for(String place:placeList){
        System.out.println("Hello " + place)
    }
```

This is how it works:
* The datatype and the name of the list is declared as a variable
* The list (in curly braces) contains 3 items of choice
* The loop body starts from `for` to the closing curly brace
* `place:placeList` means item in list - as seen above the list is named as `placeList` 
* in summary: the brackets in the for loop is the condition given to the for loop which is to select each item in the list 
* it then prints the statement multiple times until it reaches the end of the array
* In the brackets "Hello " is added to the variable `place`.
* the loop will print "Hello " with each item in the list as: "Hello World", "Hello Brighton", "Hello London"
