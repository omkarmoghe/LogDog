# LogDog 🐶
Print collections, numbers, and other objects to Logcat!

Feel free to submit pull requests!

# Building
To use this class in your project, simply download the `LogDog.java` file and add it to your project.

Make sure you add your package name at the top of the file:

`com.yourname.projectname;`

and `import` all necessary classes.

# Usage

The following code:

```java
String[] fruits = {"apple", "banana", "pineapple", "watermelon"};
LogDog.d("MyApplication", fruits);
```
... would generate a Logcat output like this:

`DEBUG/MyApplication(2): [apple, banana, pineapple, watermelon]`

Furthermore, extending the `toString()` method of your classes:

```java
public class MyClass {
  private int number;
  private string word;
  
  public MyClass(int num, String word) {
    this.number = num;
    this.word = word;
  }
  
  public String toString() {
    return "Number: " + this.number + ", Word: " + this.word;
  }
}
```

... will allow you to pass the object itself into the `LogDog.d()` method:

```java
MyClass obj = new MyClass(42, "pineapple");
LogDog.d("MyApplication", obj);
```

... genereating a Logcat output like this:

`DEBUG/MyApplication(2): Number: 42, Word: pineapple`

<b>*WARNING:* LogDog does not check for any `null` parameters so make sure you check for that on your end.</b>

# To do
- Add support for ASSERT, ERROR, INFO, VERBOSE, and WARN
- Add support for Throwables
- Extensive testing (lol)
