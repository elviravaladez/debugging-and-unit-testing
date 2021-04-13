# Java Debugging and Unit Testing

This is a repository to document my practice with Debugging and Unit Testing in Java.

## Table of Contents

- [Overview](#overview)
    - [The Objective](#the-objective)
- [My Process](#my-process)
    - [Built With](#built-with)
    - [What I Learned](#what-i-learned)
    - [Continued Development](#continued-development)
- [Author](#author)

## Overview

### The Objective

Understand the fundamentals of debugging and Unit Testing in Java.

## My Process

### Built With

- Java
- [IntelliJ IDEA](https://www.jetbrains.com/help/idea/discover-intellij-idea.html) Debugger
- JUnit

### What I Learned

---

#### Assert Methods in JUnit
* fail()
  * Fails a test with the given failure message or underlying cause

```java
class SampleTest {
  @org.junit.jupiter.api.Test
  public void practiceTest() throws Exception {
      //fail() method example
      fail("This test has yet to be implemented.");
  }
}
```
* assertEquals() / assertNotEquals()
  * To check if two values are equal / not equal

```java
class SampleTest {
  @org.junit.jupiter.api.Test
  public void equalTest() throws Exception {
      //assertEquals() method example
      assertEquals(21, 25);
      //first parameter is the expected value
     //second parameter is the actual value
    //this test would fail because the two parameters are NOT the same
  }

  @org.junit.jupiter.api.Test
  public void notEqualTest() throws Exception {
    //assertEquals() method example
    assertNotEquals(21, 25);
    //first parameter is the expected value
    //second parameter is the actual value
    //this test would pass because the two parameters are NOT the same
  }
  
}
```

* assertTrue() / assertFalse()
  * Asserts that the supplied condition is true or false.

```java
import com.BankAccount;

class SampleTest {
  @org.junit.jupiter.api.Test
  public void trueTest() throws Exception {
    BankAccount account = new BankAccount("John", "Doe", 100.00, BankAccount.checking); //BankAccount.checking represents that the account is a checking account
    assertTrue(account.isChecking());
    //will pass the test because the bank account is a checking account
  }

  @org.junit.jupiter.api.Test
  public void falseTest() throws Exception {
    BankAccount account = new BankAccount("John", "Doe", 100.00, BankAccount.checking); //BankAccount.checking represents that the account is a checking account
    assertFalse(account.isChecking());
    //will NOT pass the test because the bank account is a checking account
  }
}
```

* assertArrayEquals()
  * Verifies the value of an array
      * Compares the lengths and every element in both arrays is in the same order
  * Must be used with arrays because the assertEquals() method only considers two arrays equal if they are the same instance.
* assertNull() / assertNotNull()
  * Checks for null and non-null values
* assertSame() / assertNotSame()
  * Verifies if instances are the exact same instance
  * Compares the object references
* assertThat()
  * Compares the actual value against a range of values

### Continued Development

This section will outline areas that I want to continue focusing on in future projects.


## Author

[Elvira Valadez](https://github.com/elviravaladez)