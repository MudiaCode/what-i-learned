When you want to print something in Java you would need the System to output something to be displayed via the terminal window

the basic syntax to display something is usually: 
```java
System.out.println()
```

In this example I'm going to print "Hello World":

```java
System.out.println("Hello World");
```
You can print multiple lines at the same time:

```java
System.out.println("Hello World");
System.out.println("Hello Brighton");
System.out.println("Hello London");
```

This is not only exclusive to strings. Integers, other data types and even mathematical equations can be displayed:

```java
System.out.println("5+5");
System.out.println("5*10");
System.out.println(true);
```

### key notes
* Java follows the order of operations so make sure to use brackets in equations when needed or it will be taken as face value.
* Dividing an integer by 0 will result in an arithmatic error

