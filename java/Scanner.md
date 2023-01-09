We are going to be looking at a basic but fun Java library called `scanner` ✨

`Scanner` is used to get user input in your program. We used `System.out.println` to output some code onto the terminal window but now we are going to input some information from the outside world into the program.

here is an example on how scanner looks like in code:
```java
Scanner myInput = new Scanner(system.in);

System.out.println("What is your name?");
String name = myInput.next();
System.out.println("Hello" + name + " pleased to meet you")

myInput.close();
```

In the terminal window it will give the prompt of "What is your name?" to the user.
 When you entered your name it will print out (In this case I'm going to be using Mudia) "hello "your-name" please to meet you". And that's the basic program!

Before you use `Scanner` you have to tell java you want to use it:
```java
import java.util.Scanner; //importing the Scanner library

public class scannerProgram;

public static void main(String[] args){
    //code goes here
}
```

Let me break it down:
```java
//create a new variable which holds the scanner object and uses `system.in` to get user input
//note: this only declares a variable to hold the scanner library
Scanner myInput = new Scanner(system.in);

//write a prompt using `myInput.next()` whenever you want something from the user
System.out.println("What is your name?");

//this waits for the user's input as the input is then stored inside the variable. In this case - `name`
//note: this only declares a variable to hold the user's input to be used later
String name = myInput.next();

//This would be a response to user input
System.out.println("Hello" + name + " pleased to meet you")

//always close the scanner object
myInput.close();
```


There are other uses of Scanner. 

1. `myInput.next()` - gives the next thing the user provides. e.g. 
```java
String name = myInput.next()
```
It can hold numbers but only as a string (which can't be used in an equation)

2. `myInput.nextInt()` - gives you a whole number the user provides. 
```java
int age = myInput.nextInt();
```
You can make equations with this as it's an integer

3. `myInput.nextLine()` - gives you a whole line provided by the user including spaces as a String


In summary, `Scanner`✨ can come in handy when making projects that involves the user's input. This is an introduction to getting information or input from the outside world into your program!

