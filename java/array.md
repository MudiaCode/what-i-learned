A list in Java is called a `Array`✨ the items in a list are called objects. I made the mistake of just calling them items but I think it's easier to understand if I did so. My bad...

Anyway a list is formatted like so:

```java
TypeName variableName[]
```

or

```java
TypeName[] variableName
```

The second one is the one we usually use in a Java program. It's more suitable for the programs being written and you will be avoiding an error.

<b><u>Declaring array variable</u></b>

The way you create a variable is like so:

```java
String[] variableName = {"a", "b,", "c"};
```

or can make Java make null objects within an array by specifying how many objects you want with an integer:

```java
String[] variableName = new String[3];
```

Resulting in  `[0, 0, 0]`


<u>Array Indexing</u>
you can grab an object from an array based on its index (where the object is placed in an array) indexing usually starts with the index of 0.

e.g. (using the array from earlier) `a = 0, b = 1, c = 2`.

You can make Java display is by using `System.out`:
```java
System.out.println("variableName[1]")
//it should print b
``` 
To get the last object in an array you can use:

```java
myArray[myArray.length - 1]
```

