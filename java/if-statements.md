If statements tests whether a test or statement is true or false. Based off the result the statement is given an instruction.

If statements are usually formatted like so:
```java
if (test){
    //instruction if test is true
}
```

The simplest test would test if 2 things are equals to each other. e.g. 1 equals 1 - the test will be true 

looking back at the [[for-loops.md]] file. We can use an if statement inside the for loop to add a string if a place is equals to home (for example). For this to work you would need to make a new variable to make sure that it can be refered back to in the actual if statement. In this case `home` will be a variable for "London" in the array:

```java
String[] placeList = {"World", "Brighton", "London"};
//new variable for if statement
//note: make sure you state which datatype the variable is beforehand
String home = "London"

    for(String place:placeList){
        System.out.println("Hello " + place)

        //if statement will write "home sweet home!" if `home` is equals to "London"
        //the variable for used for comparison will always be in the brackets after equals
        //the `place` variable from `placeList` is used for 'London'
        if (place.equals(home)) { //curly braces means then. So, "if place is equals to home then".
            System.out.println("Home sweet home!")
        }
    }
```

Clean version:
```java
String[] placeList = {"World", "Brighton", "London"};

String home = "London"

    for(String place:placeList){
        System.out.println("Hello " + place)

        if (place.equals(home)) { 
            System.out.println("Home sweet home!")
        }
    }
```

When compiled and executed, it should look like this:
```
Hello London
Home sweet home!
Hello Paris
Hello Brighton
Hello New York
```

___
That's not all for if-statements! There are other styles for different situations. If you want to an instruction for when the test is false you have to use a condition called `else`.
It would be formatted like this:
```java
if (test) {
    //instruction if test is true
} else {
    //instruction if test is false
}
```

Another style is using `else-if`. This is used if you want to make another test based on whether the first test is true or false. It is formatted like so:
```java
if (test1) {
    //instruction if test is true
} else if (test2) {
    //instruction if test is true
} else if (test3) {
    //instruction if test is true
} else {
    //instruction of test is false
}
```

As you can see, you can use `else` with `else if` too ✨.

In summary, this is basic decision making when solving Java problems. There are different ways to do things but the goal is efficiency. Beneficial for the programmer and also someone who wants to read your code.

