# Android-Log-Plus
A class to extend the functionality of the android.util.Log class for printing messages, numbers, and other objects to the LogCat.

Feel free to submit pull requests!

# Usage
To use this class in your project, simply download the `LogPlus.java` file and add it to your project.

Make sure you add your package name at the top of the file:

`com.yourname.projectname;`

and `import` all necessary classes.

Some example calls:

```java
String[] fruits = {"apple", "banana", "pineapple", "watermelon"};
LogPlus.d("MyApplication", fruits);
```
Would generate a LogCat output like this:

`DEBUG/MyApplication(2): [apple, banana, pineapple, watermelon]`

*WARNING:* LogPlus does not check for any `null` parameters so make sure your shit isn't `null`.

# To do
- Add support for ASSERT, ERROR, INFO, VERBOSE, and WARN
- Add support for passing in a Throwable
- Extensive testing lol
