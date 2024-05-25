# JAVA

## About java

![Alt text](<java image.png>)

1. A sample java code

```java
public class pattern1{
    public static void main(String[] args){
        //square pattern
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                System.out.print("*");
            }
        System.out.println(); //for next line
        }
    }
}
```

---

## [Link to this folder](basic1.java)

# Basic datatypes

| Datatype | Default value | Default size |
| -------- | ------------- | ------------ |
| boolean  | false         | 1 bit        |
| char     | 'u0000'       | 2 byte       |
| byte     | 0             | 1 byte       |
| short    | 0             | 2 byte       |
| int      | 0             | 4 byte       |
| long     | 0L            | 8 byte       |
| float    | 0.0f          | 4 byte       |
| double   | 0.0d          | 8 byte       |

|

## Note

### Why if we declare a float variable in Java we write f as (3.14f)?

Because without the “f” the number would be implicitly created as double. There are things called literals[1] which are helpful to specify the exact data type for a hardcoded number.

## Difference between .compareto() and .equals() function

The 2 main differences are that: equals will take any Object as a parameter, but compareTo will only take Strings. equals only tells you whether they're equal or not, but compareTo gives information on how the Strings compare lexicographically.

### lexicographically

sorted in a way that uses an algorithm based on the alphabetical order used in dictionaries.

![Alt text](<lexicographical order.png>)

## parseInt()

The method parseInt() belongs to the Integer class which is under java. lang package. It is used to parse the string value as a signed decimal value. It is used in Java for converting a string value to an integer by using the method parseInt().

## toString()

The toString() method of the Object class returns the string representation of an object in Java. If we print any object, the Java Compiler internally invokes the toString() method on that object. The value returned by the toString() method is then printed.

ALWAYS REMEMBER : Java Strings are Immutable.

## Types of Synchronization

There are two synchronizations in Java mentioned below:

Process Synchronization
Thread Synchronization

1. Process Synchronization in Java
   Process Synchronization is a technique used to coordinate the execution of multiple processes. It ensures that the shared resources are safe and in order.

2. Thread Synchronization in Java
   Thread Synchronization is used to coordinate and ordering of the execution of the threads in a multi-threaded program. There are two types of thread synchronization are mentioned below:

Mutual Exclusive
Cooperation (Inter-thread communication in Java)
Mutual Exclusive
Mutual Exclusive helps keep threads from interfering with one another while sharing data. There are three types of Mutual Exclusive mentioned below:

1. Synchronized method.
2. Synchronized block.
3. Static synchronization.

## Method referencing
Java provides a new feature called method reference in Java 8. Method reference is used to refer method of functional interface. It is compact and easy form of lambda expression. Each time when you are using lambda expression to just referring a method, you can replace your lambda expression with method reference.
## Types of Method References

There are following types of method references in java:

1. Reference to a static method: _ClassName::staticMethodName_
2. Reference to an instance method of a particular object: _instance::instanceMethodName_
3. Reference to an instance method of an arbitrary object of a particular type: _ClassName::instanceMethodName_
4. Reference to a constructor: _ClassName::new_

The double colon (::) operator, also known as method reference operator in Java, is used to call a method by referring to it with the help of its class directly. They behave exactly as the lambda expressions. The only difference it has from lambda expressions is that this uses direct reference to the method by name instead of providing a delegate to the method.

### Inner class vs Nested class

Inner Classes:

An inner class is a non-static nested class that is defined within another class.
Inner classes have access to the members, including private members, of the outer class.
They are primarily used for logical grouping and enhancing encapsulation.
Inner classes can be instantiated only with an instance of the outer class.
Inner classes can be of four types: member inner class, local inner class, anonymous inner class, and static nested class (though static nested classes are not technically inner classes according to the language specification).

```java
public class OuterClass {
    private int outerField;

    public OuterClass(int outerField) {
        this.outerField = outerField;
    }

    // Inner class
    class InnerClass {
        // code
    }
}
```

Nested Classes:

A nested class is simply any class defined within another class, regardless of whether it is static or non-static.
Nested classes include both inner classes (non-static nested classes) and static nested classes.
They can access static members of the outer class directly, but not non-static members unless they have an instance of the outer class.
Nested classes can be instantiated without an instance of the outer class if they are static.

```java
public class OuterClass {
    private static int outerStaticField;

    // Static nested class
    static class NestedClass {
        // code
    }
}

```
