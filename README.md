# Android-Log-Plus
A class to extend the functionality of the android.util.Log class for printing messages and other objects to the LogCat.

Feel free to submit pull requests!

# Usage
To use this class in your project, simply download the `LogPlus.java` file and add it to your project.

Some example calls:

```java
String[] fruits = {"apple", "banana", "pineapple", "watermelon"};
LogPlus.d("MyApplication", fruits);
```
Would generate a LogCat output like this:

`DEBUG/MyApplication(2): [apple, banana, pineapple, watermelon]`

# To do
- Add support for ASSERT, ERROR, INFO, VERBOSE, and WARN
- Extensive testing lol
