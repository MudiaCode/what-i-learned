I was behind in lectures so I made a method for myself... to learn the content backwards. So now we are going to learn another Java library called `arrayList`✨. It's similar to `Scanner` in terms of layout but it's vastly different in purpose. `arrayList` allows an array to add and remove items. A basic array has limitations like not being able to change it's size afterwards and only being able to change it's index with an integer. With the use of the `arrayList` you should be able to be more flexable with your lists.

This is the layout for `arrayList`:

```JAVA
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // Create an ArrayList of Strings
    ArrayList<String> list = new ArrayList<String>();

    // Add some items to the list
    list.add("apple");
    list.add("banana");
    list.add("orange");

    // Print the list
    System.out.println(list);  // prints [apple, banana, orange]

    // Access an item in the list by its index
    String item = list.get(1);
    System.out.println(item);  // prints "banana"

    // Remove an item from the list
    list.remove(2);

    // Print the list again
    System.out.println(list);  // prints [apple, banana]
  }
}
```

As mentioned before it's very similar to the format of `Scanner`

You can grab, replace, add and remove items from an array easily with `arrayList`

Here is a list of useful arrayList methods:

<b>Note: For an ArrayList of base type E (ArrayList(E)- eg ArrayList(String))</b>

- `size()` - returns the size of `arrayList`
- `get(int i)` - returns the element of the index `i`
- `set(int i, E e)` - sets the element at index `i` to be `e`
- `add(E e)` - add an element to the end of `arrayList`
- `add(int i, E e)` - add(insert) element to be added to the index of `i`
- `remove(E e)` - remove the first occurrence of `e` from the `ArrayList`
- `remove(int i)` - removes element at the index of `i`

<u>Others</u>

- `contains(object o)` - returns true if `arrayList` contains object o (which will be an object of `E`)
- `indexOf(object o)` - searches the `ArrayList` for the first occurrence of `o`, and returns its index if found, or -1 if not found
- `lastIndexOf(object o)` - searches the `ArrayList` for the last occurrence of `o`, and returns its index if found, or-1 if not found
- `sort(Comparator c)` - sorts the `ArrayList` – useful, but a bit advanced

---

`ArrayLists` can be used in an array just like the ar normal `array`:

```java
ArrayList<String> myNames;
    for (String name: myNames){
        System.out.println(name);
    }
```
