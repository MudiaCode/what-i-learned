A `while loop`✨ is very similar to an (if statement) as they both have a test. This loop will loop through the loop body until the test conditions are met.
They are usually formatted like so:
```java
while (test) {
    //body
}
```
You can read it like this: "while the test is true, run the body again"

If the test is always true then the loop will never end. To make sure the loop ends eventually you would need to make sure:
1. The test has access to at least one variable
2. Make sure the body changes its value of the variable so the test is also changing

This variable is called a `loop variable`.

<u>Ways to end a while loop:</u>
* Changing the value through `user input`
* Changing the value through `calculation`


If you haven't guessed already, changing the value through user input involves the use of the `Scanner`✨ library.
This is code that's meant to let users write multiple names and it's stores in an empty array. Once a user types 'end' the prompt will stop and greet all the users. Pretty cool stuff 😎.

```java
Scanner myInput = newScanner(System.in);
//empty variable to hold multiple user inputs
String nextPerson = "";

System.out.print("What are your names? ")
//stores user inputs in variable
nextPerson = myInput.next();

//While loop will keep prompting users until user types "end". If the input is finally equals to "end" then it will print out the greeting and end the loop.
while (! nextPerson.equals("end")) {
    System.out.println("Hello" + nextPerson + " pleased to meet you");
    //stores user inputs in variable
    nextPerson = myInput.next()
}

```

___
Another way to end the while loop as mentioned before is the use of calculations.

Here is an example: 
```java
int x = 3
while (x > 0){
    System.out.print("Ho! ")
    x = x - 1  //or x--
}
```
Yes, this is a program to write "Ho! Ho! Ho!". `x` holds integers (whole numbers). 

The while loop test if x is greater than 0. If this is true the code will print "Ho! ". This means as long as x is greater than 0 it will keep looping the loop body

Here is the trickier part, as the code loops it will be reduced by 1. So, it loops once it's now 2. It loops again then it's 1. It loops once more then it's 0. After that x is no longer greater than 0 so the loop ends based on the test give - `x > 0`. This is known as a decrement which can also be written as `x--`

Don't forget, as the code loops it print "Ho! ". The end result will be "Ho! Ho! Ho!"

